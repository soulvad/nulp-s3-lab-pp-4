package taxation.usertypes;

import taxation.Income;
import taxation.Tax;
import taxation.User;

public class Person extends User {
    public Person(String name) {
        super(name);
        initializeDefaultIncomes();
    }

    @Override
    public void initializeDefaultIncomes() {
        incomeTaxMap.put(new Income("Основна робота", 0, 0.18), new Tax(0));
        incomeTaxMap.put(new Income("Додаткова робота", 0,0.15), new Tax(0));
        incomeTaxMap.put(new Income("Авторські винагороди", 0,0.10), new Tax(0));
        incomeTaxMap.put(new Income("Продаж майна", 0,0.05), new Tax(0));
        incomeTaxMap.put(new Income("Подарунки (гроші)", 0,0.02), new Tax(0));
        incomeTaxMap.put(new Income("Подарунки (майно)", 0,0.03), new Tax(0));
        incomeTaxMap.put(new Income("Перекази з-за кордону", 0,0.12), new Tax(0));
        incomeTaxMap.put(new Income("Пільги на дітей", 0,0.00), new Tax(0));
        incomeTaxMap.put(new Income("Матеріальна допомога", 0,0.00), new Tax(0));
    }
}