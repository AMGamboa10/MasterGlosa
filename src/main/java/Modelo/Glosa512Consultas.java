package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa512Consultas extends Conexion {

    public boolean registrar(Glosa512 glosa512) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa512 (Patente, Pedimento, SeccionAduanera, PatenteAduanalOrig, PedimentoOriginal, SeccionAduaneraDespOrig, "
                + "DocumentoOriginal, FechaOperacionOrig, FraccionOriginal, UnidadMedida, MercanciaDescargada, TipoPedimento, FechaPagoReal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa512.getPatente());
            ps.setString(2, glosa512.getPedimento());
            ps.setString(3, glosa512.getSeccionAduanera());
            ps.setString(4, glosa512.getPatenteAduanalOrig());
            ps.setString(5, glosa512.getPedimentoOriginal());
            ps.setString(6, glosa512.getSeccionAduaneraDespOrig());
            ps.setString(7, glosa512.getDocumentoOriginal());
            ps.setDate(8, glosa512.getFechaOperacionOrig());
            ps.setString(9, glosa512.getFraccionOriginal());
            ps.setString(10, glosa512.getUnidadMedida());
            ps.setDouble(11, glosa512.getMercanciaDescargada());
            ps.setString(12, glosa512.getTipoPedimento());
            ps.setDate(13, glosa512.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa512Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa512Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa512 glosa512) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from Glosa512 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa512.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa512Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa512Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa512 glosa512) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa512 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa512.getAño());
            ps.setInt(2, glosa512.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa512Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa512Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa512 glosa512) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, PatenteAduanalOrig, PedimentoOriginal, SeccionAduaneraDespOrig, DocumentoOriginal, FraccionOriginal, UnidadMedida, TipoPedimento;
        double MercanciaDescargada;
        java.sql.Date FechaOperacionOrig, FechaPagoReal;

        String sql = "Select * from Glosa512 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa512> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa512.getFechaInicio());
            ps.setDate(2, glosa512.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                PatenteAduanalOrig = rs.getString("PatenteAduanalOrig");
                PedimentoOriginal = rs.getString("PedimentoOriginal");
                SeccionAduaneraDespOrig = rs.getString("SeccionAduaneraDespOrig");
                DocumentoOriginal = rs.getString("DocumentoOriginal");
                FechaOperacionOrig = rs.getDate("FechaOperacionOrig");
                FraccionOriginal = rs.getString("FraccionOriginal");
                UnidadMedida = rs.getString("UnidadMedida");
                MercanciaDescargada = rs.getDouble("MercanciaDescargada");
                TipoPedimento = rs.getString("TipoPedimento");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa512 g512 = new Glosa512(id, Patente, Pedimento, SeccionAduanera, PatenteAduanalOrig, PedimentoOriginal, SeccionAduaneraDespOrig, DocumentoOriginal, FechaOperacionOrig, FraccionOriginal, UnidadMedida, MercanciaDescargada, TipoPedimento, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g512);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa512Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa512Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa512 glosa512) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Update Glosa512 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, PatenteAduanalOrig = ?, PedimentoOriginal = ?, "
                + "SeccionAduaneraDespOrig = ?, DocumentoOriginal = ?, FechaOperacionOrig = ?, FraccionOriginal = ?, UnidadMedida = ?, MercanciaDescargada = ?, "
                + "TipoPedimento = ?, FechaPagoReal = ? WHERE ID = ?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa512.getPatente());
            ps.setString(2, glosa512.getPedimento());
            ps.setString(3, glosa512.getSeccionAduanera());
            ps.setString(4, glosa512.getPatenteAduanalOrig());
            ps.setString(5, glosa512.getPedimentoOriginal());
            ps.setString(6, glosa512.getSeccionAduaneraDespOrig());
            ps.setString(7, glosa512.getDocumentoOriginal());
            ps.setDate(8, glosa512.getFechaOperacionOrig());
            ps.setString(9, glosa512.getFraccionOriginal());
            ps.setString(10, glosa512.getUnidadMedida());
            ps.setDouble(11, glosa512.getMercanciaDescargada());
            ps.setString(12, glosa512.getTipoPedimento());
            ps.setDate(13, glosa512.getFechaPagoReal());
            ps.setInt(14, glosa512.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa512Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa512Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
