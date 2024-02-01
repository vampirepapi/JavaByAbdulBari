package oops.interfaces;

// Define an interface Member with a method callback
interface Member {
    void callback();
}
 
// Define a class Store
class Store{
    // Array to store registered members
    Member members[] = new Member[10];
    // Counter for the number of registered members
    int count = 0;

    // Method to register a member
    void register(Member m){
        // Add the member to the array and increment the counter
        members[count++] = m;
    }

    // Method to invite all registered members to a sale
    void inviteSale(){
        // Loop through all registered members
        for (int i = 0; i < count; i++) {
            // Call the callback method on each member
            members[i].callback();   
        }
    }
}

// Define a class Customer that implements the Member interface
class Customer implements Member{
    // Variable to store the name of the customer
    String name;

    // Constructor for the Customer class
    Customer(String n){
        // Set the name of the customer
        name = n;
    }

    // Implementation of the callback method from the Member interface
    @Override
    public void callback(){
        // Print a message to the console when the callback method is called
        System.out.println("ok, i will visit," + name);
    }
}

// Main class
public class Callback {

    public static void main(String[] args) {
        // Create a new Store object
        Store s = new Store();
        // Create two new Customer objects
        Customer c1 = new Customer("Shubham");
        Customer c2 = new Customer("Sourabh");
    
        // Register the two Customer objects to the Store
        s.register(c1);
        s.register(c2);

        // Invite all registered members to the sale
        s.inviteSale();
    }
}