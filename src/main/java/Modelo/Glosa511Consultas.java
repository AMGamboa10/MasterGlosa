package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa511Consultas extends Conexion {

    public boolean registrar(Glosa511 glosa511) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa511 (Patente, Pedimento, SeccionAduanera, SecuenciaObservacion, "
                + "Observaciones, TipoPedimento, FechaValidacionPagoR) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa511.getPatente());
            ps.setString(2, glosa511.getPedimento());
            ps.setString(3, glosa511.getSeccionAduanera());
            ps.setString(4, glosa511.getSecuenciaObservacion());
            ps.setString(5, glosa511.getObservaciones());
            ps.setString(6, glosa511.getTipoPedimento());
            ps.setDate(7, glosa511.getFechaValidacionPagoR());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa511Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa511Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa511 glosa511) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from Glosa511 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa511.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa511Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa511Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa511 glosa511) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa511 WHERE year(FechaValidacionPagoR) = ? And month(FechaValidacionPagoR) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa511.getAño());
            ps.setInt(2, glosa511.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa511Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa511Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa511 glosa511) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, SecuenciaObservacion, Observaciones, TipoPedimento;
        java.sql.Date FechaValidacionPagoR;

        String sql = "Select * from Glosa511 Where FechaValidacionPagoR >= ? and FechaValidacionPagoR <=?;";

        ArrayList<Glosa511> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa511.getFechaInicio());
            ps.setDate(2, glosa511.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                SecuenciaObservacion = rs.getString("SecuenciaObservacion");
                Observaciones = rs.getString("Observaciones");
                TipoPedimento = rs.getString("TipoPedimento");
                FechaValidacionPagoR = rs.getDate("FechaValidacionPagoR");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa511 g511 = new Glosa511(id, Patente, Pedimento, SeccionAduanera, SecuenciaObservacion, Observaciones, TipoPedimento, FechaValidacionPagoR);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g511);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa511Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa511Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa511 glosa511) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa511 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, SecuenciaObservacion = ?, Observaciones = ?, TipoPedimento = ?, "
                + "FechaValidacionPagoR = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa511.getPatente());
            ps.setString(2, glosa511.getPedimento());
            ps.setString(3, glosa511.getSeccionAduanera());
            ps.setString(4, glosa511.getSecuenciaObservacion());
            ps.setString(5, glosa511.getObservaciones());
            ps.setString(6, glosa511.getTipoPedimento());
            ps.setDate(7, glosa511.getFechaValidacionPagoR());
            ps.setInt(8, glosa511.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa511Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa511Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
