package lesson24.service;

import lesson24.entity.Client;
import lesson24.entity.Status;
import lesson24.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {

    private String queryGetAll = "SELECT * FROM statuses";
    private String queryCreate = "INSERT INTO statuses (alias, description) VALUES (?,?)";
    private String queryUpdate = "UPDATE statuses SET alias = ?, description = ? WHERE alias = ?";
    private String queryDelete = "DELETE FROM statuses WHERE id = ?";

    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(queryGetAll);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void create(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryCreate)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status status, String alias) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryUpdate)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.setString(3, alias);
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
}
