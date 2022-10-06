package test;

import beans.Empleador;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
        //listarEmpleadores();
        //actualizarEmpleador(2000456145, "actualizacion exitosa");
        listarEmpleadores();
    }
    
    public static void actualizarEmpleador(int id, String contrasena){
        DBConnection con = new DBConnection();
        String sql = "UPDATE empleador SET em_contrasena='"+contrasena+"' WHERE id_empleador="+id;
        
        try{
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
    }
    
    public static void listarEmpleadores(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM empleador;";
        
        try{
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id_empleador");
                String email = rs.getString("em_email");
                String contrasena = rs.getString("em_contrasena");
                String nombre = rs.getString("em_nombre");
                String apellido = rs.getString("em_apellido");
                double saldo = rs.getDouble("em_saldo");
                boolean premium = rs.getBoolean("em_premium");
                
                Empleador emp = new Empleador(id,email,contrasena,nombre,apellido,saldo,premium);
                System.out.println(emp.toString());
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
        
    }
    
}
