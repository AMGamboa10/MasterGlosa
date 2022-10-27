package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa555Consultas extends Conexion {

    public boolean registrar(Glosa555 glosa555) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa555 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, InstitucionEmisora, "
                + "NumeroCuenta, FolioConstancia, FechaConstancia, ClaveGarantia, ValorUnitarioTitulo, TotalGarantia, CantidadUnidadesMedida, "
                + "TitulosAsignados, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa555.getPatente());
            ps.setString(2, glosa555.getPedimento());
            ps.setString(3, glosa555.getSeccionAduanera());
            ps.setString(4, glosa555.getFraccion());
            ps.setString(5, glosa555.getSecuenciaFraccion());
            ps.setString(6, glosa555.getInstitucionEmisora());
            ps.setString(7, glosa555.getNumeroCuenta());
            ps.setString(8, glosa555.getFolioConstancia());
            ps.setDate(9, glosa555.getFechaConstancia());
            ps.setString(10, glosa555.getClaveGarantia());
            ps.setDouble(11, glosa555.getValorUnitarioTitulo());
            ps.setString(12, glosa555.getTotalGarantia());
            ps.setString(13, glosa555.getCantidadUnidadesMedida());
            ps.setString(14, glosa555.getTitulosAsignados());
            ps.setDate(15, glosa555.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa555Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa555Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa555 glosa555) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa555 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa555.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa555Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa555Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa555 glosa555) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa555 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa555.getAño());
            ps.setInt(2, glosa555.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa555Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa555Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa555 glosa555) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, InstitucionEmisora, NumeroCuenta, FolioConstancia,
                ClaveGarantia, TotalGarantia, CantidadUnidadesMedida, TitulosAsignados;
        double ValorUnitarioTitulo;
        java.sql.Date FechaConstancia, FechaPagoReal;

        String sql = "Select * from Glosa555 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa555> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa555.getFechaInicio());
            ps.setDate(2, glosa555.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                InstitucionEmisora = rs.getString("InstitucionEmisora");
                NumeroCuenta = rs.getString("NumeroCuenta");
                FolioConstancia = rs.getString("FolioConstancia");
                FechaConstancia = rs.getDate("FechaConstancia");
                ClaveGarantia = rs.getString("ClaveGarantia");
                ValorUnitarioTitulo = rs.getDouble("ValorUnitarioTitulo");
                TotalGarantia = rs.getString("TotalGarantia");
                CantidadUnidadesMedida = rs.getString("CantidadUnidadesMedida");
                TitulosAsignados = rs.getString("TitulosAsignados");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa555 g555 = new Glosa555(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, InstitucionEmisora, NumeroCuenta, FolioConstancia, FechaConstancia, ClaveGarantia, ValorUnitarioTitulo, TotalGarantia, CantidadUnidadesMedida, TitulosAsignados, FechaPagoReal);

                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g555);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa555Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa555Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa555 glosa555) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa555 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, "
                + "InstitucionEmisora = ?, NumeroCuenta = ?, FolioConstancia = ?, FechaConstancia = ?, ClaveGarantia = ?, "
                + "ValorUnitarioTitulo = ?, TotalGarantia = ?, CantidadUnidadesMedida = ?, TitulosAsignados = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa555.getPatente());
            ps.setString(2, glosa555.getPedimento());
            ps.setString(3, glosa555.getSeccionAduanera());
            ps.setString(4, glosa555.getFraccion());
            ps.setString(5, glosa555.getSecuenciaFraccion());
            ps.setString(6, glosa555.getInstitucionEmisora());
            ps.setString(7, glosa555.getNumeroCuenta());
            ps.setString(8, glosa555.getFolioConstancia());
            ps.setDate(9, glosa555.getFechaConstancia());
            ps.setString(10, glosa555.getClaveGarantia());
            ps.setDouble(11, glosa555.getValorUnitarioTitulo());
            ps.setString(12, glosa555.getTotalGarantia());
            ps.setString(13, glosa555.getCantidadUnidadesMedida());
            ps.setString(14, glosa555.getTitulosAsignados());
            ps.setDate(15, glosa555.getFechaPagoReal());
            ps.setInt(16, glosa555.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa555Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa555Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
