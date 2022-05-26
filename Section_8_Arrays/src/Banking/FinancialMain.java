package Banking;

public class FinancialMain {
    public static void main(String[] args) {
        Bank gtb_Okelewo = new Bank("Okelewo");
        Bank gtb_Okelewo2 = new Bank("Simeon Adebo");
        Bank gtb_Mokola = new Bank("Mokola");

        Customer customer_1233 = Customer.newCustomer("Dotun Olutunbi", gtb_Mokola, 1000);
      Customer customer_2020 = Customer.newCustomer("Ocho Yokutu", gtb_Mokola, 2000);
      gtb_Mokola.addCustomer("Shina Peters", gtb_Mokola,3000);
        System.out.println(gtb_Mokola.getCustomers().get(0).getCustomerName());
        gtb_Mokola.addCustomer("Shina Peters", gtb_Mokola,3000);
        gtb_Mokola.addCustomer("Ocho Yokutu", gtb_Mokola, 2000);
        gtb_Mokola.addCustomer(customer_1233);
        System.out.println("-------------Hey wait here------------");
        customer_1233.deposit(3000);
        System.out.println("-------------------------");
        customer_1233.deposit(4993);
        customer_1233.deposit(-22);
        double x = customer_1233.getBalance();
        System.out.println(x);
        Customer Dotun = customer_1233;
        customer_1233.withdrawal(500);
        customer_1233.withdrawal(1000);
        System.out.println(customer_1233.getTransactions().size());
        x = customer_1233.getBalance();
        System.out.println(x);
        customer_1233.deposit(10000);
        System.out.println(customer_1233.getBalance());
        customer_1233.withdrawal(5000);
        System.out.println(customer_1233.getBalance());
        System.out.println(customer_1233.getBranchDomiciled().getCustomers());
        gtb_Mokola.customerTransactions("Dotun Olutunbi");
    }
}
