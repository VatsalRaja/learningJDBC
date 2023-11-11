// Program for jdbc 1 Program

import java.sql.*;
class FirstJDBC {
public static void main(String[] args) {
    try {

        //lead the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create a connection

        String url = "jdbc:mysql://localhost:3306/learning";
        String username = "root";
        String password = "vatsal";

        Connection con = DriverManager.getConnection(url, username, password);

        if(con.isClosed()){
            System.out.println("Connectio is closed");
        }else{
            System.out.println("connection is created... ");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}