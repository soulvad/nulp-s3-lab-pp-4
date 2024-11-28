package command;

import taxation.Income;
import taxation.User;

import java.util.Scanner;

public class AddIncomeCommand implements Command {
    private User user;

    public AddIncomeCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву доходу: ");
        String incomeName = scanner.nextLine();
        System.out.println("Введіть суму доходу: ");
        double amount = scanner.nextDouble();

        Income income = new Income(incomeName, amount, 0);
        user.updateIncomeAmount(income);
    }

    @Override
    public String getDescription() {
        return "Додати дохід: ";
    }
}
