package org.anish.patterns.solid.dip;

// High Level Module
public class UserService {
    DataBase db; // Dependency injection
    UserService(DataBase db) {
        this.db = db;
    }
    void storeUser(String user) {
        db.save(user);
    }
}
