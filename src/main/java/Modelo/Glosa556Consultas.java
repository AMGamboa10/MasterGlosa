package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa556Consultas extends Conexion {

    public boolean registrar(Glosa556 glosa556) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa556 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveContribucion, TasaContribucion, "
                + "TipoTasa, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa556.getPatente());
            ps.setString(2, glosa556.getPedimento());
            ps.setString(3, glosa556.getSeccionAduanera());
            ps.setString(4, glosa556.getFraccion());
            ps.setString(5, glosa556.getSecuenciaFraccion());
            ps.setString(6, glosa556.getClaveContribucion());
            ps.setDouble(7, glosa556.getTasaContribucion());
            ps.setString(8, glosa556.getTipoTasa());
            ps.setDate(9, glosa556.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa556Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa556Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa556 glosa556) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa556 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa556.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa556Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa556Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa556 glosa556) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa556 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa556.getAño());
            ps.setInt(2, glosa556.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa556Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa556Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa556 glosa556) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveContribucion, TipoTasa;
        java.sql.Date FechaPagoReal;
        double TasaContribucion;

        String sql = "Select * from Glosa556 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa556> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa556.getFechaInicio());
            ps.setDate(2, glosa556.getFechaFinal());
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
                TasaContribucion = rs.getDouble("TasaContribucion");
                TipoTasa = rs.getString("TipoTasa");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa556 g556 = new Glosa556(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, ClaveContribucion, TasaContribucion, TipoTasa, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g556);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa556Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa556Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa556 glosa556) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa556 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, "
                + "ClaveContribucion = ?, TasaContribucion = ?, TipoTasa = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa556.getPatente());
            ps.setString(2, glosa556.getPedimento());
            ps.setString(3, glosa556.getSeccionAduanera());
            ps.setString(4, glosa556.getFraccion());
            ps.setString(5, glosa556.getSecuenciaFraccion());
            ps.setString(6, glosa556.getClaveContribucion());
            ps.setDouble(7, glosa556.getTasaContribucion());
            ps.setString(8, glosa556.getTipoTasa());
            ps.setDate(9, glosa556.getFechaPagoReal());
            ps.setInt(10, glosa556.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa556Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa556Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
