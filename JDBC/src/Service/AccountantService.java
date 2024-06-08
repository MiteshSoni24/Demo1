package Service;

import Model.Accountant;
import dao.AccountantDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AccountantService {
    private AccountantDAO accountantDAO;

    public AccountantService(Connection connection) {

        accountantDAO = new AccountantDAO(connection);
    }

    public void addAccountant(Accountant accountant) throws SQLException {
        accountantDAO.addAccountant(accountant);
    }

    public void deleteAccountant(int id) throws SQLException {
        accountantDAO.deleteAccountant(id);
    }

    public void updateAccountant(Accountant accountant) throws SQLException {
        accountantDAO.updateAccountant(accountant);
    }

    public List<Accountant> getAllAccountants() throws SQLException {
        return accountantDAO.getAllAccountants();
    }
}