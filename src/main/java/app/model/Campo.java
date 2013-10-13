
package app.model;


public class Campo {
    
      private long id;
      private String descripcion;
      private int estado;
      private int tipo;
      private double costoHora;
      private Local idLocal;

   
      
      
      public Campo(){
          
      }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    public Local getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Local idLocal) {
        this.idLocal = idLocal;
    }
      
      
}

