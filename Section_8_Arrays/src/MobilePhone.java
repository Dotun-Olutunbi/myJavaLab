import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> phoneBook;

    public MobilePhone() {
        this.phoneBook = new ArrayList<Contact>();
    }

    //    store, modify, remove and querycontact
    public void addContact(Contact contact){
        phoneBook.add(contact);
    }

    public void modifyContact(String oldName, String name){
        Contact oldContact = queryContact(oldName);
        if(oldContact != null){
            oldContact.setName(name);
        }else{
            System.out.println("Contact not found");
        }
    }

    public void modifyContact(Contact oldContact, int newPhoneNumber){
        boolean isExisting;
        isExisting = phoneBook.contains(oldContact);
        if(isExisting){
            oldContact.setPhoneNumber(newPhoneNumber);
        }
    }

    public void listAllContact(){
        for(int i = 0; i< phoneBook.size(); i++){
            System.out.println((i+1) + " --------------------------");
            System.out.println("Name: " + phoneBook.get(i).getName());
            System.out.println("Phone number: " + phoneBook.get(i).getPhoneNumber());
        }
    }

    public void removeContact(Contact contact){
        phoneBook.remove(contact);
    }

    public Contact queryContact(String contactName){
//        System.out.println(contactName);
        for (int i= 0; i<phoneBook.size(); i++) {
//            System.out.println(phoneBook.get(i).getName());
            if (contactName.equals(phoneBook.get(i).getName())) {
                return phoneBook.get(i);
            }
        }
        System.out.println((contactName) +"\'s contact does not exist on phone");
        return null;
    }
}

