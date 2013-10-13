package app.controller.servicios;

import app.dao.DaoExcepcion;
import app.dao.ServicioDao;
import app.model.Servicio;

public class GestionServicio {

    public static void main(String[] args) throws DaoExcepcion {
        // Servicio drsdr = GestionServicio.insertar();
        GestionServicio.insertar(3, "PRUEBA1", 0.00);
    }

    /*public static Servicio insertar() throws DaoExcepcion {
        ServicioDao dao = new ServicioDao();
        Servicio serv = new Servicio();
        return dao.insertar(serv);
    }*/

    public static Servicio insertar(int id, String descripcion, double costo)
            throws DaoExcepcion {
        ServicioDao dao = new ServicioDao();
        Servicio serv = new Servicio();
        serv.setId(id);
        serv.setDescripcion(descripcion);
        serv.setCostoHora(costo);
        return dao.insertar(serv);
    }
}
