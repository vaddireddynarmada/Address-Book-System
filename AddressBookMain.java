import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static final int ADD_NEW_ADDRESS_BOOK = 1;
    public static final int ADD_CONTACT = 2;
    public static final int EDIT_CONTACT = 3;
    public static final int DELETE_CONTACT = 4;
    public static final int DISPLAY_ADDRESS_BOOKS = 5;
    public static final int EXIT = 6;
    static HashMap<String, AddressBook> bookClassMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            System.out.println("Enter what you want to perform");
            System.out.println("1.AddNewAddressBook, 2.AddContact, 3.EditContact, 4.DeleteContact," +
                    " 5.DisplayAllAddressBooks, 6.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case ADD_NEW_ADDRESS_BOOK:
                    addNewAddressBook();
                    break;
                case ADD_CONTACT:
                    addAddressBookContact();
                    break;
                case EDIT_CONTACT:
                    editAddressBookContact();
                    break;
                case DELETE_CONTACT:
                    deleteAddressBookContact();
                    break;
                case DISPLAY_ADDRESS_BOOKS:
                    displayAddressBookNames();
                    break;
                case EXIT:
                    condition = false;
                    break;
                default:
                    System.out.println("Enter correct details");
            }
        }
    }

    public static void addNewAddressBook() {
        System.out.println("Enter the New AddressBook name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        if (book == null) {
            AddressBook addressBook = new AddressBook();
            bookClassMap.put(bookName, addressBook);
        } else {
            System.out.println("AddressBook name already exists ");
        }
    }

    public static void addAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.addContact();
        }
    }

    public static void editAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.editContact();
        }
    }

    public static void deleteAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.deleteContact();
        }
    }

    public static void displayAddressBookNames() {
        System.out.println("All address book names");
        for (HashMap.Entry<String, AddressBook> display : bookClassMap.entrySet()) {
            System.out.println(display.getKey());
        }
    }

}

