public class Employee extends Person{
    protected int employeeNumber;
    protected String position;
    protected float wage;

    /**
     * The constructor for the employee class
     * @param firstName First name of the employee
     * @param lastName Last name of the employee
     * @param DOB Date of birth of the employee
     * @param employeeNumber Employee number of the employee
     * @param position Position of the employee
     * @param wage Employees wage
     */
    public Employee(String firstName, String lastName, Date DOB, int employeeNumber, String position, float wage) {
        super(firstName, lastName, DOB);
        this.employeeNumber = employeeNumber;
        this.position = position;
        this.wage = wage;
    }
    public int getEmployeeNum(){
        return employeeNumber;
    }
}
