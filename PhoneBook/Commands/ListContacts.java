package OOPjava.HW6.PhoneBook.Commands;

import java.util.Map;

public class ListContacts extends Command{
    
    @Override
    public void showEnteredCommand(){
        System.out.println("You have entered '1' to get a list of your contacts");
    }

    public static void listContacts(Map<String, String> contacts) {
        if (!contacts.isEmpty()) {
            for (Map.Entry<String, String> contact : contacts.entrySet()) {
                System.out.print(contact.getKey() + " (phone number: " + contact.getValue() + ")\n");
            }
        } else {
            System.out.println("No records/contacts found");
        }
        System.out.println("\nEnter command: ");
    }
}
