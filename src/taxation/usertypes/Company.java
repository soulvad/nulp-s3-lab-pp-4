package taxation.usertypes;

import taxation.User;

public class Company extends User {
    public Company(String name) {
        super(name);
        initializeDefaultIncomes();
    }

    @Override
    public void initializeDefaultIncomes() {

    }
}