package cs380group1.sandwich_shop;

import java.time.LocalDate;
public class Customer extends Person{
    private int customerNumber;
    private String phoneNumber;
    private String emailAddress;
    private String accountPass;

    /**
     * The constructor for the Customer class
     * @param firstName First name of the customer
     * @param lastName Last name of the customer
     * @param DOB Date of birth of the customer
     * @param customerNumber Customer number of the customer
     * @param phoneNumber Customers phone number
     * @param emailAddress Customers email address
     */
    public Customer(String firstName, String lastName, LocalDate DOB, int customerNumber, String phoneNumber, String emailAddress, String accountPass) {
        super(firstName, lastName, DOB);
        this.customerNumber = customerNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.accountPass = accountPass;
    }

    public Customer() {

    }

    public int getCustNum(){
        return customerNumber;
    }
    public void setCustNum(int customerNumber){
        this.customerNumber = customerNumber;
    }
    public String getPhoneNum(){
        return phoneNumber;
    }
    public void setPhoneNum(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return emailAddress;
    }
    public void setEmail(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getPass(){
        return accountPass;
    }
    public void setPass(String accountPass){
        this.accountPass = accountPass;
    }
    public String toString(){
        return "Name: " + firstName + " " + lastName + " " +
                "DOB: " + DOB + " " +
                "Customer Number: " + customerNumber + " " +
                "Phone Number: " + phoneNumber + " " +
                "Email Address: " + emailAddress + " " +
                "Account Password: " + accountPass;
    }
}
