import command.*;
import taxation.*;
import taxation.usertypes.Company;
import taxation.usertypes.Entrepreneur;
import taxation.usertypes.Person;

import java.util.*;

public class Main {
    private static boolean exit = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker();
        User user = createUserByType(scanner);

        Map<Integer, Command> commandMap = new HashMap<>();
        commandMap.put(1, new AddIncomeCommand(user));
        commandMap.put(2, new CalculateTaxForIncomeCommand(user));
        commandMap.put(3, new CalculateAllTaxesCommand(user));
        commandMap.put(4, new GenerateTaxReportCommand(user));
        commandMap.put(5, new PrintTaxReportCommand(user));

        printMenu(scanner, invoker, commandMap);

        System.out.println("Вихід");
        scanner.close();
    }

    private static User createUserByType(Scanner scanner) {
        while (true) {
            System.out.println("1: Person\n2:Entrepreneur\n3:Company");
            System.out.print("Оберіть тип користувача: ");

            int choiceType = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введіть ім'я користувача: ");
            String name = scanner.nextLine();

            switch (choiceType) {
                case 1:
                    return new Person(name);
                case 2:
                    return new Entrepreneur(name);
                case 3:
                    return new Company(name);
                default:
                    System.out.println("Такого типу користувача не існує!");
            }
        }
    }

    private static void printMenu(Scanner scanner, Invoker invoker, Map<Integer, Command> commandMap) {
        while (true) {
            System.out.println("\nМеню:");
            for (Map.Entry<Integer, Command> entry : commandMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
            }
            System.out.println("0: Вихід");
            System.out.print("Виберіть дію: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            Command command = commandMap.get(choice);
            if (command != null) {
                invoker.invoke(command);
            } else {
                System.out.println("Такої дії не існує!");
            }
        }
    }
}