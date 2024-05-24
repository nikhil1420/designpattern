package dev.nikhil.creational.singleton;

public class DatabaseConnectionV5 {
    private static DatabaseConnectionV5 instance = new DatabaseConnectionV5();
    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV5() {}

    public static DatabaseConnectionV5 getInstance()
    {
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
