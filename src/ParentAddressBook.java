import java.util.*;

public class ParentAddressBook {


       ArrayList<Contact> contactList = new ArrayList<>();
       HashMap<String, AddressBookMain> addressBook=new HashMap<>();


        public void addAddressBook(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of new Address Book:");
            String addressBookName=sc.nextLine();

            if(!addressBook.containsKey(addressBookName)){

                System.out.println("Address Book "+addressBookName+" Created Successfully.");
               System.out.println(addressBook);
                AddressBookMain ob=new AddressBookMain(addressBookName);
                ob.addContactInParent();
                this.addressBook.put(addressBookName,ob);
            }
            else {
                System.out.println("Address Book With Name "+addressBookName+" Already exists. ");
            }

        }
        public void showAddressBook(Object key){

            Scanner sc=new Scanner(System.in);
           System.out.println("Enter the name of address book: ");
           String addbname=sc.nextLine();
            System.out.println(this.addressBook.get(addbname));

        }
   
    public static void main(String[] args) {
        int choice;
            ParentAddressBook ob1=new ParentAddressBook();
            Scanner sc=new Scanner(System.in);
        System.out.println("************************************Welcome To Address Book*******************************");
        System.out.println("**********************************To Add AddressBook**************************************");
        while (true){
        System.out.println("Enter Your Choice:\n1)Add Address Book\n2)Show Address Book\n3)Exit");
         choice=sc.nextInt();
        switch (choice) {
            case 1:
                ob1.addAddressBook();

                break;
            case 2:
                Iterator key=ob1.addressBook.keySet().iterator();
                while (key.hasNext()){
                    ob1.showAddressBook(key.next());
                }

                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
        }
        }

}
