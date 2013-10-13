
package model;

public class Socio {
    
    private int idSocio;
    private String email;
    private String nombre;
    private String paterno;
    private String materno;
    private String celular;
    private String sexo;
    private String direccion;
    private Solicitud solicitud;

    public Socio() {
    }

    public int getIdSocio() {
        return idSocio;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
}
