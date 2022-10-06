package beans;

public class Ofertante {
    
    private int id_ofertante;
    private String of_nombre;
    private String of_apellido;
    private String of_email;
    private String of_celular;
    private int of_edad;
    private String of_genero;
    private String of_ciudad;
    private boolean of_disponible;
    private String categoria_servicio;
    private String nombre_servicio;
    private String descripcion_servicio;
    private double costo_hora;
    private boolean profesional;

    public Ofertante(int id_ofertante, String of_nombre, String of_apellido, String of_email, String of_celular, int of_edad, String of_genero, String of_ciudad, boolean of_disponible, String categoria_servicio, String nombre_servicio, String descripcion_servicio, double costo_hora, boolean profesional) {
        this.id_ofertante = id_ofertante;
        this.of_nombre = of_nombre;
        this.of_apellido = of_apellido;
        this.of_email = of_email;
        this.of_celular = of_celular;
        this.of_edad = of_edad;
        this.of_genero = of_genero;
        this.of_ciudad = of_ciudad;
        this.of_disponible = of_disponible;
        this.categoria_servicio = categoria_servicio;
        this.nombre_servicio = nombre_servicio;
        this.descripcion_servicio = descripcion_servicio;
        this.costo_hora = costo_hora;
        this.profesional = profesional;
    }

    public int getId_ofertante() {
        return id_ofertante;
    }

    public void setId_ofertante(int id_ofertante) {
        this.id_ofertante = id_ofertante;
    }

    public String getOf_nombre() {
        return of_nombre;
    }

    public void setOf_nombre(String of_nombre) {
        this.of_nombre = of_nombre;
    }

    public String getOf_apellido() {
        return of_apellido;
    }

    public void setOf_apellido(String of_apellido) {
        this.of_apellido = of_apellido;
    }

    public String getOf_email() {
        return of_email;
    }

    public void setOf_email(String of_email) {
        this.of_email = of_email;
    }

    public String getOf_celular() {
        return of_celular;
    }

    public void setOf_celular(String of_celular) {
        this.of_celular = of_celular;
    }

    public int getOf_edad() {
        return of_edad;
    }

    public void setOf_edad(int of_edad) {
        this.of_edad = of_edad;
    }

    public String getOf_genero() {
        return of_genero;
    }

    public void setOf_genero(String of_genero) {
        this.of_genero = of_genero;
    }

    public String getOf_ciudad() {
        return of_ciudad;
    }

    public void setOf_ciudad(String of_ciudad) {
        this.of_ciudad = of_ciudad;
    }

    public boolean isOf_disponible() {
        return of_disponible;
    }

    public void setOf_disponible(boolean of_disponible) {
        this.of_disponible = of_disponible;
    }

    public String getCategoria_servicio() {
        return categoria_servicio;
    }

    public void setCategoria_servicio(String categoria_servicio) {
        this.categoria_servicio = categoria_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDescripcion_servicio() {
        return descripcion_servicio;
    }

    public void setDescripcion_servicio(String descripcion_servicio) {
        this.descripcion_servicio = descripcion_servicio;
    }

    public double getCosto_hora() {
        return costo_hora;
    }

    public void setCosto_hora(double costo_hora) {
        this.costo_hora = costo_hora;
    }

    public boolean isProfesional() {
        return profesional;
    }

    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "Ofertante{" + "id_ofertante=" + id_ofertante + ", of_nombre=" + of_nombre + ", of_apellido=" + of_apellido + ", of_email=" + of_email + ", of_celular=" + of_celular + ", of_edad=" + of_edad + ", of_genero=" + of_genero + ", of_ciudad=" + of_ciudad + ", of_disponible=" + of_disponible + ", categoria_servicio=" + categoria_servicio + ", nombre_servicio=" + nombre_servicio + ", descripcion_servicio=" + descripcion_servicio + ", costo_hora=" + costo_hora + ", profesional=" + profesional + '}';
    }
    
}
