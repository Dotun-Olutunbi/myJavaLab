public class main_holder {
    public static void main(String[] args) {
       double x = speedConverter.toMilesPerHour(22);
        System.out.println(x);
        speedConverter.printConversion(1.5);
        speedConverter.printConversion(10.25);
        speedConverter.printConversion(-1.5);
        System.out.println("--------------");
        megaByteConverter.printMegaBytesAndKiloBytes(2300);
        megaByteConverter.printMegaBytesAndKiloBytes(450);
        System.out.println("---------------------");
        boolean y = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(y);
        y = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(y);
        y = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(y);
        y = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(y);
     System.out.println("--------------------");
       y =   leapYearCalculator.isLeapYear(1700);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(1800);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(1900);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2100);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2200);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2300);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2500);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2600);
     System.out.println(y);
     System.out.println("------------------------");
     y =   leapYearCalculator.isLeapYear(1600);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2000);
     System.out.println(y);
     y =   leapYearCalculator.isLeapYear(2400);
     System.out.println(y);
     System.out.println("----------Decimal Comparator -------------");
     y = DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175);
     System.out.println(y);
     y = DecimalComparator.areEqualbyThreeDecimalPlaces(3.175, 3.176);
     System.out.println(y);
     y = DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0);
     System.out.println(y);
     System.out.println("-------CLASSES SECTION--------");
     Car myCar = new Car();
     myCar.setDoors(4);
     myCar.setModel("M. Benz");
     myCar.setMake("W184");
     System.out.println(myCar.getModel());
     myCar.changeGear();
     System.out.println(myCar.getGearState());
     myCar.changeGear();
     System.out.println(myCar.getGearState());
     myCar.moving();
     myCar.steering(true);
     System.out.println();
     System.out.println("=========Bank Account Check=================");
     BankAccount myBankAccount = new BankAccount();
     myBankAccount.setBalance(20000);
     myBankAccount.withdrawFunds(60000);
     myBankAccount.makeDeposit(40000);
     myBankAccount.withdrawFunds(-333);
     myBankAccount.withdrawFunds(60000);
     System.out.println("========VipCustomer===========");
     VipCustomer vipOne = new VipCustomer();
     System.out.println(vipOne.getName());
     VipCustomer vipTwo = new VipCustomer("Ocho",25000);
     System.out.println(vipTwo.getName());
     VipCustomer vipThree = new VipCustomer("Ocho yokutu", 27000, "ochoyokutu@gmail.com");
     System.out.println(vipThree.getName());
    }

}
