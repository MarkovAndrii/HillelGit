package lesson24.service;

import lesson24.entity.Status;
import lesson24.util.Database;
import lesson24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientService {

    private String queryGetAll = "SELECT * FROM clients";
    private String queryCreate = "INSERT INTO clients (name, email, phone, about) VALUES (?,?,?,?)";
    private String queryUpdate = "UPDATE clients SET name = ?, email = ?, phone = ?, about = ? WHERE email = ?";
    private String queryDelete = "DELETE FROM clients WHERE id = ?";
    private String queryGetByPhone = "SELECT * FROM clients WHERE phone = ?";
    private String queryGetByIDAccount = "SELECT * FROM clients AS c INNER JOIN accounts a ON c.id = a.client_id";
    private String queryGetByNameMailAlias = """
            SELECT c.name, c.email, s.alias
            FROM clients c
            INNER JOIN client_status cs ON c.id = cs.client_id
            INNER JOIN statuses s ON cs.status_id = s.id WHERE age > 18;
            """;

    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(queryGetAll);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void create(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryCreate)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client, String email) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryUpdate)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setString(5, email);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryDelete)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getByPhone(long clientPhone) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryGetByPhone)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, clientPhone);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                long phone = resultSet.getLong("phone");
                String about = resultSet.getString("about");
                System.out.println(id + " " + name + " " + email + " " + phone + " " + about);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getByIdAccount() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(queryGetByIDAccount);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void getByNameMailAlias() {
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(queryGetByNameMailAlias);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String alias = resultSet.getString("alias");
                System.out.println(name + " " + email + " " + alias);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
