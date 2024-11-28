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

    }

    public void calculateTaxForIncome(Income income) {

    }

    public void calculateAllTaxes() {

    }

    public void generateTaxReport() {

    }

    public void printTaxReport() {

    }
}
