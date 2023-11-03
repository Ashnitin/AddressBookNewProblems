import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookMain ob =new AddressBookMain();
        System.out.println("Enter First Name: ");
        String firstName = sc.next();

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();

        System.out.println("Enter Address: ");
        String address = sc.next();

        System.out.println("Enter Your City: ");
        String city = sc.next();

        System.out.println("Enter State: ");
        String state = sc.next();

        System.out.println("Enter Zip: ");
        int zip = sc.nextInt();

        System.out.println("Enter your Phone No: ");
        long phoneNo = sc.nextLong();

        System.out.println("Enter your Email: ");
        String email = sc.next();

      Contact contact=new Contact(firstName,lastName,address,city,state,email,zip,phoneNo);
        System.out.println(contact);
    }
}
