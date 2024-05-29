package cs380group1.sandwich_shop;

import java.util.*;
public class EmployeeManager {
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();
    public EmployeeManager() {

    }

    /**
     * Method to add an employee to the list
     * @param employee The employee to be added to the list
     */
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeNum(), employee);
    }

    /**
     * Method to remove an employee from the list
     * @param employee The employee to be removed
     */
    public void removeEmployee(Employee employee) {
        employeeMap.remove(employee.getEmployeeNum());
    }

    /**
     * Method to get the employee with a specific employee number
     * @param employeeNumber Employee number to search employee list for
     * @return Employee that has the specified employee number
     */
    public Employee getEmployee(int employeeNumber) {
        return employeeMap.get(employeeNumber);
    }

    public boolean doesEmployeeExist(int employeeNumber) {
        return employeeMap.get(employeeNumber) == null ? false : true;
    }
}
