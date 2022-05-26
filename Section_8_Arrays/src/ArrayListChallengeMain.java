import java.util.Scanner;

public class ArrayListChallengeMain {
    public static Scanner scanner = new Scanner(System.in);

    public static MobilePhone RedmiNote10 = new MobilePhone();

    public static String name;
    public static Contact contact;

    public static void main(String[] args) {
        String choice;
        menu();
        do{

            choice = scanner.nextLine();
            switch(choice){
                case "a":
                    addContact();
                    break;
                case "d":
                    deleteContact();
                    break;
                case "m":
                    modifyContact();
                    break;
                case "s":
                    searchContact();
                    break;
                case "l":
                    listAllContact();
                    break;
                case "r":
                    menu();
                    break;
                default:
                    System.out.println("Check your input.");
                    menu();
            }
        }while(!choice.equals("q"));
    }

    public static void listAllContact(){
        RedmiNote10.listAllContact();
    }

    private static void searchContact() {
        System.out.print("Enter the name of the contact to be queried: ");
        name = scanner.nextLine();
        Contact contact = RedmiNote10.queryContact(name);
        if(contact != null){
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone number: " + contact.getPhoneNumber());
        }

    }

    private static void modifyContact() {
        System.out.println("Enter 1 to modify the name of an existing contact \n" +
                "Enter 2 to modify the phone number of an existing contact \n" +
                "Enter 3 to replace an entire contact: ");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.print("Enter the name of the contact to be modified: ");
                cleaner();
                name = scanner.nextLine();
                System.out.print("Enter the new name of the contact: ");
                String nName = scanner.nextLine();
                if(name.equals(nName)){
                    System.out.println("No changes made");
                    break;
                }
                RedmiNote10.modifyContact(name, nName);
                break;
            case 2:
                System.out.print("Enter the name of the contact: ");
                cleaner();
                name = scanner.nextLine();
                System.out.print("Enter the new phone number of " + name +": ");
                int phoneNumber = scanner.nextInt();
                contact = RedmiNote10.queryContact(name);
                if(contact.getPhoneNumber() == phoneNumber){
                    System.out.println("No changes made");
                }
                if(contact != null) {
                    RedmiNote10.modifyContact(contact, phoneNumber);
                }else{
                    System.out.println("Contact not found!");
                }
                break;
            case 3:
                System.out.print("Enter the name of existing contact to be modified: ");
                cleaner();
                name = scanner.nextLine();
                contact = RedmiNote10.queryContact(name);
                System.out.println("Enter name of replacement contact");
                cleaner();
                nName = scanner.nextLine();
                System.out.println("Enter phone number of replacement contact");
                cleaner();
                phoneNumber = scanner.nextInt();
                Contact newContact = Contact.createContact(nName, phoneNumber);
                if(newContact.equals(contact)){
                    System.out.println("Duplicate contacts. No modification");
                    break;
                }
                if(contact != null) {
                    RedmiNote10.removeContact(contact);
                }else{
                    System.out.println("Contact not found!");
                }
                addContact();
                break;
        }
    }

    private static void deleteContact() {
        System.out.print("Enter the name of existing contact to be deleted: ");
        String name = scanner.nextLine();
        contact = RedmiNote10.queryContact(name);
        if(contact != null) {
            System.out.println("Contact found");
            RedmiNote10.removeContact(contact);
        }else{
            System.out.println("Contact not found!");
        }
    }

    private static void addContact() {
        System.out.print("Enter name of new contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number of new contact: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        contact = Contact.createContact(name,phoneNumber);
        RedmiNote10.addContact(contact);

    }

    private static void cleaner(){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
    }

    public static void menu(){
        System.out.println("""
                    INSTRUCTION
                    Enter 'a' to add a new contact\s
                    Enter 'm' to modify a contact, if existing\s
                    Enter 'd' to remove a contact, if existing\s
                    Ënter 's' to search/query your phoneBook for contact\s
                    Enter 'r' to repeat menu\s
                    Enter 'l' to list all contacts on phone\s
                    Enter 'q' to quit operation :\s""");
    }
}

