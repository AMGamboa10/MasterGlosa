package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa510Consultas extends Conexion {

    public boolean registrar(Glosa510 glosa510) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa510 (Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, "
                + "ImportePago, TipoPedimento, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa510.getPatente());
            ps.setString(2, glosa510.getPedimento());
            ps.setString(3, glosa510.getSeccionAduanera());
            ps.setString(4, glosa510.getClaveContribucion());
            ps.setString(5, glosa510.getFormaPago());
            ps.setDouble(6, glosa510.getImportePago());
            ps.setString(7, glosa510.getTipoPedimento());
            ps.setDate(8, glosa510.getFechaPagoReal());
            
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa510Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa510Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa510 glosa510) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa510 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa510.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa510Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa510Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa510 glosa510) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa510 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa510.getAño());
            ps.setInt(2, glosa510.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa510Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa510Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa510 glosa510) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, TipoPedimento;
        double ImportePago;
        java.sql.Date FechaPagoReal;

        String sql = "";

        ArrayList<Glosa510> lista = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa510.getFechaInicio());
            ps.setDate(2, glosa510.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                ClaveContribucion = rs.getString("ClaveContribucion");
                FormaPago = rs.getString("FormaPago");
                ImportePago = rs.getDouble("ImportePago");
                TipoPedimento = rs.getString("TipoPedimento");
                FechaPagoReal = rs.getDate("FechaPagoReal");
                
                //Asignamos nuestros valores en el constructor de glosa
                Glosa510 g510 = new Glosa510(id, Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, ImportePago, TipoPedimento, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g510);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa510Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa510Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa510 glosa510) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa510 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, ClaveContribucion = ?, FormaPago = ?, "
                + "ImportePago = ?, TipoPedimento = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa510.getPatente());
            ps.setString(2, glosa510.getPedimento());
            ps.setString(3, glosa510.getSeccionAduanera());
            ps.setString(4, glosa510.getClaveContribucion());
            ps.setString(5, glosa510.getFormaPago());
            ps.setDouble(6, glosa510.getImportePago());
            ps.setString(7, glosa510.getTipoPedimento());
            ps.setDate(8, glosa510.getFechaPagoReal());
            ps.setInt(9, glosa510.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa510Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa510Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
