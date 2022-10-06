package beans;

public class Empleador {
    
    private int id_empleador;
    private String em_email;
    private String em_contrasena;
    private String em_nombre;
    private String em_apellido;
    private double em_saldo;
    private boolean em_premium;

    public Empleador(int id_empleador, String em_email, String em_contrasena, String em_nombre, String em_apellido, double em_saldo, boolean em_premium) {
        this.id_empleador = id_empleador;
        this.em_email = em_email;
        this.em_contrasena = em_contrasena;
        this.em_nombre = em_nombre;
        this.em_apellido = em_apellido;
        this.em_saldo = em_saldo;
        this.em_premium = em_premium;
    }

    public int getId_empleador() {
        return id_empleador;
    }

    public void setId_empleador(int id_empleador) {
        this.id_empleador = id_empleador;
    }

    public String getEm_email() {
        return em_email;
    }

    public void setEm_email(String em_email) {
        this.em_email = em_email;
    }

    public String getEm_contrasena() {
        return em_contrasena;
    }

    public void setEm_contrasena(String em_contrasena) {
        this.em_contrasena = em_contrasena;
    }

    public String getEm_nombre() {
        return em_nombre;
    }

    public void setEm_nombre(String em_nombre) {
        this.em_nombre = em_nombre;
    }

    public String getEm_apellido() {
        return em_apellido;
    }

    public void setEm_apellido(String em_apellido) {
        this.em_apellido = em_apellido;
    }

    public double getEm_saldo() {
        return em_saldo;
    }

    public void setEm_saldo(double em_saldo) {
        this.em_saldo = em_saldo;
    }

    public boolean isEm_premium() {
        return em_premium;
    }

    public void setEm_premium(boolean em_premium) {
        this.em_premium = em_premium;
    }

    @Override
    public String toString() {
        return "Empleador{" + "id_empleador=" + id_empleador + ", em_email=" + em_email + ", em_contrasena=" + em_contrasena + ", em_nombre=" + em_nombre + ", em_apellido=" + em_apellido + ", em_saldo=" + em_saldo + ", em_premium=" + em_premium + '}';
    }
    
    
    
}
