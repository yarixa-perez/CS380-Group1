public class Customer extends Person{
    private int customerNumber;
    private int phoneNumber;
    private String emailAddress;

    /**
     * The constructor for the Customer class
     * @param firstName First name of the customer
     * @param lastName Last name of the customer
     * @param DOB Date of birth of the customer
     * @param customerNumber Customer number of the customer
     * @param phoneNumber Customers phone number
     * @param emailAddress Customers email address
     */
    public Customer(String firstName, String lastName, Date DOB, int customerNumber, int phoneNumber, String emailAddress) {
        super(firstName, lastName, DOB);
        this.customerNumber = customerNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

}
