package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa506Consultas extends Conexion {

    public boolean registrar(Glosa506 glosa506) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa506 (Patente, Pedimento, SeccionAduanera, TipoFecha, FechaOperacion, FechaValidacionPagoR) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa506.getPatente());
            ps.setString(2, glosa506.getPedimento());
            ps.setString(3, glosa506.getSeccionAduanera());
            ps.setDate(4, glosa506.getTipoFecha());
            ps.setDate(5, glosa506.getFechaOperacion());
            ps.setDate(6, glosa506.getFechaValidacionPagoR());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa506Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa506Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa506 glosa506) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa506 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa506.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa506Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa506Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa506 glosa506) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa506 WHERE year(FechaValidacionPagoR) = ? And month(FechaValidacionPagoR) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa506.getAño());
            ps.setInt(2, glosa506.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa506Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa506Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa506 glosa506) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera;
        java.sql.Date TipoFecha, FechaOperacion, FechaValidacionPagoR;

        String sql = "Select * from Glosa506 Where FechaPago >= ? and FechaPago <=?;";

        ArrayList<Glosa506> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa506.getFechaInicio());
            ps.setDate(2, glosa506.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                TipoFecha = rs.getDate("TipoFecha");
                FechaOperacion = rs.getDate("FechaOperacion");
                FechaValidacionPagoR = rs.getDate("FechaValidacionPagoR");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa506 g506 = new Glosa506(id, Patente, Pedimento, SeccionAduanera, TipoFecha, FechaOperacion, FechaValidacionPagoR);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g506);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa506Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa506Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa506 glosa506) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa506 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, TipoFecha = ?, FechaOperacion = ?, FechaValidacionPagoR = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa506.getPatente());
            ps.setString(2, glosa506.getPedimento());
            ps.setString(3, glosa506.getSeccionAduanera());
            ps.setDate(4, glosa506.getTipoFecha());
            ps.setDate(5, glosa506.getFechaOperacion());
            ps.setDate(6, glosa506.getFechaValidacionPagoR());
            ps.setInt(7, glosa506.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa506Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa506Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
