import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Contact> addDetails = new ArrayList<Contact>(n);

    public void addContact() {
        System.out.println("number of details you want to enter");
        for (int i = 1; i <= n; i++) {
            Contact contact = new Contact();
            System.out.println("Enter First Name");
            contact.setFIRST_NAME(sc.next());
            System.out.println("Enter last Name");
            contact.setLAST_NAME(sc.next());
            System.out.println("Enter Address");
            contact.setADDRESS(sc.next());
            System.out.println("Enter Your City Name");
            contact.setCITY(sc.next());
            System.out.println("Enter Your State");
            contact.setSTATE(sc.next());
            System.out.println("Enter Zip");
            contact.setZip(sc.next());
            System.out.println("Enter Phone Number");
            contact.setPHONE_NUMBER(sc.next());
            System.out.println("Enter Email");
            contact.setEMAIL_ID(sc.next());
            addDetails.add(contact);
        }
        System.out.println(addDetails);
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to Edit :  ");
        String name = sc.nextLine();
        for (Contact contact : addDetails) {
            if (contact.getFIRST_NAME().equals(name)) {
                System.out.println("enter which details wants to edit in contact");
                String editDetails = sc.next().toUpperCase();
                switch (editDetails) {
                    case "FIRSTNAME":
                        System.out.println("enter firstname");
                        contact.setFIRST_NAME(sc.next());
                        break;
                    case "LASTNAME":
                        System.out.println("enter lastname");
                        contact.setLAST_NAME(sc.next());
                        break;
                    case "ADDRESS":
                        System.out.println("enter firstname");
                        contact.setADDRESS(sc.next());
                        break;
                    case "CITY":
                        System.out.println("enter city");
                        contact.setCITY(sc.next());
                        break;
                    case "STATE":
                        System.out.println("enter state");
                        contact.setSTATE(sc.next());
                        break;
                    case "ZIP":
                        System.out.println("enter zip");
                        contact.setZip(sc.next());
                        break;
                    case "PHONENUMBER":
                        System.out.println("enter phoneNumber");
                        contact.setPHONE_NUMBER(sc.next());
                        break;
                    case "EMAILID":
                        System.out.println("enter email-id");
                        contact.setEMAIL_ID(sc.next());
                        break;
                }
                System.out.println(contact);
            }
        }
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to delete :  ");
        String name = sc.nextLine();
        for (Contact contact : addDetails) {
            if (contact.getFIRST_NAME().equals(name)) {
                addDetails.remove(name);
            }
        }
    }

}
