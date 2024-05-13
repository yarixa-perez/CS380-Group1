public class Person {
    protected String firstName;
    protected String lastName;
    protected Date DOB;

    /**
     * Person class constructor
     * @param firstName
     * @param lastName
     * @param DOB
     */
    public Person(String firstName, String lastName, Date DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }
    public String getInfo(){
        return "Person Information: \nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nDOB: " + DOB;
    }
}
class Date{}