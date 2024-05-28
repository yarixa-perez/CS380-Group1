import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String URL = "";
    private static final String user = "";
    private static final String pass = "";

    /**
     * Method to connect to the database
     * @return
     */
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, user, pass);
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println("Exception" + e.getMessage());
        }
        return null;
    }

    /**
     * Method to add an employee to the database
     * @param firstName
     * @param lastName
     * @param DOB
     * @param employeeNumber
     * @param position
     * @param wage
     * @param hoursWorked
     */
    public void addEmployee(String firstName, String lastName, LocalDate DOB,
                            int employeeNumber, String position, float wage, int hoursWorked){
        String query = "INSERT INTO employee (firstName, lastName, employeeNumber, salary, hoursWorked, DOB, position) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, String.valueOf(employeeNumber));
            statement.setFloat(4, wage);
            statement.setInt(5, hoursWorked);
            statement.setDate(6, Date.valueOf(DOB));
            statement.setString(7, position);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to retrieve an employee from the database
     * @param employeeNumber
     * @return employee with specified employee number
     */
    public Employee retrieveEmployee(int employeeNumber){
        String query = "SELECT * FROM employee WHERE employeeID = ?";
        Employee employee = new Employee();
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, employeeNumber);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                employee.setFirst(result.getString("firstName"));
                employee.setLast(result.getString("lastName"));
                employee.setEmployeeNum(result.getInt("employeeID"));
                employee.setDOB(result.getDate("DOB").toLocalDate());
                employee.setPosition(result.getString("position"));
                employee.setWage(result.getFloat("salary"));
                return employee;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
    }

    /**
     * Method to get a list of all employees stored in the database
     * @return employee list
     */
    public List<Employee> retrieveAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employee";
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(query)){
             while (result.next()){
                 Employee employee = new Employee();
                 employee.setFirst(result.getString("firstName"));
                 employee.setLast(result.getString("lastName"));
                 employee.setEmployeeNum(result.getInt("employeeID"));
                 employee.setDOB(result.getDate("DOB").toLocalDate());
                 employee.setPosition(result.getString("position"));
                 employee.setWage(result.getFloat("salary"));
                 employees.add(employee);
             }
        }catch (SQLException e) {
            e.printStackTrace();
        }
            return employees;
    }

    /**
     * Method to remove an employee with a specified employee number from the database
     * @param employeeNumber
     */
    public void removeEmployee(int employeeNumber){
        String query = "DELETE FROM employee WHERE employeeID = ?";
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, employeeNumber);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method to add a customer to the database
     * @param firstName
     * @param lastName
     * @param DOB
     * @param customerNumber
     * @param phoneNumber
     * @param emailAddress
     * @param accountPass
     */
    public void addCustomer(String firstName, String lastName, LocalDate DOB,
                            int customerNumber, String phoneNumber, String emailAddress, String accountPass){
        String query = "INSERT INTO customer(firstName, lastName, email, accountPass, customerNumber, phoneNumber, DOB) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, emailAddress);
            statement.setString(4, accountPass);
            statement.setInt(5, customerNumber);
            statement.setString(6, phoneNumber);
            statement.setDate(7, Date.valueOf(DOB));
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to retrieve a customer from the database
     * @param customerNumber
     * @return customer with specified customer number
     */
    public Customer retrieveCustomer(int customerNumber){
        String query = "SELECT * FROM customer WHERE custID = ?";
        Customer customer = new Customer();
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, customerNumber);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                customer.setFirst(result.getString("firstName"));
                customer.setLast(result.getString("lastName"));
                customer.setCustNum(result.getInt("custID"));
                customer.setDOB(result.getDate("DOB").toLocalDate());
                customer.setEmail(result.getString("email"));
                customer.setPhoneNum(result.getString("phoneNum"));
                customer.setPass(result.getString("accountPass"));
                return customer;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method to get a list of all customers stored in the database
     * @return customer list
     */
    public List<Customer> retrieveAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM customer";
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(query)){
            while (result.next()){
                Customer customer = new Customer();
                customer.setFirst(result.getString("firstName"));
                customer.setLast(result.getString("lastName"));
                customer.setCustNum(result.getInt("custID"));
                customer.setDOB(result.getDate("DOB").toLocalDate());
                customer.setEmail(result.getString("email"));
                customer.setPhoneNum(result.getString("phoneNum"));
                customer.setPass(result.getString("accountPass"));
                customers.add(customer);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    /**
     * Method to remove a customer with a specified customer number from the database
     * @param customerNumber
     */
    public void removeCustomer(int customerNumber){
        String query = "DELETE FROM customer WHERE custID = ?";
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, customerNumber);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to add a product to the database
     * @param itemName
     * @param itemNum
     * @param itemType
     * @param price
     * @param available
     * @param description
     */
    public void addProduct(String itemName, int itemNum, String itemType, float price, boolean available, String description){
        String query = "INSERT INTO mainmenu(itemName, itemNum, itemType, price, inStock, description) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, itemName);
            statement.setInt(2, itemNum);
            statement.setString(3, itemType);
            statement.setFloat(4, price);
            statement.setBoolean(5, available);
            statement.setString(6, description);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to add a customers order to the database
     * @param customerNumber
     * @param orderNumber
     * @param orderDate
     * @param total
     * @param employeeNumber
     */
    public void addOrder(int customerNumber, int orderNumber, LocalDate orderDate, float total, int employeeNumber){
        String query = "INSERT INTO orders(custID, orderNum, orderDate, orderTotal, orderTakerID) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, customerNumber);
            statement.setInt(2, orderNumber);
            statement.setDate(3, Date.valueOf(orderDate));
            statement.setFloat(4, total);
            statement.setInt(5, employeeNumber);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}

