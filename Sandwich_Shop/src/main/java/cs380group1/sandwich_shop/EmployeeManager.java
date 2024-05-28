package cs380group1.sandwich_shop;

import java.util.*;
public class EmployeeManager {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    public EmployeeManager(){
    }

    /**
     * Method to add an employee to the list
     * @param employee The employee to be added to the list
     */
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    /**
     * Method to remove an employee from the list
     * @param employee The employee to be removed
     */
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    /**
     * Method to get the employee with a specific employee number
     * @param employeeNumber Employee number to search employee list for
     * @return Employee that has the specified employee number
     */
    public Employee getEmployee(int employeeNumber){
        Employee foundEmployee = null;
        for(Employee employee : employeeList){
            if(employee.getEmployeeNum() == employeeNumber){
                foundEmployee = employee;
                return foundEmployee;
            }
        }
        return foundEmployee;
    }
}
