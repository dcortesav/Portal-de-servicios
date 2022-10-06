package beans;

import java.sql.Date;

public class Servicio_contratado {
    
    private int id_servicio;
    private int id_ofertante;
    private int id_empleador;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Servicio_contratado(int id_servicio, int id_ofertante, int id_empleador, Date fecha_inicio, Date fecha_fin) {
        this.id_servicio = id_servicio;
        this.id_ofertante = id_ofertante;
        this.id_empleador = id_empleador;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_ofertante() {
        return id_ofertante;
    }

    public void setId_ofertante(int id_ofertante) {
        this.id_ofertante = id_ofertante;
    }

    public int getId_empleador() {
        return id_empleador;
    }

    public void setId_empleador(int id_empleador) {
        this.id_empleador = id_empleador;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "Servicio_contratado{" + "id_servicio=" + id_servicio + ", id_ofertante=" + id_ofertante + ", id_empleador=" + id_empleador + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
    }
    
}
