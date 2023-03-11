import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static HashMap<String, AddressBook> bookClassMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            System.out.println("Enter what you want to perform");
            System.out.println("AddNewAddressBook,AddContact,EditContact,DeleteContact,");
            String choice = scanner.next().toUpperCase();
            switch (choice) {
                case "ADDNEWADDRESSBOOK":
                    addNewAddressBook();
                    break;
                case "ADDCONTACT":
                    addAddressBookContact();
                    break;
                case "EDITCONTACT":
                    editAddressBookContact();
                    break;
                case "DELETECONTACT":
                    deleteAddressBookContact();
                    break;
            }
        }
    }

    public static void addNewAddressBook() {
        System.out.println("Create a New Address Book\nEnter the New AddressBook name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        if (book == null) {
            AddressBook addressBook = new AddressBook();
            bookClassMap.put(bookName, addressBook);
        } else {
            System.out.println("AddressBook with this name already exists ");
        }
    }

    public static void addAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addContact();
        }
    }

    public static void editAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.editContact();
        }
    }

    public static void deleteAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.editContact();
        }
    }
}

