package Lecture6.Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        contactList();
    }
    public static void contactList() {
        LinkedList<String> contacts = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter the contact name: ");
                    String name = scanner.nextLine();
                    contacts.add(name);
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.println("Contact List:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the number of the contact to remove: ");
                    for (int i = 0; i < contacts.size(); i++) {
                        System.out.println((i + 1) + ". " + contacts.get(i));
                    }
                    System.out.print("Enter the number: ");
                    int contactNumber = scanner.nextInt();
                    if (contactNumber > 0 && contactNumber <= contacts.size()) {
                        String removedContact = contacts.remove(contactNumber - 1);
                        System.out.println("Removed contact: " + removedContact);
                    } else {
                        System.out.println("Invalid contact number!");
                    }
                    break;

                case 4:
                    System.out.println("Contact list closed!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

