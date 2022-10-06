package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    Connection connection;
    static String bd = "service_offerings";
    static String port  = "3306";
    static String login = "root";
    static String password = "admin";
    
    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.bd;
            connection = DriverManager.getConnection(url,this.login,this.password);
            System.out.println("CONEXION");
        }catch(Exception ex){
            System.out.println("ERROR");
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void desconectar(){
        this.connection = null;
    }
    
}
