import command.*;
import taxation.*;
import taxation.usertypes.Company;
import taxation.usertypes.Entrepreneur;
import taxation.usertypes.Person;
import static menu.Menu.menu;

import java.util.*;

public class Main {
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

        menu(scanner, invoker, commandMap);

        System.out.println("Вихід");
        scanner.close();
    }

    private static User createUserByType(Scanner scanner) {
        while (true) {
            System.out.println("1:Фізична особа\n2:Підприємець\n3:Компанія");
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
}