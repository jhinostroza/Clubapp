
package app.model;

import java.util.Collection;
import java.util.Date;

public class Solicitud {
    
    private int idSolicitud;
    private String horaInicio;
    private String horaFin;
    private Date dia;
    private String servicios;
    private int estado;
    private Collection<Socio> socio;
    private Collection<Campo> campo;

    public Solicitud() {
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public Date getDia() {
        return dia;
    }

    public String getServicios() {
        return servicios;
    }

    public int getEstado() {
        return estado;
    }

    public Collection<Socio> getSocio() {
        return socio;
    }

    public Collection<Campo> getCampo() {
        return campo;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setSocio(Collection<Socio> socio) {
        this.socio = socio;
    }

    public void setCampo(Collection<Campo> campo) {
        this.campo = campo;
    }
   
}
