import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static final int FIRSTNAME = 1;
    public static final int LASTNAME = 2;
    public static final int ADDRESS = 3;
    public static final int CITY = 4;
    public static final int STATE = 5;
    public static final int ZIP = 6;
    public static final int PHONE_NUMBER = 7;
    public static final int EMAIL_ID = 8;
    public static final int SORT_ZIP = 3;
    public static final int SORT_CITY = 2;
    public static final int SORT_STATE = 1;
    Scanner sc = new Scanner(System.in);
    List<Contact> addDetails = new ArrayList<>();
    List<Contact> addDetail = new ArrayList<>();

    public void addContact() {
        System.out.println("Enter how many contacts to add");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Contact contact = new Contact();
            System.out.println("Enter First Name");
            contact.setFIRST_NAME(sc.next());
            addDetails.stream().forEach(contact1 -> {
                if (contact.getFIRST_NAME().equals(contact1.getFIRST_NAME())) {
                    System.out.println("Name already exists");
                    System.out.println("Enter First Name");
                    contact.setFIRST_NAME(sc.next());
                }
            });
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
            addDetail.add(new Contact(contact.getFIRST_NAME(), contact.getLAST_NAME(),
                    contact.getADDRESS(), contact.getCITY(),
                    contact.getSTATE(), contact.getEMAIL_ID(), contact.getZip(), contact.getPHONE_NUMBER()));
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
                System.out.println("1.firstName, 2.lastName, 3.address, 4.city, 5.state, 6.zip, " +
                        "7.phoneNumber, 8.emailId");
                int editDetails = sc.nextInt();
                switch (editDetails) {
                    case FIRSTNAME:
                        System.out.println("enter firstname");
                        contact.setFIRST_NAME(sc.next());
                        break;
                    case LASTNAME:
                        System.out.println("enter lastname");
                        contact.setLAST_NAME(sc.next());
                        break;
                    case ADDRESS:
                        System.out.println("enter address");
                        contact.setADDRESS(sc.next());
                        break;
                    case CITY:
                        System.out.println("enter city");
                        contact.setCITY(sc.next());
                        break;
                    case STATE:
                        System.out.println("enter state");
                        contact.setSTATE(sc.next());
                        break;
                    case ZIP:
                        System.out.println("enter zip");
                        contact.setZip(sc.next());
                        break;
                    case PHONE_NUMBER:
                        System.out.println("enter phoneNumber");
                        contact.setPHONE_NUMBER(sc.next());
                        break;
                    case EMAIL_ID:
                        System.out.println("enter email-id");
                        contact.setEMAIL_ID(sc.next());
                        break;
                }
                System.out.println("enter any other details if you want edit");
                System.out.println("1.firstName, 2.lastName, 3.address, 4.city, 5.state, 6.phoneNumber, 7.zip, 8.emailid");
                editDetails = sc.nextInt();
                System.out.println(contact);
            } else {
                System.out.println("Invalid name");
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

    public void searchByCity() {
        System.out.println("Enter city Name:");
        String city = sc.next();
        addDetail.stream().filter(contacts -> contacts.getCITY().equals(city)).forEach(contacts -> System.out.println(contacts));
    }

    public void searchByState() {
        System.out.println("Enter State Name:");
        String state = sc.next();
        addDetail.stream().filter(contacts -> contacts.getSTATE().equals(state)).forEach(contacts -> System.out.println(contacts));
    }

    public void countByCity() {
        System.out.println("Enter the city Name:");
        String city = sc.next();
        long countCity = addDetails.stream().filter(contact -> contact.getCITY().equals(city)).count();
        System.out.println("Total number of contacts in city : " + countCity);
        addDetails.stream().filter(contact -> contact.getCITY().equals(city)).forEach(contacts -> System.out.println(contacts));
    }

    public void countByState() {
        System.out.println("Enter the State Name:");
        String state = sc.next();
        long countState = addDetails.stream().filter(contact -> contact.getSTATE().equals(state)).count();
        System.out.println("Total number of contacts in states : " + countState);
        addDetails.stream().filter(contacts -> contacts.getSTATE().equals(state)).forEach(contacts -> System.out.println(contacts));
    }

    public void sortByName() {
        addDetails.stream().sorted(Comparator.comparing(Contact::getFIRST_NAME)).forEach(System.out::println);
    }

    public void sortByCityStateZip() {
        System.out.println("Enter 1.state, 2.city, 3.Zip to sort");
        int sortStateCityZip = sc.nextInt();
        switch (sortStateCityZip) {
            case SORT_STATE:
                addDetails.stream().sorted(Comparator.comparing(Contact::getSTATE)).forEach(System.out::println);
                break;
            case SORT_CITY:
                addDetails.stream().sorted(Comparator.comparing(Contact::getCITY)).forEach(System.out::println);
                break;
            case SORT_ZIP:
                addDetails.stream().sorted(Comparator.comparing(Contact::getZip)).forEach(System.out::println);
                break;
        }
    }

    public void writeData() {
        StringBuffer personBuffer = new StringBuffer();
        addDetails.forEach(contact -> {
            String personDataString = contact.toString().concat("\n");
            personBuffer.append(personDataString);

        });
        try {
            Files.write(Paths.get("AddressBook.txt"), personBuffer.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFileData() {
        try {
            Files.lines(new File("AddressBook.txt").toPath()).map(String::trim).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


