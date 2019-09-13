package pl.kobra;

import pl.kobra.repository.ContactsRepo;
import pl.kobra.repository.Finder;

import java.util.Scanner;

public class Main {

    public static final String WELCOME_MESSAGE = "Podaj hasło do szukania, lub wpisz EXIT aby zakończyć";
    public static final String GOODBYE_MESSAGE = "Zapraszamy ponownie!";
    private static Scanner scanner;
    private static String input;
    private static ContactsRepo contactsRepo;

    public static void main(String[] vararg) throws Exception {
        contactsRepo = ContactsRepo.init();

        setUpTerminal();
        runSearchEngine();

        System.out.println(GOODBYE_MESSAGE);
    }

    private static void runSearchEngine() {
        while (!input.contains(MenuOptions.EXIT.name())) {
            for (String contact : contactsRepo.findContact(input)) {
                System.out.println(contact);
            };
            System.out.println(WELCOME_MESSAGE);
            input = scanner.nextLine();
        }
    }

    private static void setUpTerminal() {
        System.out.println(WELCOME_MESSAGE);
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }

}
