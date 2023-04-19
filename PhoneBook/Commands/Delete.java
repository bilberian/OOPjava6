package OOPjava.HW6.PhoneBook.Commands;

import java.util.Map;
import java.util.Scanner;

public class Delete extends Command{
    
    @Override
    public void showEnteredCommand(){
        System.out.println("You have entered '5' to delete a contact");
    }
    
    public static void deleteContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name to delete contact: ");
        String name = input.nextLine();

        if (contacts.containsKey(name)) {
            contacts.remove(name);
            Save.saveContacts(contacts);
            System.out.printf("Contact (%s) successfully deleted", name);
        } else {
            System.out.printf("Sorry, contact (%s) not found", name);
        }
        System.out.println("\nEnter command: ");
    }
}
