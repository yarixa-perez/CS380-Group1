import java.time.LocalDate;
public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate DOB;

    /**
     * Person class constructor
     * @param firstName
     * @param lastName
     * @param DOB
     */
    public Person(String firstName, String lastName, LocalDate DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    /**
     * Method to return a persons information as a string
     * @return Person information
     */
    public String getInfo(){
        return "Person Information: \nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nDOB: " + DOB;
    }
}
