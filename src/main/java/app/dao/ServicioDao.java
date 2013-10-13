package app.dao;

import app.model.Servicio;
import app.zhelper.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicioDao extends BaseDao {

    public Servicio insertar(Servicio vo) throws DaoExcepcion {

        System.out.println("ServicioDAO: insertar()");
        //INSERT INTO javaweb.servicio (id,descripcion,costoHora) VALUES ('1','Campeonatos','100.00')
        String query = "INSERT INTO javaweb.servicio (id,descripcion,costoHora) VALUES(?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConexionDB.obtenerConexion();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(query);
            stmt.setInt(1, 2);
            stmt.setString(2, "Campamentos");
            stmt.setDouble(3, 500.00);

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
