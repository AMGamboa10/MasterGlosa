package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa505Consultas extends Conexion {

    public boolean registrar(Glosa505 glosa505) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa505 (Patente, Pedimento, SeccionAduanera, FechaFacturacion, "
                + "NumeroFactura, TerminoFacturacion, MonedaFacturacion, ValorDolares, ValorMonedaExtranjera, "
                + "PaisFacturacion, EntidadFedFacturacion, IndentFiscalProveedor, ProveedorMercancia, CalleProveedor, "
                + "NumInteriorProveedor, NumExteriorProveedor, CpProveedor, MunicipioProveedor, FechaPagoReal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa505.getPatente());
            ps.setString(2, glosa505.getPedimento());
            ps.setString(3, glosa505.getSeccionAduanera());
            ps.setDate(4, glosa505.getFechaFacturacion());
            ps.setString(5, glosa505.getNumeroFactura());
            ps.setString(6, glosa505.getTerminoFacturacion());
            ps.setString(7, glosa505.getMonedaFacturacion());
            ps.setDouble(8, glosa505.getValorDolares());
            ps.setDouble(9, glosa505.getValorMonedaExtranjera());
            ps.setString(10, glosa505.getPaisFacturacion());
            ps.setString(11, glosa505.getEntidadFedFacturacion());
            ps.setString(12, glosa505.getIndentFiscalProveedor());
            ps.setString(13, glosa505.getProveedorMercancia());
            ps.setString(14, glosa505.getCalleProveedor());
            ps.setString(15, glosa505.getNumInteriorProveedor());
            ps.setString(16, glosa505.getNumExteriorProveedor());
            ps.setString(17, glosa505.getCpProveedor());
            ps.setString(18, glosa505.getMunicipioProveedor());
            ps.setDate(19, glosa505.getFechaPagoReal());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa505Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa505Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa505 glosa505) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa505 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa505.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa505Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa505Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa505 glosa505) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa505 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa505.getAño());
            ps.setInt(2, glosa505.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa505Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa505Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa505 glosa505) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, FechaFacturacion, NumeroFactura, TerminoFacturacion, MonedaFacturacion, PaisFacturacion,
                EntidadFedFacturacion, IndentFiscalProveedor, ProveedorMercancia, CalleProveedor, NumInteriorProveedor, NumExteriorProveedor, CpProveedor, MunicipioProveedor;
        double ValorDolares, ValorMonedaExtranjera;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa505 Where FechaPago >= ? and FechaPago <=?;";

        ArrayList<Glosa505> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa505.getFechaInicio());
            ps.setDate(2, glosa505.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta

                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                FechaFacturacion = rs.getString("FechaFacturacion");
                NumeroFactura = rs.getString("NumeroFactura");
                TerminoFacturacion = rs.getString("TerminoFacturacion");
                MonedaFacturacion = rs.getString("MonedaFacturacion");
                ValorDolares = rs.getDouble("ValorDolares");
                ValorMonedaExtranjera = rs.getDouble("ValorMonedaExtranjera");
                PaisFacturacion = rs.getString("PaisFacturacion");
                EntidadFedFacturacion = rs.getString("EntidadFedFacturacion");
                IndentFiscalProveedor = rs.getString("IndentFiscalProveedor");
                ProveedorMercancia = rs.getString("ProveedorMercancia");
                CalleProveedor = rs.getString("CalleProveedor");
                NumInteriorProveedor = rs.getString("NumInteriorProveedor");
                NumExteriorProveedor = rs.getString("NumExteriorProveedor");
                CpProveedor = rs.getString("CpProveedor");
                MunicipioProveedor = rs.getString("MunicipioProveedor");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa505 g505 = new Glosa505(id, Patente, Pedimento, SeccionAduanera, FechaPagoReal, NumeroFactura, 
                        TerminoFacturacion, MonedaFacturacion, ValorDolares, ValorMonedaExtranjera, PaisFacturacion, 
                        EntidadFedFacturacion, IndentFiscalProveedor, ProveedorMercancia, CalleProveedor, NumInteriorProveedor, 
                        NumExteriorProveedor, CpProveedor, MunicipioProveedor, FechaPagoReal);

                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g505);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa505Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa505Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa505 glosa505) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa505 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, FechaFacturacion = ?, NumeroFactura = ?, "
                + "TerminoFacturacion = ?, MonedaFacturacion = ?, ValorDolares = ?, ValorMonedaExtranjera = ?, PaisFacturacion = ?, "
                + "EntidadFedFacturacion = ?, IndentFiscalProveedor = ?, ProveedorMercancia = ?, CalleProveedor = ?, NumInteriorProveedor = ?, "
                + "NumExteriorProveedor = ?, CpProveedor = ?, MunicipioProveedor = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa505.getPatente());
            ps.setString(2, glosa505.getPedimento());
            ps.setString(3, glosa505.getSeccionAduanera());
            ps.setDate(4, glosa505.getFechaFacturacion());
            ps.setString(5, glosa505.getNumeroFactura());
            ps.setString(6, glosa505.getTerminoFacturacion());
            ps.setString(7, glosa505.getMonedaFacturacion());
            ps.setDouble(8, glosa505.getValorDolares());
            ps.setDouble(9, glosa505.getValorMonedaExtranjera());
            ps.setString(10, glosa505.getPaisFacturacion());
            ps.setString(11, glosa505.getEntidadFedFacturacion());
            ps.setString(12, glosa505.getIndentFiscalProveedor());
            ps.setString(13, glosa505.getProveedorMercancia());
            ps.setString(14, glosa505.getCalleProveedor());
            ps.setString(15, glosa505.getNumInteriorProveedor());
            ps.setString(16, glosa505.getNumExteriorProveedor());
            ps.setString(17, glosa505.getCpProveedor());
            ps.setString(18, glosa505.getMunicipioProveedor());
            ps.setDate(19, glosa505.getFechaPagoReal());
            ps.setInt(20, glosa505.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa505Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa505Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
