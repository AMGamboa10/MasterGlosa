package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa554Consultas extends Conexion {

    public boolean registrar(Glosa554 glosa554) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa554 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveCaso, "
                + "IdentificadorCaso, ComplementoCaso, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa554.getPatente());
            ps.setString(2, glosa554.getPedimento());
            ps.setString(3, glosa554.getSeccionAduanera());
            ps.setString(4, glosa554.getFraccion());
            ps.setString(5, glosa554.getSecuenciaFraccion());
            ps.setString(6, glosa554.getClaveCaso());
            ps.setString(7, glosa554.getIdentificadorCaso());
            ps.setString(8, glosa554.getComplementoCaso());
            ps.setDate(9, glosa554.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa554Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa554Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa554 glosa554) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa554 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa554.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa554Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa554Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa554 glosa554) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa554 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa554.getAño());
            ps.setInt(2, glosa554.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa554Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa554Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa554 glosa554) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveCaso, IdentificadorCaso, ComplementoCaso;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa554 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa554> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa554.getFechaInicio());
            ps.setDate(2, glosa554.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                ClaveCaso = rs.getString("ClaveCaso");
                IdentificadorCaso = rs.getString("IdentificadorCaso");
                ComplementoCaso = rs.getString("ComplementoCaso");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa554 g554 = new Glosa554(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveCaso, IdentificadorCaso, ComplementoCaso, FechaPagoReal);

                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g554);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa554Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa554Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa554 glosa554) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa554 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, ClaveCaso = ?, "
                + "IdentificadorCaso = ?, ComplementoCaso = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa554.getPatente());
            ps.setString(2, glosa554.getPedimento());
            ps.setString(3, glosa554.getSeccionAduanera());
            ps.setString(4, glosa554.getFraccion());
            ps.setString(5, glosa554.getSecuenciaFraccion());
            ps.setString(6, glosa554.getClaveCaso());
            ps.setString(7, glosa554.getIdentificadorCaso());
            ps.setString(8, glosa554.getComplementoCaso());
            ps.setDate(9, glosa554.getFechaPagoReal());
            ps.setInt(10, glosa554.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa554Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa554Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
