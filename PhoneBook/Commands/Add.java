package OOPjava.HW6.PhoneBook.Commands;

import java.util.Map;
import java.util.Scanner;

public class Add extends Command {
   
    @Override
    public void showEnteredCommand(){
        System.out.println("You have entered '3' to add a contact");
    }


    public static void addContact(Map<String, String> contacts, Scanner input) {
        String name;
        String number;

        System.out.println("Enter contact name:");
        name = input.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Enter contact number: ");
            number = input.nextLine();
        } else {
            System.out.println("Enter contact number: ");
            number = input.nextLine();
            contacts.put(name, number);
            Save.saveContacts(contacts);
            System.out.printf("Successfully added '%s' in the phone book\n", name);
        }
        System.out.println("\nEnter command: ");
    }
}
