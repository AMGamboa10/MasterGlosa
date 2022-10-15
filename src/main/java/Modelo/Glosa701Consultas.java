package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa701Consultas extends Conexion {

    public boolean registrar(Glosa701 glosa701) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa701 (Patente, Pedimento, SeccionAduanera, ClaveDocumento, FechaPago, PedimentoAnterior, "
                + "PatenteAnterior, SeccionAduaneraAnterior, DocumentoAnterior, FechaOperacionAnterior, PedimentoOriginal, PatenteAduanalOrig, "
                + "SeccionAduanalDespOrig, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa701.getPatente());
            ps.setString(2, glosa701.getPedimento());
            ps.setString(3, glosa701.getSeccionAduanera());
            ps.setString(4, glosa701.getClaveDocumento());
            ps.setDate(5, glosa701.getFechaPago());
            ps.setString(6, glosa701.getPedimentoAnterior());
            ps.setString(7, glosa701.getPatenteAnterior());
            ps.setString(8, glosa701.getSeccionAduaneraAnterior());
            ps.setString(9, glosa701.getDocumentoAnterior());
            ps.setDate(10, glosa701.getFechaOperacionAnterior());
            ps.setString(11, glosa701.getPedimentoOriginal());
            ps.setString(12, glosa701.getPatenteAduanalOrig());
            ps.setString(13, glosa701.getSeccionAduanalDespOrig());
            ps.setDate(14, glosa701.getFechaPagoReal());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa701Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa701Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa701 glosa701) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa701 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa701.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa701Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa701Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa701 glosa701) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa701 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa701.getAño());
            ps.setInt(2, glosa701.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa701Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa701Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa701 glosa701) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, ClaveDocumento, PedimentoAnterior, PatenteAnterior, SeccionAduaneraAnterior, DocumentoAnterior,
                PedimentoOriginal, PatenteAduanalOrig, SeccionAduanalDespOrig;
        java.sql.Date FechaOperacionAnterior, FechaPago, FechaPagoReal;

        String sql = "Select * from Glosa701 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa701> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa701.getFechaInicio());
            ps.setDate(2, glosa701.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                ClaveDocumento = rs.getString("ClaveDocumento");
                FechaPago = rs.getDate("FechaPago");
                PedimentoAnterior = rs.getString("PedimentoAnterior");
                PatenteAnterior = rs.getString("PatenteAnterior");
                SeccionAduaneraAnterior = rs.getString("SeccionAduaneraAnterior");
                DocumentoAnterior = rs.getString("DocumentoAnterior");
                FechaOperacionAnterior = rs.getDate("FechaOperacionAnterior");
                PedimentoOriginal = rs.getString("PedimentoOriginal");
                PatenteAduanalOrig = rs.getString("PatenteAduanalOrig");
                SeccionAduanalDespOrig = rs.getString("SeccionAduanalDespOrig");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa701 g701 = new Glosa701(id, Patente, Pedimento, SeccionAduanera, ClaveDocumento, FechaPago, PedimentoAnterior, PatenteAnterior, SeccionAduaneraAnterior, DocumentoAnterior, FechaOperacionAnterior, PedimentoOriginal, PatenteAduanalOrig, SeccionAduanalDespOrig, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g701);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa701Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa701Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa701 glosa701) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa701 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, ClaveDocumento = ?, FechaPago = ?, PedimentoAnterior = ?, "
                + "PatenteAnterior = ?, SeccionAduaneraAnterior = ?, DocumentoAnterior = ?, FechaOperacionAnterior = ?, PedimentoOriginal = ?, PatenteAduanalOrig = ?, "
                + "SeccionAduanalDespOrig = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa701.getPatente());
            ps.setString(2, glosa701.getPedimento());
            ps.setString(3, glosa701.getSeccionAduanera());
            ps.setString(4, glosa701.getClaveDocumento());
            ps.setDate(5, glosa701.getFechaPago());
            ps.setString(6, glosa701.getPedimentoAnterior());
            ps.setString(7, glosa701.getPatenteAnterior());
            ps.setString(8, glosa701.getSeccionAduaneraAnterior());
            ps.setString(9, glosa701.getDocumentoAnterior());
            ps.setDate(10, glosa701.getFechaOperacionAnterior());
            ps.setString(11, glosa701.getPedimentoOriginal());
            ps.setString(12, glosa701.getPatenteAduanalOrig());
            ps.setString(13, glosa701.getSeccionAduanalDespOrig());
            ps.setDate(14, glosa701.getFechaPagoReal());
            ps.setInt(15, glosa701.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa701Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa701Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
