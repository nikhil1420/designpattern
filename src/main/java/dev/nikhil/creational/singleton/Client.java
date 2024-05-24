package dev.nikhil.creational.singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnectionV1 db1 = new DatabaseConnectionV1();
        DatabaseConnectionV1 db2 = new DatabaseConnectionV1();
        System.out.println(db1==db2); // false

       // new DatabaseConnectionV2(); private

        DatabaseConnectionV3 db3O1 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 db3O2 = DatabaseConnectionV3.getInstance();
        System.out.println(db3O1 == db3O2); // false
        DatabaseConnectionV4 db4O1 = DatabaseConnectionV4.getInstance();
        DatabaseConnectionV4 db4O2 = DatabaseConnectionV4.getInstance();
        System.out.println(db4O1 == db4O2); // true

        DatabaseConnectionV5 db5O1 = DatabaseConnectionV5.getInstance();
        DatabaseConnectionV5 db5O2 = DatabaseConnectionV5.getInstance();
        System.out.println(db5O1 == db5O2); // true but egarly initialization

        DatabaseConnectionV6 db6O1 = DatabaseConnectionV6.getInstance();
        DatabaseConnectionV6 db6O2 = DatabaseConnectionV6.getInstance();
        System.out.println(db6O1 == db6O2);

        DatabaseConnectionV7 db7O1 = DatabaseConnectionV7.getInstance();
        DatabaseConnectionV7 db7O2 = DatabaseConnectionV7.getInstance();
        System.out.println(db7O1 == db7O2);

    }
}
