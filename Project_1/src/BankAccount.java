public class BankAccount {
    private int account_number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccount_number(int account_number1){
        account_number = account_number1;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAccount_number(){
        return account_number;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void makeDeposit(double depositAmount){
        if(depositAmount < 0) {
            System.out.println("Invalid Sum");
        }else{
            balance += depositAmount;
        }
        System.out.println("Available balance: " + balance);
    }
    public void withdrawFunds(double withdrawAmount){
        if(withdrawAmount < 0){
            System.out.println("Invalid amount");
        }else if(balance < withdrawAmount){
            System.out.println("Insufficient funds");
        }else{
            balance -= withdrawAmount;
        }
        System.out.println("Your balance is " + balance);
    }
}
