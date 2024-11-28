package command;

import taxation.User;

public class PrintTaxReportCommand implements Command {
    private User user;

    public PrintTaxReportCommand(User user) {
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
