
package app.Servicios;

import app.dao.DaoExcepcion;
import app.dao.ServicioDao;
import app.model.Servicio;

public class GestionServicio {
    
    public static void main(String[] args) throws DaoExcepcion {
        Servicio drsdr= GestionServicio.insertar();
    }
    
    
    public static Servicio insertar() throws DaoExcepcion {
        
        ServicioDao dao=new ServicioDao();
        Servicio serv=new Servicio();
        return dao.insertar(serv);
        
    }
}
