package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa508Consultas extends Conexion {

    public boolean registrar(Glosa508 glosa508) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa508 (Patente, Pedimento, SeccionAduanera, InstitucionEmisora, NumeroCuenta, FolioConstancia, "
                + "FechaConstancia, TipoCuenta, ClaveGarantia, ValorUnitarioTitulo, TotalGarantia, CantidadUnidades, TitulosAsignados, "
                + "FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa508.getPatente());
            ps.setString(2, glosa508.getPedimento());
            ps.setString(3, glosa508.getSeccionAduanera());
            ps.setString(4, glosa508.getInstitucionEmisora());
            ps.setString(5, glosa508.getNumeroCuenta());
            ps.setString(6, glosa508.getFolioConstancia());
            ps.setDate(7, glosa508.getFechaConstancia());
            ps.setString(8, glosa508.getTipoCuenta());
            ps.setString(9, glosa508.getClaveGarantia());
            ps.setDouble(10, glosa508.getValorUnitarioTitulo());
            ps.setString(11, glosa508.getTotalGarantia());
            ps.setString(12, glosa508.getCantidadUnidades());
            ps.setString(13, glosa508.getTitulosAsignados());
            ps.setDate(14, glosa508.getFechaPagoReal());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa508Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa508Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa508 glosa508) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa508 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa508.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa508Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa508Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa508 glosa508) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa508 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa508.getAño());
            ps.setInt(2, glosa508.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa508Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa508Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa508 glosa508) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, InstitucionEmisora, NumeroCuenta, FolioConstancia, TipoCuenta, ClaveGarantia, TotalGarantia, CantidadUnidades, TitulosAsignados;
        double ValorUnitarioTitulo;
        java.sql.Date FechaPagoReal, FechaConstancia;

        String sql = "Select * from Glosa508 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa508> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa508.getFechaInicio());
            ps.setDate(2, glosa508.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                InstitucionEmisora = rs.getString("InstitucionEmisora");
                NumeroCuenta = rs.getString("NumeroCuenta");
                FolioConstancia = rs.getString("FolioConstancia");
                FechaConstancia = rs.getDate("FechaConstancia");
                TipoCuenta = rs.getString("TipoCuenta");
                ClaveGarantia = rs.getString("ClaveGarantia");
                ValorUnitarioTitulo = rs.getDouble("ValorUnitarioTitulo");
                TotalGarantia = rs.getString("TotalGarantia");
                CantidadUnidades = rs.getString("CantidadUnidades");
                TitulosAsignados = rs.getString("TitulosAsignados");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa508 g508 = new Glosa508(id, Patente, Pedimento, SeccionAduanera, InstitucionEmisora, NumeroCuenta, FolioConstancia, FechaConstancia, TipoCuenta, ClaveGarantia, ValorUnitarioTitulo, TotalGarantia, CantidadUnidades, TitulosAsignados, FechaPagoReal);
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g508);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa508Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa508Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa508 glosa508) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa508 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, InstitucionEmisora = ?, NumeroCuenta = ?, "
                + "FolioConstancia = ?, FechaConstancia = ?, TipoCuenta = ?, ClaveGarantia = ?, ValorUnitarioTitulo = ?, TotalGarantia = ?, "
                + "CantidadUnidades = ?, TitulosAsignados = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa508.getPatente());
            ps.setString(2, glosa508.getPedimento());
            ps.setString(3, glosa508.getSeccionAduanera());
            ps.setString(4, glosa508.getInstitucionEmisora());
            ps.setString(5, glosa508.getNumeroCuenta());
            ps.setString(6, glosa508.getFolioConstancia());
            ps.setDate(7, glosa508.getFechaConstancia());
            ps.setString(8, glosa508.getTipoCuenta());
            ps.setString(9, glosa508.getClaveGarantia());
            ps.setDouble(10, glosa508.getValorUnitarioTitulo());
            ps.setString(11, glosa508.getTotalGarantia());
            ps.setString(12, glosa508.getCantidadUnidades());
            ps.setString(13, glosa508.getTitulosAsignados());
            ps.setDate(14, glosa508.getFechaPagoReal());
            ps.setInt(15, glosa508.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa508Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa508Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
