package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa503Consultas extends Conexion {

    public boolean registrar(Glosa503 glosa503) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa503 (Patente, Pedimento, SeccionAduanera, NumeroGuia, TipoGuia, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa503.getPatente());
            ps.setString(2, glosa503.getPedimento());
            ps.setString(3, glosa503.getSeccionAduanera());
            ps.setString(4, glosa503.getNumeroGuia());
            ps.setString(5, glosa503.getTipoGuia());
            ps.setDate(6, glosa503.getFechaPagoReal());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa503Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa503Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa503 glosa503) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa503 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa503.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa503Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa503Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa503 glosa503) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select * from Glosa503 Where FechaPago >= ? and FechaPago <=?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa503.getAño());
            ps.setInt(2, glosa503.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa503Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa503Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa503 glosa503) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, NumeroGuia, TipoGuia;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa503 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa503> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa503.getFechaInicio());
            ps.setDate(2, glosa503.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                NumeroGuia = rs.getString("NumeroGuia");
                TipoGuia = rs.getString("TipoGuia");
                FechaPagoReal = rs.getDate("FechaPagoReal");
                
                //Asignamos nuestros valores en el constructor de glosa
                Glosa503 g503 = new Glosa503(id, Patente, Pedimento, SeccionAduanera, NumeroGuia, TipoGuia, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g503);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa503Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa503Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa503 glosa503) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Update Glosa503 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, NumeroGuia = ?, TipoGuia = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa503.getPatente());
            ps.setString(2, glosa503.getPedimento());
            ps.setString(3, glosa503.getSeccionAduanera());
            ps.setString(4, glosa503.getNumeroGuia());
            ps.setString(5, glosa503.getTipoGuia());
            ps.setDate(6, glosa503.getFechaPagoReal());
            ps.setInt(7, glosa503.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa503Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa503Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
