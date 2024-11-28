package taxation.usertypes;

import taxation.User;

public class Entrepreneur extends User {
    public Entrepreneur(String name) {
        super(name);
        initializeDefaultIncomes();
    }

    @Override
    public void initializeDefaultIncomes() {

    }
}
