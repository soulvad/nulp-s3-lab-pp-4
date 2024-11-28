package command;

import taxation.User;

public class GenerateTaxReportCommand implements Command {
    private User user;

    public GenerateTaxReportCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Згенерувати звіт";
    }
}