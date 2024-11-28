package command;

import taxation.User;

public class AddIncomeCommand implements Command {
    private User user;

    public AddIncomeCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Додати дохід: ";
    }
}
