package project;

import java.util.ArrayList;

public class Account {
    private static Account instance;
    private ArrayList<User> users;

    private Account() {
        users = new ArrayList<>();
    }

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public void registerUser(String name, String username, String password) {
        users.add(new User(name, username, password));
    }

    public boolean verifyLogin(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
        }
}