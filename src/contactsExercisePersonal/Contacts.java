package contactsExercisePersonal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class Contacts {

    public static Scanner scanner = new Scanner(System.in);

    final static String dir = "contacts";
    final static String fileName = "contacts.txt";
    private static boolean run = true;
    private static boolean contactExists = false; // TODO: possibly make static


    public static Path directory = Paths.get(dir);
    public static Path path = Paths.get(dir, fileName);

    public static List<Person> allContacts = new ArrayList<>(); // contact Person Objects in List
    public static List<String> pulledContacts = new ArrayList<>(); // pulled all contacts from contacts.txt

    public static void displayMenu() {
        System.out.printf("What would you like to do? (Enter value between 1-5%n");
        System.out.println("1: View all contacts");
        System.out.println("2: Add a new contact");
        System.out.println("3: Search for a contact");
        System.out.println("4: Delete a contact");
        System.out.println("5: exit");
    }

    public static int optionChecker() {
        int selectedOption = Integer.parseInt(scanner.next());

        if (selectedOption < 1 || selectedOption > 5) {
            System.out.printf("Option not available%nPlease select an option between 1-5");
            return optionChecker();
        } else {
            return selectedOption;
        }
    }

    public static void optionSelected(int option) {
        switch (option) {
            case 1:
                displayAllContacts();
                confirm();
                break;
            case 2:
                addToContacts();
                confirm();
                break;
            case 3:
                searchContacts();
                confirm();
                break;
            case 4:
                deleteContact();
                confirm();
                break;
            case 5:
                System.out.println("Goodbye!");
                run = false;
                break;
            default:
                System.out.println("Sorry I didn't catch that.");
                runProgram();
                break;
        }
    }

    // ----- grab all existing contacts -----
    public static void grabContacts() {
        try {
            pulledContacts = Files.readAllLines(Paths.get(dir, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ----- formats text from .txt into person objects -----
    public static void formatPulledContacts() {
        allContacts = new ArrayList<>();
        for (String contact : pulledContacts) {
            String name = contact.substring(contact.indexOf(" "), contact.indexOf("Phone")).trim();
            String number = contact.substring(contact.lastIndexOf(" ")).trim();
            allContacts.add(new Person(name, number));
        }
    }

    // ----- display all contacts -----
    public static void displayAllContacts() {
        grabContacts(); // grab the current contacts
        if (pulledContacts.isEmpty()) {
            System.out.println("There are no contacts.");
        } else {
            formatPulledContacts(); // format those contacts into person objects stored into all contacts for manipulation
            for (Person contact : allContacts) { // print each contact formatted properly
                System.out.println(formatWriteContact(contact));
            }
        }
    }

    // ----- create contact -----
    public static Person createContact() {
        System.out.println("Enter a name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber = scanner.next();
        return new Person(name, phoneNumber);
    }

    // ----- add to existing contact list -----
    public static void addToContacts() {
        Person person = createContact(); // TODO: possible recursion inside this createContact method to guarantee correct naming formats
        allContacts.add(person); // add to allContacts List
        try {
            Files.write(path, Collections.singletonList(formatWriteContact(person)), StandardOpenOption.APPEND); // writes to .txt file
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Added (Name: %s Phone: %s)%n", person.getName(), person.getPhoneNumber());

    }

    public static String formatWriteContact(Person contact) { // formats person object to display properly
        return String.format("Name: %s Phone: %s", contact.getName(), contact.getPhoneNumber());
    }

    public static void searchContacts() {
        grabContacts();
        if (pulledContacts.isEmpty()) {
            System.out.println("There are no contacts to search.");
        } else {
            contactExists = false;
            System.out.println("Search by name or phone number.");
            String search = scanner.next().trim().toLowerCase();
            formatPulledContacts(); // formats and adds pulled contacts to allContacts list
            for (Person contact : allContacts) { // TODO: make its own method
                if (search(contact, search)) {
                    System.out.println(formatWriteContact(contact));
                    contactExists = true;
                }
            }
            if (!contactExists) {
                System.out.printf("No contact was found with that information.%n");
                deleteContinue();
            }
        }
    }

    public static boolean search(Person contact, String search) {
        if (contact.getName().toLowerCase().contains(search)) {
            return true;
        } else return contact.getPhoneNumber().contains(search);
    }

    public static void deleteContinue() {
        System.out.printf("Would you like to search again? (y/n)%n");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            searchContacts();
        } else if (userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
            runProgram();
        } else {
            System.out.println("Sorry did not catch that.");
            deleteContinue();
        }
    }

    public static void deleteSearch() {
        System.out.printf("Would you like to search again? (y/n)%n");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            deleteContact();
        } else if (userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
            runProgram();
        } else {
            System.out.println("Sorry did not catch that.");
            deleteSearch();
        }
    }

    public static boolean deleteConfirm(Person contact) { // confirm to delete contact
        System.out.printf("Delete %s? (y/n)%n", formatWriteContact(contact));
        String response = scanner.next();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }

    public static void deleteContact() {
        grabContacts(); // checks .txt file status
        if (pulledContacts.isEmpty()) {
            System.out.println("There are no contacts to search/delete.");
        } else {
            contactExists = false; // reset static variable
            System.out.println("Search by name or phone number.");
            String search = scanner.next().trim().toLowerCase();
            formatPulledContacts(); // add pulled contacts into a static manipulable variable
            ArrayList<Integer> temp = new ArrayList<>(); // method temporary list of search result indices
            for (Person contact : allContacts) {
                if (search(contact, search)) { // run search method
                    temp.add(allContacts.indexOf(contact));
                    contactExists = true;
                }
            }
            if (!contactExists) { // first check if contact exists // make recursive
                System.out.printf("No contact was found with that information.%n");
                deleteSearch();
            }
            if (temp.size() == 1) { // if only one contact was found
                if (deleteConfirm(allContacts.get(temp.get(0)))) {
//                    System.out.println(allContacts);
                    allContacts.remove(temp.get(0).intValue());
//                    System.out.println(allContacts);
                    try {
                        Files.writeString(path, ""); // clear existing .txt file
                        for (Person contact : allContacts) {
                            Files.write(path, Arrays.asList(formatWriteContact(contact)), StandardOpenOption.APPEND);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    runProgram();
                }
            } else if (temp.size() > 1) {
                int userSelected = isolateContact(temp);
                if (deleteConfirm(allContacts.get(temp.get(userSelected)))) {
                    allContacts.remove(temp.get(userSelected).intValue());
                    try {
                        Files.writeString(path, ""); // clear existing .txt file
                        for (Person contact : allContacts) {
                            Files.write(path, Arrays.asList(formatWriteContact(contact)), StandardOpenOption.APPEND);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    runProgram();
                }
            }
        }
    }

    public static int isolateContact(ArrayList<Integer> indices) { // isolate the exact contact to delete
        System.out.printf("Select contact to delete. 1-%d%n", indices.size());
        int y = 0;
        for (int i = 0; i < indices.size(); i++) {
            y++;
            System.out.printf("%d: %s%n", y, formatWriteContact(allContacts.get(indices.get(i))));
        }
        int selection = scanner.nextInt();
        if (selection < 1 || selection > indices.size()) {
            System.out.println("Not a valid selection");
            return isolateContact(indices);
        } else {
            return selection - 1;
        }
    }

    public static void checkFiles() {
        if (!Files.exists(directory)) {
            try {
                Files.createDirectories(directory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void confirm() {
        System.out.println("Would you like to continue? (y/n)");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            runProgram();
        } else if (userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
            run = false;
        } else {
            System.out.println("Sorry did not catch that.");
            confirm();
        }
    }

    public static void runProgram() {
        displayMenu();
        optionSelected(optionChecker());

    }

    public static void main(String[] args) {
        while (run) {
            checkFiles();
            runProgram();
        }
    }
}
