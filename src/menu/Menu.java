package menu;

import command.Command;
import command.Invoker;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static void menu(Scanner scanner, Invoker invoker, Map<Integer, Command> commandMap) {
        while (true) {
            printMenu(commandMap);

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

    private static void printMenu(Map<Integer, Command> commandMap) {
        System.out.println("\nМеню:");
        for (Map.Entry<Integer, Command> entry : commandMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
        }
        System.out.println("0: Вихід");
        System.out.print("Виберіть дію: ");
    }
}
