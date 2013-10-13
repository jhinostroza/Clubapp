package app.dao;

import app.model.Socio;
import app.zhelper.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SocioDao extends BaseDao{

    public Socio insertar(Socio vo) throws DaoExcepcion {
        
         System.out.println("ServicioDAO: insertar()");
        //INSERT INTO `javaweb`.`socio` (`id`, `email`, `nombres`, `paterno`, `materno`, `celular`, `sexo`, `direccion`) 
         //VALUES ('1', 'sli@gmail.com', 'david', 'flores', 'lujan', '990984367', 'M', 'aV.jOSE');
        String query = "INSERT INTO javaweb.socio (id,email,nombres,paterno,materno,celular,sexo,direccion) VALUES(?,?,?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConexionDB.obtenerConexion();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getIdSocio());
            stmt.setString(2,vo.getEmail());
            stmt.setString(3, vo.getNombre());
            stmt.setString(4, vo.getPaterno());
            stmt.setString(5, vo.getMaterno());
            stmt.setString(6, vo.getCelular());
            stmt.setString(7, vo.getSexo());
            stmt.setString(8, vo.getDireccion());

            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se realizo la inserción");
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                throw new DaoExcepcion(e.getMessage());
            }
            System.err.println(e.getMessage());
            throw new DaoExcepcion(e.getMessage());
        } finally {
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
