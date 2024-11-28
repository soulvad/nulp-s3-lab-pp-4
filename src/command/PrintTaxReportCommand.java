package command;

import taxation.User;

public class PrintTaxReportCommand implements Command {
    private User user;

    public PrintTaxReportCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if (user.getTaxReportTable().getReportTable().isEmpty()) {
            System.out.println("Звіт не згенеровано. Будь ласка, спочатку згенеруйте звіт.");
        } else {
            System.out.println(user.getTaxReportTable().getReportTable());
        }
    }

    @Override
    public String getDescription() {
        return "Вивести звіт";
    }
}
