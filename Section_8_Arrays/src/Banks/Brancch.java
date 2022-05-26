package Banks;

import java.util.ArrayList;

public class Brancch {
    private String name;
    private ArrayList<Cuxtomer> customers;

    public Brancch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cuxtomer> getCustomers() {
        return customers;
    }

    public boolean newCustomers(String customerName, double initialTransaction){
        Cuxtomer x = findCustomer(customerName);
        if(x == null){
            Cuxtomer e = new Cuxtomer("Ocho");
            this.customers.add(e);
            System.out.println("Customer added successfully");
            return true;
        }System.out.println("Customer record pre-existing");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Cuxtomer e = findCustomer(customerName);
        if(e == null){
            System.out.println("Customer does not exist. No transaction added");
            return false;
        }
        e.addTransactions(transaction);
        System.out.println("Transaction added successfully");
        return true;
    }

    private Cuxtomer findCustomer(String customerName){
        for(int i=0; i<customers.size(); i++){
            Cuxtomer e = customers.get(i);
            if(e.getCustomerName().equals(customerName)){
                return e;
            }
        }
        return null;
    }
}
