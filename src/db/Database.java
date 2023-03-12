package db;

import java.beans.Customizer;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    private static Database dbConnection;
    private Connection connection;

    private Database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ThogaKade?useSSL=false", "root", "Pasan$@776144");
    }
    public static Database getInstance() throws SQLException, ClassNotFoundException {
        return (null == dbConnection) ? dbConnection = new Database() : dbConnection;
    }
    public Connection getConnection() {
        return connection;
    }

}
