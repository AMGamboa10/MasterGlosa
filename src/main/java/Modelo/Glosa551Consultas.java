package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa551Consultas extends Conexion {

    public boolean registrar(Glosa551 glosa551) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa551 (Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, SubdivisionFraccion, "
                + "DescripcionMercancia, PrecioUnitario, ValorAduana, ValorComercial, ValorDolares, CantidadUMComercial, UnidadMedidaComercial, "
                + "CantidadUMTarifa, UnidadMedidaTarifa, ValorAgregado, ClaveVinculacion, MetodoValorizacion, CodigoMercanciaProducto, "
                + "MarcaMercanciaProducto, ModeloMercanciaProducto, PaisOrigenDestino, PaisCompradorVendedor, EntidadFedOrigen, EntidadFedDestino, "
                + "EntidadFedComprador, EntidadFedVendedor, TipoOperacion, ClaveDocumento, FechaPagoReal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa551.getPatente());
            ps.setString(2, glosa551.getPedimento());
            ps.setString(3, glosa551.getSeccionAduanera());
            ps.setString(4, glosa551.getFraccion());
            ps.setString(5, glosa551.getSecuenciaFraccion());
            ps.setString(6, glosa551.getSubdivisionFraccion());
            ps.setString(7, glosa551.getDescripcionMercancia());
            ps.setDouble(8, glosa551.getPrecioUnitario());
            ps.setDouble(9, glosa551.getValorAduana());
            ps.setDouble(10, glosa551.getValorComercial());
            ps.setDouble(11, glosa551.getValorDolares());
            ps.setDouble(12, glosa551.getCantidadUMComercial());
            ps.setInt(13, glosa551.getUnidadMedidaComercial());
            ps.setDouble(14, glosa551.getCantidadUMTarifa());
            ps.setInt(15, glosa551.getUnidadMedidaTarifa());
            ps.setDouble(16, glosa551.getValorAgregado());
            ps.setString(17, glosa551.getClaveVinculacion());
            ps.setString(18, glosa551.getMetodoValorizacion());
            ps.setString(19, glosa551.getCodigoMercanciaProducto());
            ps.setString(20, glosa551.getMarcaMercanciaProducto());
            ps.setString(21, glosa551.getModeloMercanciaProducto());
            ps.setString(22, glosa551.getPaisOrigenDestino());
            ps.setString(23, glosa551.getPaisCompradorVendedor());
            ps.setString(24, glosa551.getEntidadFedOrigen());
            ps.setString(25, glosa551.getEntidadFedDestino());
            ps.setString(26, glosa551.getEntidadFedComprador());
            ps.setString(27, glosa551.getEntidadFedVendedor());
            ps.setString(28, glosa551.getTipoOperacion());
            ps.setString(29, glosa551.getClaveDocumento());
            ps.setDate(30, glosa551.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa551 glosa551) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa551 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa551.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa551 glosa551) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa551 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa551.getAño());
            ps.setInt(2, glosa551.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa551 glosa551) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id, UnidadMedidaComercial, UnidadMedidaTarifa;
        String Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, SubdivisionFraccion, DescripcionMercancia, ClaveVinculacion, MetodoValorizacion, CodigoMercanciaProducto,
                MarcaMercanciaProducto, ModeloMercanciaProducto, PaisOrigenDestino, PaisCompradorVendedor, EntidadFedOrigen, EntidadFedDestino, EntidadFedComprador, EntidadFedVendedor,
                TipoOperacion, ClaveDocumento;
        double PrecioUnitario, ValorAduana, ValorComercial, ValorDolares, CantidadUMComercial, CantidadUMTarifa, ValorAgregado;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa551 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa551> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa551.getFechaInicio());
            ps.setDate(2, glosa551.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                Fraccion = rs.getString("Fraccion");
                SecuenciaFraccion = rs.getString("SecuenciaFraccion");
                SubdivisionFraccion = rs.getString("SubdivisionFraccion");
                DescripcionMercancia = rs.getString("DescripcionMercancia");
                PrecioUnitario = rs.getDouble("PrecioUnitario");
                ValorAduana = rs.getDouble("ValorAduana");
                ValorComercial = rs.getDouble("ValorComercial");
                ValorDolares = rs.getDouble("ValorDolares");
                CantidadUMComercial = rs.getDouble("CantidadUMComercial");
                UnidadMedidaComercial = rs.getInt("UnidadMedidaComercial");
                CantidadUMTarifa = rs.getDouble("CantidadUMTarifa");
                UnidadMedidaTarifa = rs.getInt("UnidadMedidaTarifa");
                ValorAgregado = rs.getInt("ValorAgregado");
                ClaveVinculacion = rs.getString("ClaveVinculacion");
                MetodoValorizacion = rs.getString("MetodoValorizacion");
                CodigoMercanciaProducto = rs.getString("CodigoMercanciaProducto");
                MarcaMercanciaProducto = rs.getString("MarcaMercanciaProducto");
                ModeloMercanciaProducto = rs.getString("ModeloMercanciaProducto");
                PaisOrigenDestino = rs.getString("PaisOrigenDestino");
                PaisCompradorVendedor = rs.getString("PaisCompradorVendedor");
                EntidadFedOrigen = rs.getString("EntidadFedOrigen");
                EntidadFedDestino = rs.getString("EntidadFedDestino");
                EntidadFedComprador = rs.getString("EntidadFedComprador");
                EntidadFedVendedor = rs.getString("EntidadFedVendedor");
                TipoOperacion = rs.getString("TipoOperacion");
                ClaveDocumento = rs.getString("ClaveDocumento");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa551 g551 = new Glosa551(id, Patente, Pedimento, SeccionAduanera, Fraccion, SecuenciaFraccion, SubdivisionFraccion, DescripcionMercancia,
                        PrecioUnitario, ValorAduana, ValorComercial, ValorDolares, CantidadUMComercial, UnidadMedidaComercial, CantidadUMTarifa, UnidadMedidaTarifa,
                        ValorAgregado, ClaveVinculacion, MetodoValorizacion, CodigoMercanciaProducto, MarcaMercanciaProducto, ModeloMercanciaProducto,
                        PaisOrigenDestino, PaisCompradorVendedor, EntidadFedOrigen, EntidadFedDestino, EntidadFedComprador, EntidadFedVendedor, TipoOperacion,
                        ClaveDocumento, FechaPagoReal);

                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g551);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa551 glosa551) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa551 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, Fraccion = ?, SecuenciaFraccion = ?, SubdivisionFraccion = ?, "
                + "DescripcionMercancia = ?, PrecioUnitario = ?, ValorAduana = ?, ValorComercial = ?, ValorDolares = ?, CantidadUMComercial = ?, UnidadMedidaComercial = ?, "
                + "CantidadUMTarifa = ?, UnidadMedidaTarifa = ?, ValorAgregado = ?, ClaveVinculacion = ?, MetodoValorizacion = ?, CodigoMercanciaProducto = ?, "
                + "MarcaMercanciaProducto = ?, ModeloMercanciaProducto = ?, PaisOrigenDestino = ?, PaisCompradorVendedor = ?, EntidadFedOrigen = ?, EntidadFedDestino = ?, "
                + "EntidadFedComprador = ?, EntidadFedVendedor = ?, TipoOperacion = ?, ClaveDocumento = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa551.getPatente());
            ps.setString(2, glosa551.getPedimento());
            ps.setString(3, glosa551.getSeccionAduanera());
            ps.setString(4, glosa551.getFraccion());
            ps.setString(5, glosa551.getSecuenciaFraccion());
            ps.setString(6, glosa551.getSubdivisionFraccion());
            ps.setString(7, glosa551.getDescripcionMercancia());
            ps.setDouble(8, glosa551.getPrecioUnitario());
            ps.setDouble(9, glosa551.getValorAduana());
            ps.setDouble(10, glosa551.getValorComercial());
            ps.setDouble(11, glosa551.getValorDolares());
            ps.setDouble(12, glosa551.getCantidadUMComercial());
            ps.setInt(13, glosa551.getUnidadMedidaComercial());
            ps.setDouble(14, glosa551.getCantidadUMTarifa());
            ps.setInt(15, glosa551.getUnidadMedidaTarifa());
            ps.setDouble(16, glosa551.getValorAgregado());
            ps.setString(17, glosa551.getClaveVinculacion());
            ps.setString(18, glosa551.getMetodoValorizacion());
            ps.setString(19, glosa551.getCodigoMercanciaProducto());
            ps.setString(20, glosa551.getMarcaMercanciaProducto());
            ps.setString(21, glosa551.getModeloMercanciaProducto());
            ps.setString(22, glosa551.getPaisOrigenDestino());
            ps.setString(23, glosa551.getPaisCompradorVendedor());
            ps.setString(24, glosa551.getEntidadFedOrigen());
            ps.setString(25, glosa551.getEntidadFedDestino());
            ps.setString(26, glosa551.getEntidadFedComprador());
            ps.setString(27, glosa551.getEntidadFedVendedor());
            ps.setString(28, glosa551.getTipoOperacion());
            ps.setString(29, glosa551.getClaveDocumento());
            ps.setDate(30, glosa551.getFechaPagoReal());
            ps.setInt(31, glosa551.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
