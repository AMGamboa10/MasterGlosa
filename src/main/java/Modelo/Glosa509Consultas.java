package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa509Consultas extends Conexion {

    public boolean registrar(Glosa509 glosa509) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa509 (Patente, Pedimento, SeccionAduanera, ClaveContribucion, TasaContribucion, "
                + "TipoTasa, TipoPedimento, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa509.getPatente());
            ps.setString(2, glosa509.getPedimento());
            ps.setString(3, glosa509.getSeccionAduanera());
            ps.setString(4, glosa509.getClaveContribucion());
            ps.setString(5, glosa509.getTasaContribucion());
            ps.setString(6, glosa509.getTipoTasa());
            ps.setString(7, glosa509.getTipoPedimento());
            ps.setDate(8, glosa509.getFechaPagoReal());
            ps.execute();
            con.close();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa509Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa509Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa509 glosa509) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa509 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa509.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa509Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa509Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa509 glosa509) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa509 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa509.getAño());
            ps.setInt(2, glosa509.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa509Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa509Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa509 glosa509) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, ClaveContribucion, TasaContribucion, TipoTasa, TipoPedimento;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa509 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa509> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa509.getFechaInicio());
            ps.setDate(2, glosa509.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                ClaveContribucion = rs.getString("ClaveContribucion");
                TasaContribucion = rs.getString("TasaContribucion");
                TipoTasa = rs.getString("TipoTasa");
                TipoPedimento = rs.getString("TipoPedimento");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa509 g509 = new Glosa509(id, Patente, Pedimento, SeccionAduanera, ClaveContribucion, TasaContribucion, TipoTasa, TipoPedimento, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g509);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa509Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa509Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa509 glosa509) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa509 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, ClaveContribucion = ?, TasaContribucion = ?, "
                + "TipoTasa = ?, TipoPedimento = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa509.getPatente());
            ps.setString(2, glosa509.getPedimento());
            ps.setString(3, glosa509.getSeccionAduanera());
            ps.setString(4, glosa509.getClaveContribucion());
            ps.setString(5, glosa509.getTasaContribucion());
            ps.setString(6, glosa509.getTipoTasa());
            ps.setString(7, glosa509.getTipoPedimento());
            ps.setDate(8, glosa509.getFechaPagoReal());
            ps.setInt(9, glosa509.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa509Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa509Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
