package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa507Consultas extends Conexion {

    public boolean registrar(Glosa507 glosa507) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa507 (Patente, Pedimento, SeccionAduanera, ClaveCaso, IdentificadorCaso, "
                + "TipoPedimento, ComplementoCaso, FechaValidacionPagoR) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa507.getPatente());
            ps.setString(2, glosa507.getPedimento());
            ps.setString(3, glosa507.getSeccionAduanera());
            ps.setString(4, glosa507.getClaveCaso());
            ps.setString(5, glosa507.getIdentificadorCaso());
            ps.setString(6, glosa507.getTipoPedimento());
            ps.setString(7, glosa507.getComplementoCaso());
            ps.setDate(8, glosa507.getFechaValidacionPagoR());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa507Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa507Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa507 glosa507) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa507 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa507.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa507Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa507Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa507 glosa507) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa507 WHERE year(FechaValidacionPagoR) = ? And month(FechaValidacionPagoR) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa507.getAño());
            ps.setInt(2, glosa507.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa507Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa507Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa507 glosa507) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, ClaveCaso, IdentificadorCaso, TipoPedimento, ComplementoCaso;
        java.sql.Date FechaValidacionPagoR;

        String sql = "Select * from Glosa507 Where FechaPago >= ? and FechaPago <=?;";

        ArrayList<Glosa507> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa507.getFechaInicio());
            ps.setDate(2, glosa507.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                ClaveCaso = rs.getString("ClaveCaso");
                IdentificadorCaso = rs.getString("IdentificadorCaso");
                TipoPedimento = rs.getString("TipoPedimento");
                ComplementoCaso = rs.getString("ComplementoCaso");
                FechaValidacionPagoR = rs.getDate("FechaValidacionPagoR");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa507 g507 = new Glosa507(id, Patente, Pedimento, SeccionAduanera, ClaveCaso, IdentificadorCaso, TipoPedimento, ComplementoCaso, FechaValidacionPagoR);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g507);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa507Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa507Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa507 glosa507) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa507 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, ClaveCaso = ?, IdentificadorCaso = ?, TipoPedimento = ?, ComplementoCaso = ?, FechaValidacionPagoR = ? WHERE ID = ?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa507.getPatente());
            ps.setString(2, glosa507.getPedimento());
            ps.setString(3, glosa507.getSeccionAduanera());
            ps.setString(4, glosa507.getClaveCaso());
            ps.setString(5, glosa507.getIdentificadorCaso());
            ps.setString(6, glosa507.getTipoPedimento());
            ps.setString(7, glosa507.getComplementoCaso());
            ps.setDate(8, glosa507.getFechaValidacionPagoR());
            ps.setInt(9, glosa507.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa507Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa507Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
