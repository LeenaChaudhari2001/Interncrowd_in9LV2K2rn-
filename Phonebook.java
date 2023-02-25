import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    private static Map<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter 1 to add contact");
            System.out.println("Enter 2 to search contact");
            System.out.println("Enter 3 to display all contacts");
            System.out.println("Enter 4 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        contacts.put(name, phoneNumber);

        System.out.println("Contact added successfully!");
    }

    private static void searchContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Phone number for " + name + " is " + contacts.get(name));
        } else {
            System.out.println(name + " not found in phonebook");
        }
    }

    private static void displayContacts() {
        System.out.println("Contacts:");
        for (String name : contacts.keySet()) {
            System.out.println(name + " -> " + contacts.get(name));
        }
    }
}
