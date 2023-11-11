// prepparedStatement insert

import java.sql.*;
import java.io.*;

public class PreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connnection

                String url = "jdbc:mysql://localhost:3306/learning";
                String username = "root";
                String password = "vatsal";

            Connection con = DriverManager.getConnection(url, username, password);

            //create query

            String query = "insert into table1(tName,tCity) values (?,?)";

            // get preparedstatement object
            java.sql.PreparedStatement pstmt = con.prepareStatement(query);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name:");
            String name =br.readLine();

            System.out.println("enter city:");
            String city = br.readLine();

            // set value of query
            pstmt.setString(1,name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();

            System.out.println("inserted... ");

            con.close();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
