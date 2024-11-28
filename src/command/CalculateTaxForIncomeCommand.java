package command;

import taxation.User;

public class CalculateTaxForIncomeCommand implements Command {
    private User user;

    public CalculateTaxForIncomeCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Обчислити податки";
    }
}
