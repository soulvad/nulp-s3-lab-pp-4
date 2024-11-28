package taxation;

import java.util.*;

public abstract class User {
    protected String name;
    protected Map<Income, Tax> incomeTaxMap;
    protected TaxReport taxReportTable;

    public User(String name) {
        this.name = name;
        this.incomeTaxMap = new HashMap<>();
        this.taxReportTable = new TaxReport();
    }

    abstract public void initializeDefaultIncomes();

    public void updateIncomeAmount(Income income) {
        boolean flag = false;
        for (Income existingIncome : incomeTaxMap.keySet()) {
            if (existingIncome.getIncomeName().equals(income.getIncomeName())) {
                existingIncome.setAmount(income.getAmount());
                System.out.println("Дохід додано успішно.");
                flag = true;
                break;
            }
        }
        if(flag == false) {
            System.out.println("Дохід не знайдено.");
        }
    }

    public void calculateTaxForIncome(Income income) {
        boolean flag = false;
        for (Income existingIncome : incomeTaxMap.keySet()) {
            if (existingIncome.getIncomeName().equals(income.getIncomeName())) {
                Tax tax = incomeTaxMap.get(existingIncome);
                tax.updateAmount(existingIncome.getAmount() * existingIncome.getTaxRate());
                System.out.println("Податки для доходу " + income.getIncomeName() + " обчислено.");
                flag = true;
                break;
            }
        }
        if(flag == false) {
            System.out.println("Дохід не знайдено.");
        }
    }

    public void calculateAllTaxes() {
        for (Map.Entry<Income, Tax> entry : incomeTaxMap.entrySet()) {
            Income income = entry.getKey();
            Tax tax = entry.getValue();
            tax.updateAmount(income.getAmount() * income.getTaxRate());
        }
        System.out.println("Всі податки були обчислені.");
    }

    public void generateTaxReport() {
        taxReportTable.generateTable(incomeTaxMap);
        System.out.println("Звіт згенеровано.");
    }

    public void printTaxReport() {
        if (taxReportTable.getReportTable().isEmpty()) {
            System.out.println("Звіт не згенеровано. Спочатку створіть звіт.");
        } else {
            System.out.println(taxReportTable.getReportTable());
        }
    }

    public TaxReport getTaxReportTable() {
        return taxReportTable;
    }
}