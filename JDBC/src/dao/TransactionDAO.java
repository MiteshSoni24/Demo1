package dao;

import Model.Transaction;
import Utility.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    private Connection connection;

    public TransactionDAO(Connection connection) {
        this.connection = connection;
    }

    public void addTransaction(Transaction transaction) throws SQLException {
        String sql = "INSERT INTO Transaction (customer_id, amount, transaction_type) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, transaction.getCustomerId());
            stmt.setDouble(2, transaction.getAmount());
            stmt.setString(3, transaction.getTransactionType());
            stmt.executeUpdate();
        }
    }

    public List<Transaction> getAllTransactions() throws SQLException {
        List<Transaction> transactions = new ArrayList<>();
        String sql = "SELECT * FROM Transaction";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Transaction transaction = new Transaction();
                transaction.setId(rs.getInt("id"));
                transaction.setCustomerId(rs.getInt("customer_id"));
                transaction.setAmount(rs.getDouble("amount"));
                transaction.setTransactionType(rs.getString("transaction_type"));
                transaction.setTransactionDate(rs.getTimestamp("transaction_date"));
                transactions.add(transaction);
            }
        }
        return transactions;
    }

    public void updateTransaction(Transaction transaction) throws SQLException {
       // String sql = "UPDATE transaction SET customer_id = ?, amount = ?, transaction_type= ?, transaction_date= ? WHERE id = ?";
        String sql = "UPDATE transaction SET customer_id = ?, amount = ?, transaction_type= ? WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, transaction.getCustomerId());
            stmt.setDouble(2, transaction.getAmount());
            stmt.setString(3, transaction.getTransactionType());
           // stmt.setTimestamp(4, transaction.getTransactionDate());
            stmt.setInt(4, transaction.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteTransaction(int id) throws SQLException {
        String sql = "DELETE FROM Transaction WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }

    }
}


