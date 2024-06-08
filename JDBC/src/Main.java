import Model.Accountant;
import Model.Customer;
import Model.Transaction;
import Service.AccountantService;
import Service.CustomerService;
import Service.TransactionService;
import Utility.DBUtil;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private AccountantService accountantService;
    private CustomerService customerService;
    private TransactionService transactionService;
    private Scanner scanner;

    public static void main(String[] args) throws SQLException {
        Main main = new Main();
        main.run();
    }

    public Main() throws SQLException {
        accountantService = new AccountantService(DBUtil.getConnection());
        customerService = new CustomerService(DBUtil.getConnection());
        transactionService = new TransactionService(DBUtil.getConnection());
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        addAccountant();
                        break;
                    case 2:
                        getAllAccountants();
                        break;
                    case 3:
                        updateAccountant();
                        break;
                    case 4:
                        deleteAccountant();
                        break;
                    case 5:
                        addCustomer();
                        break;
                    case 6:
                        getAllCustomer();
                        break;
                    case 7:
                        updateCustomer();
                        break;
                    case 8:
                        deleteCustomer();
                        break;
                    case 9:
                        addTransaction();
                        break;
                    case 10:
                        getAllTransaction();
                        break;
                    case 11:
                        updateTransaction();
                        break;
                    case 12:
                        deleteTransaction();
                        break;
                    case 13:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println("\n                   ---- Online Banking System ----                     \n");
        System.out.println("    Accountant:    "+"             Customer:"+"                 Transaction:");
        System.out.println("1. Add Accountant"+"           5. Add Customer"+"            9. Add Transaction");
        System.out.println("2. View All Accountant"+"      6. View All Customer"+"      10. View All Transaction");
        System.out.println("3. Update Accountant"+"        7. Update Customer"+"        11. Update Transaction");
        System.out.println("4. Delete Accountant"+"        8. Delete Customer"+"        12. Delete Transaction");
        System.out.println("                            ----- 13. Exit-----");
        System.out.println();
        System.out.print("Enter your choice: ");
    }
//*******************************************************
    private void addAccountant() throws SQLException {
        System.out.print("Enter Accountant name: ");
        String accountantName = scanner.nextLine();
        System.out.print("Enter Accountant email: ");
        String accountantEmail = scanner.nextLine();
        System.out.print("Enter Accountant password: ");
        String accountantPassword = scanner.nextLine();
        Accountant accountant = new Accountant();
        accountant.setName(accountantName);
        accountant.setEmail(accountantEmail);
        accountant.setPassword(accountantPassword);
        accountantService.addAccountant(accountant);
        System.out.println("Accountant added successfully.");
        System.out.println();
    }

    private void getAllAccountants() throws SQLException {
        List<Accountant> accountants = accountantService.getAllAccountants();
        for (Accountant acc : accountants) {
            System.out.println(acc);
        }
        System.out.println();
    }

    private void updateAccountant() throws SQLException {
        System.out.print("Enter Accountant ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter new Password: ");
        String password = scanner.nextLine();

        Accountant accountant = new Accountant();
        accountant.setName(name);
        accountant.setEmail(email);
        accountant.setPassword(password);
        accountant.setId(id);

        accountantService.updateAccountant(accountant);
        System.out.println("Accountant updated successfully!");
        System.out.println();
    }

    private void deleteAccountant() throws SQLException {
        System.out.print("Enter Accountant ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        accountantService.deleteAccountant(id);
        System.out.println("Accountant deleted successfully!");
    }
//*******************************************************
    private void addCustomer() throws SQLException {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setEmail(customerEmail);
        customer.setBalance(balance);

        customerService.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    private void getAllCustomer() throws SQLException {
        List<Customer> customers = customerService.getAllCustomers();
        for (Customer cust : customers) {
            System.out.println(cust);
        }
        System.out.println();
    }

    private void updateCustomer() throws SQLException {
        System.out.print("Enter Customer ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter new Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setBalance(balance);
        customer.setId(id);

        customerService.updateCustomer(customer);
        System.out.println("Customer updated successfully!");
        System.out.println();
    }

    private void deleteCustomer() throws SQLException {
        System.out.print("Enter Customer ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        customerService.deleteCustomer(id);
        System.out.println("Customer deleted successfully!");
    }
//*************************************************************
    private void addTransaction() throws SQLException {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter transaction type (credit/debit): ");
        String transactionType = scanner.nextLine();

        Transaction transaction = new Transaction();
        transaction.setCustomerId(customerId);
        transaction.setAmount(amount);
        transaction.setTransactionType(transactionType);

        transactionService.addTransaction(transaction);
        System.out.println("Transaction added successfully.");
        System.out.println();
    }

    private void getAllTransaction() throws SQLException {
        List<Transaction> transactions = transactionService.getAllTransactions();
        for (Transaction trans : transactions) {
            System.out.println(trans);
        }
        System.out.println();
    }

    private void updateTransaction() throws SQLException {
        System.out.print("Enter Transaction ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new Customer ID: ");
        int customerID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter new Transaction_Type: ");
        String transaction_type = scanner.nextLine();

        Transaction transaction = new Transaction();
        transaction.setCustomerId(customerID);
        transaction.setAmount(amount);
        transaction.setTransactionType(transaction_type);
        transaction.setId(id);

        transactionService.updateTransaction(transaction);
        System.out.println("Transaction updated successfully!");
        System.out.println();
    }

    private void deleteTransaction() throws SQLException {
        System.out.print("Enter Transaction ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        transactionService.deleteTransaction(id);
        System.out.println("Transaction deleted successfully!");
    }


}



