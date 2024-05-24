package dev.nikhil.creational.singleton;

public class DatabaseConnectionV6 {
    private static DatabaseConnectionV6 instance;
    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV6() {}
// thread safe but slow
    public static synchronized DatabaseConnectionV6 getInstance()
    {
        if(instance == null)
            instance =  new DatabaseConnectionV6();
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
