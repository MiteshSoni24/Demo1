package dao;

import Model.Accountant;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Utility.DBUtil;

public class AccountantDAO {
    private Connection connection;

    public AccountantDAO(Connection connection) {
        this.connection = connection;
    }

    public void addAccountant(Accountant accountant) throws SQLException {
        String sql = "INSERT INTO Accountant (name, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, accountant.getName());
            stmt.setString(2, accountant.getEmail());
            stmt.setString(3, accountant.getPassword());
            stmt.executeUpdate();
        }
    }

    public List<Accountant> getAllAccountants() throws SQLException {
        List<Accountant> accountants = new ArrayList<>();
        String sql = "SELECT * FROM Accountant";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Accountant accountant = new Accountant();
                accountant.setId(rs.getInt("id"));
                accountant.setName(rs.getString("name"));
                accountant.setEmail(rs.getString("email"));
                accountant.setPassword(rs.getString("password"));
                accountants.add(accountant);
            }
        }
        return accountants;
    }

    public void updateAccountant(Accountant accountant) throws SQLException {
        String sql = "UPDATE Accountant SET name = ?, email = ?, password = ? WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, accountant.getName());
            stmt.setString(2, accountant.getEmail());
            stmt.setString(3, accountant.getPassword());
            stmt.setInt(4, accountant.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteAccountant(int id) throws SQLException {
        String sql = "DELETE FROM Accountant WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }

    }
}

