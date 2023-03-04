import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook object = new AddressBook();
        AddressBook object1 = new AddressBook();
        AddressBook object2 = new AddressBook();
        System.out.println("enter 3 map value");
        object.addressBooks.put("object", object);
        object.addressBooks.put("object1", object1);
        object.addressBooks.put("object2", object2);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter details to be added");
        System.out.println("enter student,employee,worker");
        String details = sc.next();
        switch (details) {
            case "STUDENT":
                object.addEditDelete();
                break;
            case "EMPLOYEE":
                object1.addEditDelete();
                break;
            case "WORKER":
                object2.addEditDelete();
                break;
        }
    }
}

