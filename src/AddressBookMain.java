import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBookMain ob=new AddressBookMain();
        ob.addContact();
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
        System.out.println(contactList);
        return contact;
    }


}
