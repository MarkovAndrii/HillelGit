package lesson24.service;

import lesson24.entity.Account;
import lesson24.entity.Status;
import lesson24.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private String queryGetAll = "SELECT * FROM accounts";
    private String queryCreate = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private String queryUpdate = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE number = ?";
    private String queryDelete = "DELETE FROM accounts WHERE number = ?";
    private String queryGetNumber = "SELECT number FROM accounts WHERE value > ?";

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(queryGetAll);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClientId(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getFloat("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void create(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryCreate)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setFloat(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account, String number) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryUpdate)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setFloat(3, account.getValue());
            preparedStatement.setString(4, number);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String number) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryDelete)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, number);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getByNumber(double value) {
        String number = null;
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryGetNumber)) {
            connection.setAutoCommit(false);
            preparedStatement.setDouble(1, value);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                number = resultSet.getString("number");
                System.out.println(number);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return number;
    }
}
