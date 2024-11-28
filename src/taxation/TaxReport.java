package taxation;

import java.util.Map;
import java.util.StringJoiner;

public class TaxReport {
    private String reportTable;

    public TaxReport() {
        this.reportTable = "";
    }

    public void generateTable(Map<Income, Tax> incomeTaxMap) {
        StringJoiner table = new StringJoiner("\n", "Доходи та Податки Звіт\n", "\n");
        table.add(String.format("%-30s %-20s %-30s %-20s", "Назва доходу", "Сума доходу", "Коефіцієнт оподаткування", "Сума податку"));
        table.add("-".repeat(100));

        double totalIncome = 0;
        double totalTax = 0;

        for (Map.Entry<Income, Tax> entry : incomeTaxMap.entrySet()) {
            Income income = entry.getKey();
            Tax tax = entry.getValue();
            table.add(String.format(
                "%-30s %-20.2f %-30.2f %-20.2f",
                income.getIncomeName(),
                income.getAmount(),
                income.getTaxRate(),
                tax.getAmount()
            ));

            totalIncome += income.getAmount();
            totalTax += tax.getAmount();
        }

        table.add("-".repeat(100));
        table.add(String.format("%-30s %-20.2f %-30s %-20.2f", "Загалом:", totalIncome, "", totalTax));

        reportTable = table.toString();
    }

    public String getReportTable() {
        return reportTable;
    }
}