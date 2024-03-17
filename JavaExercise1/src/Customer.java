//****************************************************************************************//
/*Create a Customer class having below details-
Class Name: Customer

Attributes:
● customerId: int
● firstName: String
● lastName: String
● email: String
Methods:
        +getCustomerId(): int
+setCustomerId(customerId: int): void
+getFirstName(): String
+setFirstName(firstName: String): void
+getLastName(): String
+setLastName(lastName: String): void
+getEmail(): String
+setEmail(email: String): void
+display(): void

Create 3 customer objects and display their details by appropriate methods.*/
//**************************************************************************************//


public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;
    private String email;


    public Customer(int customerID, String firstName, String lastName, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Customer obj1 = new Customer(1,"Deepak","Soam", "deepak@gmail.com");
        Customer obj2 = new Customer(2,"Ravi","Pratap", "ravi@gmail.com");
        Customer obj3 = new Customer(3,"Manish","Thakur", "manish@gmail.com");

        System.out.println("Details of Object 1 ->>" + obj1.toString());
        System.out.println("Details of Object 2 ->>" + obj2.toString());
        System.out.println("Details of Object 3 ->>" + obj3.toString());

    }
}
