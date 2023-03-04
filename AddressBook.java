import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    int noOfDetails = sc.nextInt();
    Contact[] contactArr = new Contact[noOfDetails];
    public void addContact() {
        System.out.println("Enter number of details to be added");
        for (int i = 0; i < noOfDetails; i++) {
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
            contactArr[i] = contact;
        }
        for (int i = 0; i < noOfDetails; i++) {
            System.out.println(contactArr[i]);
        }
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to Edit :  ");
        String name = sc.nextLine();
        for (int i = 0; i < contactArr.length; i++) {
            if (name.equals(contactArr[i].getFIRST_NAME())) {
                System.out.println("enter which details wants to edit in contact");
                String editDetails = sc.next().toUpperCase();
                switch (editDetails) {
                    case "FIRSTNAME":
                        System.out.println("enter firstname");
                        contactArr[i].setFIRST_NAME(sc.next());
                        break;
                    case "LASTNAME":
                        System.out.println("enter lastname");
                        contactArr[i].setLAST_NAME(sc.next());
                        break;
                    case "ADDRESS":
                        System.out.println("enter firstname");
                        contactArr[i].setADDRESS(sc.next());
                        break;
                    case "CITY":
                        System.out.println("enter city");
                        contactArr[i].setCITY(sc.next());
                        break;
                    case "STATE":
                        System.out.println("enter state");
                        contactArr[i].setSTATE(sc.next());
                        break;
                    case "zip":
                        System.out.println("enter zip");
                        contactArr[i].setZip(sc.next());
                        break;
                    case "PHONENUMBER":
                        System.out.println("enter phoneNumber");
                        contactArr[i].setPHONE_NUMBER(sc.next());
                        break;
                    case "EMAILID":
                        System.out.println("enter email-id");
                        contactArr[i].setEMAIL_ID(sc.next());
                        break;
                    default:
                        System.out.println("not valid in details");
                }
                System.out.println(contactArr[i]);
            }
        }
    }
}

