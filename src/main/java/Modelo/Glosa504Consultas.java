package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa504Consultas extends Conexion {

    public boolean registrar(Glosa504 glosa504) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa504 (Patente, Pedimento, SeccionAduanera, NumContenedor, TipoContenedor, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa504.getPatente());
            ps.setString(2, glosa504.getPedimento());
            ps.setString(3, glosa504.getSeccionAduanera());
            ps.setString(4, glosa504.getNumContenedor());
            ps.setString(5, glosa504.getTipoContenedor());
            ps.setDate(6, glosa504.getFechaPagoReal());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa504Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa504Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa504 glosa504) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa504 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa504.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa504Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa504Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa504 glosa504) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa504 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa504.getAño());
            ps.setInt(2, glosa504.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa504Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa504Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa504 glosa504) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, NumContenedor, TipoContenedor;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa504 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa504> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa504.getFechaInicio());
            ps.setDate(2, glosa504.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                NumContenedor = rs.getString("NumContenedor");
                TipoContenedor = rs.getString("TipoContenedor");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa504 g504 = new Glosa504(id, Patente, Pedimento, SeccionAduanera, NumContenedor, TipoContenedor, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g504);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa504Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa504Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa504 glosa504) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa504 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, NumContenedor = ?, TipoContenedor = ?, FechaPagoReal = ? WHERE ID = ?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa504.getPatente());
            ps.setString(2, glosa504.getPedimento());
            ps.setString(3, glosa504.getSeccionAduanera());
            ps.setString(4, glosa504.getNumContenedor());
            ps.setString(5, glosa504.getTipoContenedor());
            ps.setDate(6, glosa504.getFechaPagoReal());
            ps.setInt(7, glosa504.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa504Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa504Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
