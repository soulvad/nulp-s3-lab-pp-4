package command;

import taxation.User;

public class CalculateAllTaxesCommand implements Command {
    private User user;

    public CalculateAllTaxesCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.calculateAllTaxes();
    }

    @Override
    public String getDescription() {
        return "Обчислити всі податки";
    }
}