package Banks;

import java.util.ArrayList;

public class Cuxtomer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Cuxtomer(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double transaction){
        this.transactions.add(transaction);
    }
}
