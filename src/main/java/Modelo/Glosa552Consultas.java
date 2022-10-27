package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa552Consultas extends Conexion {

    public boolean registrar(Glosa552 glosa552) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa552 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, VinNumeroSerie, "
                + "KilometrajeVehiculo, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa552.getPatente());
            ps.setString(2, glosa552.getPedimento());
            ps.setString(3, glosa552.getSeccionAduanera());
            ps.setString(4, glosa552.getFraccion());
            ps.setString(5, glosa552.getSecuenciaFraccion());
            ps.setString(6, glosa552.getVinNumeroSerie());
            ps.setDouble(7, glosa552.getKilometrajeVehiculo());
            ps.setDate(8, glosa552.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa552Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa552Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa552 glosa552) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa552 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa552.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa552Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa552Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa552 glosa552) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa552 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa552.getAño());
            ps.setInt(2, glosa552.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa552Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa552Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa552 glosa552) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, VinNumeroSerie;
        double KilometrajeVehiculo;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa552 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa552> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa552.getFechaInicio());
            ps.setDate(2, glosa552.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                VinNumeroSerie = rs.getString("VinNumeroSerie");
                KilometrajeVehiculo = rs.getDouble("KilometrajeVehiculo");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa552 g552 = new Glosa552(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, VinNumeroSerie, KilometrajeVehiculo, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g552);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa552Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa552Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa552 glosa552) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa552 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, VinNumeroSerie = ?, "
                + "KilometrajeVehiculo = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa552.getPatente());
            ps.setString(2, glosa552.getPedimento());
            ps.setString(3, glosa552.getSeccionAduanera());
            ps.setString(4, glosa552.getFraccion());
            ps.setString(5, glosa552.getSecuenciaFraccion());
            ps.setString(6, glosa552.getVinNumeroSerie());
            ps.setDouble(8, glosa552.getKilometrajeVehiculo());
            ps.setDate(9, glosa552.getFechaPagoReal());
            ps.setInt(10, glosa552.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa552Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa552Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
