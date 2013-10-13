
package app.Servicios;

import app.dao.GeneralDao;
import app.dao.DaoExcepcion;
import app.model.General;


public class gestionGeneral {
    
    public static void main(String[] args) throws DaoExcepcion{
        gestionGeneral.insertar();
    }
    
    public static void insertar(){
        GeneralDao dao = new GeneralDao();
        General gene = new General();
        return dao.insertar(gene);
    }
    
}
