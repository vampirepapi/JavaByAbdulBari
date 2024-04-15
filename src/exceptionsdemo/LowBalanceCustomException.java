package exceptionsdemo;
// we can create our own exception by extending Exception class
public class LowBalanceCustomException extends Exception{
    //here if the balance is low than 1000, then we will throw an exception
    //this is a checked exception so it will throw an error at compile time
    //we will override the toString method to print the message
    @Override
    public String toString() {
        return "balance is lower than 1000, please deposit some money to proceed further";
    }
    public static void main(String[] args) {
        int balance = 500;
        try{
            if(balance<1000){
                throw new LowBalanceCustomException();
            }
            else{
                System.out.println("balance is greater than 1000");
            }
        }
        catch(LowBalanceCustomException e){
            System.out.println(e);
        }

    }

    
}
