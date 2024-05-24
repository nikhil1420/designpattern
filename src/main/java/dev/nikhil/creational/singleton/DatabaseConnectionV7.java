package dev.nikhil.creational.singleton;

//Double - locking Mechanism
public class DatabaseConnectionV7 {
    private static DatabaseConnectionV7 instance;
    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV7() {}
// thread safe but slow
    public static DatabaseConnectionV7 getInstance()
    {
        if(instance==null){
            // synchronized (dbC) { This can lead to Null pointer if dbc is not initialized.

            // This will allow only one thread to enter the synchronized block of code for
            // DatabaseConnectionV7 class.
            // In java, every class has a Class object associated with it, hence this works.
            synchronized (DatabaseConnectionV7.class) {
                if(instance==null){
                    instance = new DatabaseConnectionV7();
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
