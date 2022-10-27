package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa702Consultas extends Conexion {

    public boolean registrar(Glosa702 glosa702) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa702 (Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, ImportePago, "
                + "TipoPedimento, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa702.getPatente());
            ps.setString(2, glosa702.getPedimento());
            ps.setString(3, glosa702.getSeccionAduanera());
            ps.setString(4, glosa702.getClaveContribucion());
            ps.setString(5, glosa702.getFormaPago());
            ps.setDouble(6, glosa702.getImportePago());
            ps.setString(7, glosa702.getTipoPedimento());
            ps.setDate(8, glosa702.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa702Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa702Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa702 glosa702) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa702 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa702.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa702Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa702Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa702 glosa702) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa702 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa702.getAño());
            ps.setInt(2, glosa702.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa702Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa702Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa702 glosa702) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, TipoPedimento;
        double ImportePago;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa702 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa702> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa702.getFechaInicio());
            ps.setDate(2, glosa702.getFechaFinal());
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
                Glosa702 g702 = new Glosa702(id, Patente, Pedimento, SeccionAduanera, ClaveContribucion, FormaPago, ImportePago, TipoPedimento, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g702);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa702Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa702Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa702 glosa702) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa702 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, ClaveContribucion = ?, FormaPago = ?, "
                + "ImportePago = ?, TipoPedimento = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa702.getPatente());
            ps.setString(2, glosa702.getPedimento());
            ps.setString(3, glosa702.getSeccionAduanera());
            ps.setString(4, glosa702.getClaveContribucion());
            ps.setString(5, glosa702.getFormaPago());
            ps.setDouble(6, glosa702.getImportePago());
            ps.setString(7, glosa702.getTipoPedimento());
            ps.setDate(8, glosa702.getFechaPagoReal());
            ps.setInt(1, glosa702.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa702Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa702Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
