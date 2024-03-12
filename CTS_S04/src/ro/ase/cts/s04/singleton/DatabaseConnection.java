package ro.ase.cts.s04.singleton;

// Implemenation for multithreading
public class DatabaseConnection {

    // Private volatile instance variable to ensure visibility across threads
    public static volatile DatabaseConnection instance;
    private DatabaseConnection() {

    }

    // Double-checked locking for thread safety and lazy initialization
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
