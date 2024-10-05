import java.sql.*;

public class ManageDatabase {

    public static void main(String[] args) {
        System.out.println("Hello");

        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.makeConnection();

        MyClass myObject = new MyClass();
        myObject.printMessage();
        myObject.sqlInsert();
        myObject.sqlQuery(conn);
        
    }
}