package Banks;

import Banking.Customer;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Brancch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchName){
        Brancch x = findBranch(branchName);
        if(x != null){
            System.out.println("Branch already exists");
            return false;
        }
        Brancch bankBranch = new Brancch(branchName);
        branches.add(bankBranch);
        System.out.println("Bank branch successufully added.");
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Brancch x = findBranch(branchName);
        if(x==null){
            System.out.println("No branch found");
            return false;
        }
        return true;
    }
    public boolean addCustomerTransaction(String nameOfBank, String customerName, double transaction){

        return false;
    }

    public Brancch findBranch(String branchName){
        for(int i= 0; i<this.branches.size(); i++){
            if(this.branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        System.out.println("Branch doesn't exist here");
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Brancch b = findBranch(branchName);
        if(b == null){
            System.out.println("Branch " + branchName + " not found");
            return false;
        }
        System.out.println("Hurray, branch exists.");
        if(!printTransactions){
            System.out.println("Bank customers ---------");
            for(int i=0; i<b.getCustomers().size(); i++){
                System.out.println((i+1) +". " + b.getCustomers().get(i).getCustomerName());
            }
        } else{
            System.out.println("Brank customers and their transactions ");
            for(int i=0; i<b.getCustomers().size(); i++){
                System.out.println((i+1) +". " + b.getCustomers().get(i).getCustomerName());
                for(int j=0; j<b.getCustomers().get(i).getTransactions().size(); j++){
                    System.out.println("\t"+ (j+1) + ". " + b.getCustomers().get(i).getTransactions().get(j));
                }
            }
        }
        return true;
    }
}

