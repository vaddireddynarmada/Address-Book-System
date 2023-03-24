import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static final int ADD_NEW_ADDRESS_BOOK = 1;
    public static final int ADD_CONTACT = 2;
    public static final int EDIT_CONTACT = 3;
    public static final int DELETE_CONTACT = 4;
    public static final int DISPLAY_ADDRESS_BOOKS = 5;
    public static final int SEARCH_CONTACT = 6;
    public static final int COUNT_CONTACT = 7;
    public static final int SORT_NAME = 8;
    public static final int SORT_CITY_STATE_ZIP = 9;
    public static final int WRITE_DATA_FROM_FILE = 10;
    public static final int READ_DATA_FROM_FILE = 11;
    //public static final int WRITE_DATA_CSV=11;
    public static final int EXIT = 12;
    public static final int STATE = 1;
    public static final int CITY = 2;
    HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    AddressBook a = new AddressBook();

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("Enter what you want to perform");
            System.out.println("1.AddNewAddressBook, 2.AddContact, 3.EditContact, 4.DeleteContact, "+"\n" +
                    "5.DisplayAllAddressBooks, 6.SEARCH_CONTACT, 7.COUNT_CONTACT, 8.sortName, 9.SortCityNameZip, " +"\n" +
                    "10.writeToAddressBookFile, 11.readDataFromFile, 12.exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case ADD_NEW_ADDRESS_BOOK:
                    addressBookMain.addNewAddressBook();
                    break;
                case ADD_CONTACT:
                    addressBookMain.addAddressBookContact();
                    break;
                case EDIT_CONTACT:
                    addressBookMain.editAddressBookContact();
                    break;
                case DELETE_CONTACT:
                    addressBookMain.deleteAddressBookContact();
                    break;
                case DISPLAY_ADDRESS_BOOKS:
                    addressBookMain.displayAddressBookNames();
                    break;
                case SEARCH_CONTACT:
                    addressBookMain.searchContactStateCity();
                    break;
                case COUNT_CONTACT:
                    addressBookMain.countContactStateCity();
                    break;
                case SORT_NAME:
                    addressBookMain.sortByName();
                    break;
                case SORT_CITY_STATE_ZIP:
                    addressBookMain.sortStateCityZip();
                    break;
                case WRITE_DATA_FROM_FILE:
                    addressBookMain.writeToAddressBookFile();
                    break;
                case READ_DATA_FROM_FILE:
                    addressBookMain.readDataFromFile();
                    break;
                    case EXIT:
                    condition = false;
                    break;
                default:
                    System.out.println("Enter correct details");
            }
        }
    }

    public void addNewAddressBook() {
        System.out.println("Enter the New AddressBook name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(bookName, addressBook);
        } else {
            System.out.println("AddressBook name already exists ");
        }
    }

    public void addAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.addContact();
        }
    }

    public void editAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.editContact();
        }
    }

    public void deleteAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.deleteContact();
        }
    }

    public void displayAddressBookNames() {
        System.out.println("All address book names");
        for (HashMap.Entry<String, AddressBook> display : addressBookMap.entrySet()) {
            System.out.println(display.getKey());
        }
    }

    public void displayCity() {
        System.out.println("All address book names");
        for (HashMap.Entry<String, AddressBook> display : addressBookMap.entrySet()) {
            System.out.println(display.getKey());
        }
    }

    public void searchContactStateCity() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            System.out.println("Enter 1.state, 2.city to search ");
            int searchContactStateCity = scanner.nextInt();
            switch (searchContactStateCity) {
                case STATE:
                    book.searchByState();
                case CITY:
                   book.searchByCity();
            }
        }
    }

    public void countContactStateCity() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            System.out.println("Enter 1.state, 2.city check the count");
            int searchContactStateCity = scanner.nextInt();
            switch (searchContactStateCity) {
                case STATE:
                    book.countByState();
                case CITY:
                    book.countByCity();
            }
        }
    }

    public void sortStateCityZip() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.sortByCityStateZip();
        }
    }

    public void sortByName() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.sortByName();
        }
    }

    public void writeToAddressBookFile() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.writeData();
        }
    }

    public void readDataFromFile() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBook book = addressBookMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            book.readFileData();
        }
    }
}

