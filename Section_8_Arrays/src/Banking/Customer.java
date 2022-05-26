package Banking;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private Bank branchDomiciled;
    private double balance;
    private ArrayList<Double> transactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        this.balance = 0.0;
        this.branchDomiciled = headBranch;
    }

    public Customer(String customerName, Bank branchDomiciled) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        this.balance = 0.0;
        this.branchDomiciled = branchDomiciled;

    }

    public Bank getBranchDomiciled() {
        return branchDomiciled;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public double getBalance (){
        balance = 0.0;
        for(int i = 0; i<this.transactions.size(); i++){
            balance += this.transactions.get(i);
        }
        return balance;
    }

    public boolean withdrawal(double amount){
        if(this.getBalance() >= amount){
            System.out.println(-amount);
            this.transactions.add(-amount);
            System.out.println("Successful transaction. You have withdrawn N" + amount);
            return true;
        }
        System.out.println("Failed transaction. Insufficient fund. You have a balance of N" + amount);
        return false;
    }

    public boolean deposit(double amount){
        System.out.println(amount);
        if(amount<0){
            System.out.println("Failed transaction. Wrong value");
            return false;
        }
        this.transactions.add(amount);
        System.out.println("Successful transaction. You deposited N" + amount);
        return true;
    }

    public static Customer newCustomer(String name, Bank bankBranch, double initTransaction){
        //only the bank class should call this to create new customers.
        Customer customer_x = new Customer(name, bankBranch);
        customer_x.transactions.add(initTransaction);
        System.out.println(customer_x.transactions.get(0));
        return customer_x;
    }

    private Bank headBranch = new Bank("Lagos Island");
}
