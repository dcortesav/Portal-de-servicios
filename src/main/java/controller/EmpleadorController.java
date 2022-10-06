package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Empleador;
import connection.DBConnection;

public class EmpleadorController implements IEmpleadorController {

    @Override
    public String login(String id_empleador, String contrasena) {

        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM empleador WHERE id_empleador = "+id_empleador+" and em_contrasena = '"+contrasena+"'";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String email = rs.getString("em_email");
                String nombre = rs.getString("em_nombre");
                String apellido = rs.getString("em_apellido");
                double saldo = rs.getDouble("em_saldo");
                boolean premium = rs.getBoolean("em_premium");

                Empleador emp = new Empleador(Integer.parseInt(id_empleador),email,contrasena,nombre,apellido,saldo,premium);
                return gson.toJson(emp);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String id_empleador, String email, String contrasena, String nombre, String apellido, double saldo, boolean premium) {

        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        String sql = "INSERT INTO empleador values("+id_empleador+", '"+email+"', '"+contrasena+"', '"+nombre+"', '"+apellido+"', "+saldo+", "+premium+")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Empleador emp = new Empleador(Integer.parseInt(id_empleador), email, contrasena, nombre, apellido, saldo, premium);

            st.close();

            return gson.toJson(emp);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }

  
}
