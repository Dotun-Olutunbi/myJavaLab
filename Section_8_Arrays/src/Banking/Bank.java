package Banking;

import java.util.ArrayList;

public class Bank {
    private String location;
    private ArrayList<Customer> customers;

    public Bank(String location) {
        this.location = location;
        this.customers = new ArrayList<Customer>();
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, Bank domiciledBranch, double initialTransaction){
        for(int i= 0; i<customers.size(); i++){
            if(customers.get(i).getCustomerName().equals(name)){
                System.out.println("Customer: " + name + " already exists");
                return false;
            }
        }
        Customer e = Customer.newCustomer(name, domiciledBranch, initialTransaction);
        customers.add(e);
        return true;
    }

    public boolean addCustomer(Customer customer){
        String name = customer.getCustomerName();
        for(int i= 0; i<customers.size(); i++){
            if(customers.get(i).getCustomerName().equals(name)){
                System.out.println("Customer: " +  " already exists");
                return false;
            }
        }
        customers.add(customer);
        return true;
    }

    public void customerTransactions(String customerName){
        for(int i=0; i<customers.size(); i++){
            Customer customer_x = customers.get(i);
            if(customerName.equals(customer_x.getCustomerName())){
                System.out.println("****************");
                System.out.println((customerName) +" Transaction history");
                ArrayList<Double> one_transaction = customer_x.getTransactions();
                for(int j = 0; j<one_transaction.size(); j++){
                    if(one_transaction.get(j)>0){
                        System.out.println((j+1) + ". Deposit of "+ one_transaction.get(j));
                    }else{
                        System.out.println((j+1) + ". Withdrawal of "+ -one_transaction.get(j));
                    }
                }
                System.out.println("-----------------");
                System.out.println("Balance: " + customer_x.getBalance());
                System.out.println(customer_x.getBranchDomiciled().getLocation());
                System.out.println("===================");
            }else{
            System.out.println(customerName + " is not a customr of this bank ");
            }
        }
    }
}

