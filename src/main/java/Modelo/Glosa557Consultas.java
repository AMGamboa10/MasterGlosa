package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa557Consultas extends Conexion {

    public boolean registrar(Glosa557 glosa557) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa557 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, "
                + "ClaveContribucion, FormaPago, ImportPago, FechaValidacionPagoR) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa557.getPatente());
            ps.setString(2, glosa557.getPedimento());
            ps.setString(3, glosa557.getSeccionAduanera());
            ps.setString(4, glosa557.getFraccion());
            ps.setString(5, glosa557.getSecuenciaFraccion());
            ps.setString(6, glosa557.getClaveContribucion());
            ps.setString(7, glosa557.getFormaPago());
            ps.setDouble(8, glosa557.getImportPago());
            ps.setDate(9, glosa557.getFechaValidacionPagoR());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa557 glosa557) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa557 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa557.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa557 glosa557) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa557 WHERE year(FechaValidacionPagoR) = ? And month(FechaValidacionPagoR) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa557.getAño());
            ps.setInt(2, glosa557.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa557 glosa557) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveContribucion, FormaPago;
        double ImportPago;
        java.sql.Date FechaValidacionPagoR;

        String sql = "Select * from Glosa557 Where FechaValidacionPagoR >= ? and FechaValidacionPagoR <=?;";

        ArrayList<Glosa557> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa557.getFechaInicio());
            ps.setDate(2, glosa557.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                ClaveContribucion = rs.getString("ClaveContribucion");
                FormaPago = rs.getString("FormaPago");
                ImportPago = rs.getDouble("ImportPago");
                FechaValidacionPagoR = rs.getDate("FechaValidacionPagoR");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa557 g557 = new Glosa557(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveContribucion, FormaPago, ImportPago, FechaValidacionPagoR);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g557);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa557 glosa557) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa557 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, "
                + "ClaveContribucion = ?, FormaPago = ?, ImportPago = ?, FechaValidacionPagoR = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa557.getPatente());
            ps.setString(2, glosa557.getPedimento());
            ps.setString(3, glosa557.getSeccionAduanera());
            ps.setString(4, glosa557.getFraccion());
            ps.setString(5, glosa557.getSecuenciaFraccion());
            ps.setString(6, glosa557.getClaveContribucion());
            ps.setString(7, glosa557.getFormaPago());
            ps.setDouble(8, glosa557.getImportPago());
            ps.setDate(9, glosa557.getFechaValidacionPagoR());
            ps.setInt(10, glosa557.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
