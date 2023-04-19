package OOPjava.HW6.PhoneBook.Commands;

import java.util.Map;
import java.util.Scanner;

public class Search extends Command{
    
    @Override
    public void showEnteredCommand(){
        System.out.println("You have entered '2' to search a contact");
    }

    
    public static void searchContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name: ");
        String name = input.nextLine();

        if (contacts.containsKey(name)) {
            System.out.print("Found contact: " + name + " (phone number: " + contacts.get(name) + ")\n");
        } else {
            System.out.println("Contact not found");
        }
        System.out.println("\nEnter command: ");
    }
}
