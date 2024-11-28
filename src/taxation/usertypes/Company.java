package taxation.usertypes;

import taxation.Income;
import taxation.Tax;
import taxation.User;

public class Company extends User {
    public Company(String name) {
        super(name);
        initializeDefaultIncomes();
    }

    @Override
    public void initializeDefaultIncomes() {
        incomeTaxMap.put(new Income("Прибуток компанії", 0, 0.20), new Tax(0));
        incomeTaxMap.put(new Income("Дивіденди", 0, 0.15), new Tax(0));
        incomeTaxMap.put(new Income("Оренда майна", 0, 0.10), new Tax(0));
        incomeTaxMap.put(new Income("Продаж активів", 0, 0.05), new Tax(0));
        incomeTaxMap.put(new Income("Перекази з-за кордону", 0, 0.12), new Tax(0));
    }
}