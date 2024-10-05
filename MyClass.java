import java.sql.*;

public class MyClass {
    public void printMessage() {
        System.out.println("Hello from MyClass!");
    }
    public void sqlInsert() {
        System.out.println("Inserting sql code");
    }

    public void sqlQuery(Connection conn) {

        try  {
            // ResultSet rs = st.executeQuery("SELECT * FROM mytable WHERE columnfoo = 500");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM products;");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("SQLException hit: " + e.getMessage());
        }
    }

}