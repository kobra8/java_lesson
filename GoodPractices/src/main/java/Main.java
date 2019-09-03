
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<String> contacts;
    private static Scanner scanner;
    private static String input;

    public static void main(String[] vararg) throws Exception {
        contacts = initContacts();

        setUpTerminal();
        runSearchEngine();

        System.out.println("Zapraszamy ponownie!");
    }

    private static void runSearchEngine() {
        while (!input.contains(MenuOptions.EXIT.name())) {
            for (String contact : contacts) {
                if (contact.contains(input))
                    System.out.println(contact);
            }
            System.out.println("Podaj hasło do szukania, lub wpisz EXIT aby zakończyć");
            input = scanner.nextLine();
        }
    }

    private static void setUpTerminal() {
        System.out.println("Podaj hasło do szukania, lub wpisz EXIT aby zakończyć");
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }

    private static Set<String> initContacts() {
        return new HashSet<>(Arrays.asList(
                    "Anna Janicka a.jan@mail.it",
                    "Jan Janicki j.jan@mail.it",
                    "Paweł Borek pawelborek@nmail.pl"
            ));
    }
}
