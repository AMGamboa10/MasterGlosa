package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa558Consultas extends Conexion {

    public boolean registrar(Glosa558 glosa558) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa558 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, "
                + "SecuenciaObservacion, Observaciones, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa558.getPatente());
            ps.setString(2, glosa558.getPedimento());
            ps.setString(3, glosa558.getSeccionAduanera());
            ps.setString(4, glosa558.getFraccion());
            ps.setString(5, glosa558.getSecuenciaFraccion());
            ps.setString(6, glosa558.getSecuenciaObservacion());
            ps.setString(7, glosa558.getObservaciones());
            ps.setDate(8, glosa558.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa558Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa558Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa558 glosa558) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa558 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa558.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa558Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa558Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa558 glosa558) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa558 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa558.getAño());
            ps.setInt(2, glosa558.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa558Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa558Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa558 glosa558) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, SecuenciaObservacion, Observaciones;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa558 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa558> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa558.getFechaInicio());
            ps.setDate(2, glosa558.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                SecuenciaObservacion = rs.getString("SecuenciaObservacion");
                Observaciones = rs.getString("Observaciones");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa558 g558 = new Glosa558(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, SecuenciaObservacion, Observaciones, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g558);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa558Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa558Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa558 glosa558) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa558 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, "
                + "SecuenciaObservacion = ?, Observaciones = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa558.getPatente());
            ps.setString(2, glosa558.getPedimento());
            ps.setString(3, glosa558.getSeccionAduanera());
            ps.setString(4, glosa558.getFraccion());
            ps.setString(5, glosa558.getSecuenciaFraccion());
            ps.setString(6, glosa558.getSecuenciaObservacion());
            ps.setString(7, glosa558.getObservaciones());
            ps.setDate(8, glosa558.getFechaPagoReal());
            ps.setInt(9, glosa558.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa558Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa558Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
