package Service;

import Model.Transaction;
import dao.TransactionDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TransactionService {
    private TransactionDAO transactionDAO;

    public TransactionService(Connection connection) {

        transactionDAO = new TransactionDAO(connection);
    }

    public void addTransaction(Transaction transaction) throws SQLException {
        transactionDAO.addTransaction(transaction);
    }

    public void updateTransaction(Transaction transaction) throws SQLException {
        transactionDAO.updateTransaction(transaction);
    }

    public void deleteTransaction(int id) throws SQLException {
        transactionDAO.deleteTransaction(id);
    }

    public List<Transaction> getAllTransactions() throws SQLException {
        return transactionDAO.getAllTransactions();
    }

}
