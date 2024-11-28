package taxation.usertypes;

import taxation.User;

public class Person extends User {
    public Person(String name) {
        super(name);
        initializeDefaultIncomes();
    }

    @Override
    public void initializeDefaultIncomes() {

    }
}