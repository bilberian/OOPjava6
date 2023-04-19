package OOPjava.HW6.PhoneBook;

import java.util.*;

import OOPjava.HW6.PhoneBook.Commands.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new TreeMap<>();
        ListContacts.listContacts(contacts);
        Menu.showCommands();
        
        Scanner input = new Scanner(System.in);
        String newCommand = input.nextLine();

        while (!newCommand.equals("q")) {
            switch (newCommand) {
                case "1":
                    new ListContacts().showEnteredCommand();
                    ListContacts.listContacts(contacts);
                    break;
                case "2":
                    new Search().showEnteredCommand();
                    Search.searchContact(contacts, input);
                    break;
                case "3":
                    new Add().showEnteredCommand();
                    Add.addContact(contacts, input);
                    break;
                case "4":
                    new Edit().showEnteredCommand();
                    Edit.editContact(contacts, input);
                    break;
                case "5":
                    new Delete().showEnteredCommand();
                    Delete.deleteContact(contacts, input);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            newCommand = input.nextLine();
        }
        
        if(newCommand.equals("q")) {
            System.out.println("Goodbye");
        };
    }
}
