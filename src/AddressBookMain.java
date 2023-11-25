import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {
   private String addressBookName;

    public AddressBookMain(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public AddressBookMain() {
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    @Override
    public String toString() {
        return "addressBookName='" + addressBookName + '\'' +"\n"+
                "\ncontactList=" + contactList;
    }

    private ArrayList<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Contact contact = new Contact();
        System.out.println(contact);
        /* ArrayList<Contact> contactList = new ArrayList<>();
        System.out.println(contactList);*/
    }
    Scanner sc = new Scanner(System.in);
    public  void addContactInParent() {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************Please Add Contact*******************************");
        do {
            System.out.println("Enter Your Choice: \n1)Add Contact \n2)Update Contact\n3)Delete Contact\n4)Show Contact\n5)Exit");
             ch = sc.nextInt();
            switch (ch) {
                case 1:
                    this.addContact();
                    break;
                case 2:
                    this.updateContact();
                    break;
                case 3:
                    this.deleteContact();
                case 4:
                    this.showContact();

                case 5:
                    return;

                default:
                    System.out.println("Invalid Option");
            }
        }while (ch<3);
    }
    public Contact addContact() {
        Contact contact =new Contact();

        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        contact.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        contact.setLastName(lastName);

        System.out.println("Enter Address: ");
        String address = sc.next();
        contact.setAddress(address);

        System.out.println("Enter Your City: ");
        String city = sc.next();
        contact.setCity(city);

        System.out.println("Enter State: ");
        String state = sc.next();
        contact.setState(state);

        System.out.println("Enter Zip: ");
        int zip = sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter your Phone No: ");
        long phoneNo = sc.nextLong();
        contact.setPhoneNo(phoneNo);

        System.out.println("Enter your Email: ");
        String email = sc.next();
        contact.setEmail(email);

        contactList.add(contact);
        //System.out.println(contactList);
        System.out.println("****************************************************************************************");
        System.out.println("Contact Added Successfully");
        System.out.println("****************************************************************************************");

        return contact;
    }
    public void updateContact() {

        for (int i = 0; i < contactList.size(); i++) {

            System.out.println("Enter Number For Updation: \n1)Firstname\n2)lastname\n3)Address\n4)city\n5)State\n6)Email\n7)Zip\n8)PhoneNo");
            int ch1 = sc.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("Enter Your New First Name: ");
                    String newFirstName = sc.next();
                    contactList.get(i).setFirstName(newFirstName);
                    System.out.println("First Name Updated Successfully");
                    break;
                case 2:
                    System.out.println("Enter Your New Last Name: ");
                    String newLastName = sc.next();
                    contactList.get(i).setLastName(newLastName);
                    System.out.println("Last Name Updated Successfully");
                    break;
                case 3:
                    System.out.println("Enter Your New Address: ");
                    String newAddress = sc.next();
                    contactList.get(i).setAddress(newAddress);
                    System.out.println("Address Updated Successfully");
                    break;
                case 4:
                    System.out.println("Enter Your New City: ");
                    String newCity = sc.next();
                    contactList.get(i).setCity(newCity);
                    System.out.println("City Updated Successfully");
                    break;
                case 5:
                    System.out.println("Enter Your New State: ");
                    String newSate = sc.next();
                    contactList.get(i).setState(newSate);
                    System.out.println("State Updated Successfully");
                    break;
                case 6:
                    System.out.println("Enter Your New Email: ");
                    String newEmail = sc.next();
                    contactList.get(i).setEmail(newEmail);
                    System.out.println("Email Updated Successfully");
                    break;
                case 7:
                    System.out.println("Enter Your New Zip: ");
                    int newZip = sc.nextInt();
                    contactList.get(i).setZip(newZip);
                    System.out.println("Zip Updated Successfully");
                    break;
                case 8:
                    System.out.println("Enter Your New Phone No: ");
                    long newPhoneNo = sc.nextLong();
                    contactList.get(i).setPhoneNo(newPhoneNo);
                    System.out.println("Phone No Updated Successfully");
                    break;
            }
        }
        System.out.println(contactList);
    }
    public void deleteContact(){
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("Enter Name For Delete Contact");
            String name=sc.next();
            if(name.equals(contactList.get(i).getFirstName())){
                contactList.remove(i);
            }
        }
        System.out.println(contactList);
    }
    public void showContact(){

        Iterator itr=contactList.iterator();
        while (itr.hasNext()){
            System.out.println(addressBookName+itr.next());
        }
    }

}
