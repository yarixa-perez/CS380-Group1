package cs380group1.sandwich_shop;

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

    public Person() {

    }

    public String getFirst(){
        return firstName;
    }
    public void setFirst(String firstName){
        this.firstName = firstName;
    }
    public String getLast(){
        return lastName;
    }
    public void setLast(String lastName){
        this.lastName = lastName;
    }
    public LocalDate getDOB(){
        return DOB;
    }
    public void setDOB(LocalDate DOB){
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
