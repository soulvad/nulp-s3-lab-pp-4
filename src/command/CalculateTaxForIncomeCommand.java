package command;

import taxation.Income;
import taxation.User;

import java.util.Scanner;

public class CalculateTaxForIncomeCommand implements Command {
    private User user;

    public CalculateTaxForIncomeCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву доходу: ");
        String incomeName = scanner.nextLine();

        Income income = new Income(incomeName, 0, 0);
        user.calculateTaxForIncome(income);
    }

    @Override
    public String getDescription() {
        return "Обчислити податки";
    }
}
