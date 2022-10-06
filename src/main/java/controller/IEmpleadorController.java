package controller;

import java.util.Map;

public interface IEmpleadorController {
    
    public String login(String id_empleador, String contrasena);
    
    public String register(String id, String email, String contrasena, String nombre, String apellido, double saldo, boolean premium);
    
}
