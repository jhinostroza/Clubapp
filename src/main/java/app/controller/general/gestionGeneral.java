
package app.controller.general;

import app.dao.GeneralDao;
import app.dao.DaoExcepcion;
import app.model.General;


public class gestionGeneral {
    
    public static void main(String[] args) throws DaoExcepcion{
        General gen =gestionGeneral.insertar();
    }
    
    public static General insertar() throws DaoExcepcion{
        GeneralDao dao = new GeneralDao();
        General gene = new General();
        return dao.insertar(gene);
    }
    
}
