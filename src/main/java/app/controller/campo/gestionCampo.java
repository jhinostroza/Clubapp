package app.controller.campo;

import app.dao.CampoDao;
import app.dao.DaoExcepcion;
import app.model.Campo;

public class gestionCampo {
    
    public static void main(String[] args) throws DaoExcepcion{
        Campo campp = gestionCampo.insertar();
    }
    
    public static Campo insertar() throws DaoExcepcion{
        CampoDao dao = new CampoDao();
        Campo camp = new Campo();
        return dao.insertar(camp);
    }
    
}
