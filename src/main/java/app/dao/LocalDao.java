package app.dao;

import app.model.Local;
import app.zhelper.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocalDao extends BaseDao{
    
    public Local insertar (Local vo) throws DaoExcepcion{
        
        System.out.println("LocalDao: insertar()");
        
        String query = "INSERT INTO local (idLocal,direccion,descripcion,estado,maps,telefono) VALUES (?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            
            con = ConexionDB.obtenerConexion();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(query);
            stmt.setString(1, "001");
            stmt.setString(2, "Av. Salaverry 655 Jesus Maria");
            stmt.setString(3, "Ministerio de Trabajo y Promocion del Empleo");
            stmt.setString(4, "1");
            stmt.setString(4, "maps");
            stmt.setString(4, "5355432");

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
