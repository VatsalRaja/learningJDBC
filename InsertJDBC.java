
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
    public static void main(String[] args) {
        try {
             //lead the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create a connection

        String url = "jdbc:mysql://localhost:3306/learning";
        String username = "root";
        String password = "vatsal";

        Connection con = DriverManager.getConnection(url, username, password);

            String query = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // create a statement

            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);

            System.out.println("table is created");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
