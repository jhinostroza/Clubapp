
package app.model;

public class General {
    
    private int idGeneral;
    private String usuario;
    private String password;

    public General() {
    }

    public int getIdGeneral() {
        return idGeneral;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setIdGeneral(int idGeneral) {
        this.idGeneral = idGeneral;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }        
    
}
