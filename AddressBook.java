import java.util.Scanner;

public class AddressBook {
    public void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of details to be added");
        int noOfDetails = sc.nextInt();
        Contact[] contactArr = new Contact[noOfDetails];
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
}
