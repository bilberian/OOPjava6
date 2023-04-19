package OOPjava.HW6.PhoneBook.Commands;


import java.io.IOException;
import java.io.PrintWriter;

import java.util.Map;


public class Save extends Command {
    
    private static String path = "/Users/bilbe/Documents/geekbrains2q/OOPjava/HW6/PhoneBook/Commands/PB.txt";
    
    public static void saveContacts(Map<String, String> contacts) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String line = String.format("%s,\"%s\"",
                            entry.getKey(), entry.getValue().toString().replaceAll("\\[|]", ""));
            System.out.println(line);
        }

        try (PrintWriter writer = new PrintWriter(path)) {
            if (!contacts.isEmpty()) {
                for (Map.Entry<String, String> entry : contacts.entrySet()) {
                    String line = String.format("%s,\"%s\"",
                            entry.getKey(), entry.getValue().toString().replaceAll("\\[|]", ""));
                    writer.println(line);
                }
            }

        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }
    }
}
