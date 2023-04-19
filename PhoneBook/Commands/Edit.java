package OOPjava.HW6.PhoneBook.Commands;

import java.util.Map;
import java.util.Scanner;

public class Edit extends Command{
    
    @Override
    public void showEnteredCommand(){
        System.out.println("You have entered '4' to edit a contact");
    }
     
    public static void editContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name to edit: ");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println("\nEnter new number:");
            String number = input.nextLine();
            contacts.remove(name);
            contacts.put(name, number);
            Save.saveContacts(contacts);
            System.out.printf("Number %s successfully added\n", number);
        } else {
            System.out.printf("Sorry, contact (%s) not found!", name);
        }
        System.out.println("\nEnter command: ");
    }

}
