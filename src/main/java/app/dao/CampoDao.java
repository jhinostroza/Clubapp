package app.dao;

import app.model.Campo;
import app.zhelper.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CampoDao extends BaseDao{
    
    public Campo insertar (Campo vo) throws DaoExcepcion{
        
        System.out.println("CampoDao: insertar()");
        
        String query = "INSERT INTO campo (id,descripcion,estado,tipo,costoHora,idLocal) VALUES (?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            
            con = ConexionDB.obtenerConexion();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(query);
            stmt.setInt(1, (int) vo.getId());
            stmt.setString(2, vo.getDescripcion());
            stmt.setInt(3, vo.getEstado());
            stmt.setInt(4, vo.getTipo());
            stmt.setDouble(5, vo.getCostoHora());
           // stmt.setLocal(6, vo.getIdLocal());
            
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se realizo la inserción");
            }

            /*int extrae = 0;
             query = "select LAST_INSERT_ID()";
             stmt = con.prepareStatement(query);*/
            con.commit();
            
        }catch(SQLException e){
            
            try {
                con.rollback();
            } catch (SQLException e1) {
                throw new DaoExcepcion(e.getMessage());
            }
            System.err.println(e.getMessage());
            throw new DaoExcepcion(e.getMessage());
            
        }finally{
            
            try {
                con.setAutoCommit(true);
            } catch (SQLException e) {
                throw new DaoExcepcion(e.getMessage());
            }
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
            
        }
        return vo;
    }
    
}
