package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa553Consultas extends Conexion {

    public boolean registrar(Glosa553 glosa553) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa553 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClavePermiso, FirmaDescargo, "
                + "NumeroPermiso, ValorComercialDolares, CantidadMUMTarifa, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa553.getPatente());
            ps.setString(2, glosa553.getPedimento());
            ps.setString(3, glosa553.getSeccionAduanera());
            ps.setString(4, glosa553.getFraccion());
            ps.setString(5, glosa553.getSecuenciaFraccion());
            ps.setString(6, glosa553.getClavePermiso());
            ps.setString(7, glosa553.getFirmaDescargo());
            ps.setString(8, glosa553.getNumeroPermiso());
            ps.setDouble(9, glosa553.getValorComercialDolares());
            ps.setDouble(10, glosa553.getCantidadMUMTarifa());
            ps.setDate(11, glosa553.getFechaPagoReal());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa553Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa553Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa553 glosa553) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa553 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa553.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa553Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa553Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa553 glosa553) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa553 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa553.getAño());
            ps.setInt(2, glosa553.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa553Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa553Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa553 glosa553) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClavePermiso, FirmaDescargo, NumeroPermiso;
        double ValorComercialDolares, CantidadMUMTarifa;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa553 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa553> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa553.getFechaInicio());
            ps.setDate(2, glosa553.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                ClavePermiso = rs.getString("ClavePermiso");
                FirmaDescargo = rs.getString("FirmaDescargo");
                NumeroPermiso = rs.getString("NumeroPermiso");
                ValorComercialDolares = rs.getDouble("ValorComercialDolares");
                CantidadMUMTarifa = rs.getDouble("CantidadMUMTarifa");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa553 g553 = new Glosa553(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClavePermiso, FirmaDescargo, NumeroPermiso, ValorComercialDolares, CantidadMUMTarifa, FechaPagoReal);

                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g553);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa553Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa553Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa553 glosa553) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa553 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, ClavePermiso = ?, "
                + "FirmaDescargo = ?, NumeroPermiso = ?, ValorComercialDolares = ?, CantidadMUMTarifa = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa553.getPatente());
            ps.setString(2, glosa553.getPedimento());
            ps.setString(3, glosa553.getSeccionAduanera());
            ps.setString(4, glosa553.getFraccion());
            ps.setString(5, glosa553.getSecuenciaFraccion());
            ps.setString(6, glosa553.getClavePermiso());
            ps.setString(7, glosa553.getFirmaDescargo());
            ps.setString(8, glosa553.getNumeroPermiso());
            ps.setDouble(9, glosa553.getValorComercialDolares());
            ps.setDouble(10, glosa553.getCantidadMUMTarifa());
            ps.setDate(11, glosa553.getFechaPagoReal());
            ps.setInt(12, glosa553.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa553Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa553Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
