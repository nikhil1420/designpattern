package dev.nikhil.creational.singleton;

public class DatabaseConnectionV3 {
    private String url;
    private String username;
    private String password;
    private int port;

    private DatabaseConnectionV3() {}

    public static DatabaseConnectionV3 getInstance() {
        return new DatabaseConnectionV3();
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
