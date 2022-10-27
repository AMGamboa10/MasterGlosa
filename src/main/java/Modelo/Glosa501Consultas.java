package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa501Consultas extends Conexion {

    public boolean registrar(Glosa501 glosa501) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa501 (Patente, Pedimento, SeccionAduanera, TipoOperacion, ClaveDocumento, SeccionAduaneraEntrada, CurpContribuyente, Rfc, "
                + "CurpAgenteA, TipoCambio, TotalFletes, TotalSeguros, TotalEmbalajes, TotalIncrementables, TotalDeducibles, PesoBrutoMercancia, MedioTransporteSalida, "
                + "MedioTransporteArribo, MedioTransporteEntrada_Salida, DestinoMercancia, NombreContribuyente, CalleContribuyente, NumeroContribuyente, NumExteriorContribuyente, "
                + "CPContribuyente, MunicipioContribuyente, EntidadFedContribuyente, PaisContribuyente, TipoPedimento, FechaRecepcionPedimento, FechaPagoReal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa501.getPatente());
            ps.setString(2, glosa501.getPedimento());
            ps.setString(3, glosa501.getSeccionAduanera());
            ps.setString(4, glosa501.getTipoOperacion());
            ps.setString(5, glosa501.getClaveDocumento());
            ps.setString(6, glosa501.getSeccionAduaneraEntrada());
            ps.setString(7, glosa501.getCurpContribuyente());
            ps.setString(8, glosa501.getRfc());
            ps.setString(9, glosa501.getCurpAgenteA());
            ps.setDouble(10, glosa501.getTipoCambio());
            ps.setInt(11, glosa501.getTotalFletes());
            ps.setInt(12, glosa501.getTotalSeguros());
            ps.setInt(13, glosa501.getTotalEmbalajes());
            ps.setInt(14, glosa501.getTotalIncrementables());
            ps.setInt(15, glosa501.getTotalDeducibles());
            ps.setDouble(16, glosa501.getPesoBrutoMercancia());
            ps.setString(17, glosa501.getMedioTransporteSalida());
            ps.setString(18, glosa501.getMedioTransporteArribo());
            ps.setString(19, glosa501.getMedioTransporteEntrada_Salida());
            ps.setString(20, glosa501.getDestinoMercancia());
            ps.setString(21, glosa501.getNombreContribuyente());
            ps.setString(22, glosa501.getCalleContribuyente());
            ps.setString(23, glosa501.getNumeroContribuyente());
            ps.setString(24, glosa501.getNumExteriorContribuyente());
            ps.setString(25, glosa501.getCPContribuyente());
            ps.setString(26, glosa501.getMunicipioContribuyente());
            ps.setString(27, glosa501.getEntidadFedContribuyente());
            ps.setString(28, glosa501.getPaisContribuyente());
            ps.setString(29, glosa501.getTipoPedimento());
            ps.setDate(30, glosa501.getFechaRecepcionPedimento());
            ps.setDate(31, glosa501.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa501Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa501Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa501 glosa501) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa501 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa501.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa501Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa501Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa501 glosa501) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa501 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa501.getAño());
            ps.setInt(2, glosa501.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa501Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa501Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa501 glosa501) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id, TotalFletes, TotalSeguros, TotalEmbalajes, TotalIncrementables, TotalDeducibles;
        String Patente, Pedimento, SeccionAduanera, TipoOperacion, ClaveDocumento, SeccionAduaneraEntrada, CurpContribuyente, Rfc, CurpAgenteA, MedioTransporteSalida,
                MedioTransporteArribo, MedioTransporteEntrada_Salida, DestinoMercancia, NombreContribuyente, CalleContribuyente, NumeroContribuyente, NumExteriorContribuyente,
                CPContribuyente, MunicipioContribuyente, EntidadFedContribuyente, PaisContribuyente, TipoPedimento;
        double TipoCambio, PesoBrutoMercancia;
        java.sql.Date FechaRecepcionPedimento, FechaPagoReal;

        String sql = "Select * from Glosa501 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa501> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa501.getFechaInicio());
            ps.setDate(2, glosa501.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                TipoOperacion = rs.getString("TipoOperacion");
                ClaveDocumento = rs.getString("ClaveDocumento");
                SeccionAduaneraEntrada = rs.getString("SeccionAduaneraEntrada");
                CurpContribuyente = rs.getString("CurpContribuyente");
                Rfc = rs.getString("Rfc");
                CurpAgenteA = rs.getString("CurpAgenteA");
                TipoCambio = rs.getInt("TipoCambio");
                TotalFletes = rs.getInt("TotalFletes");
                TotalSeguros = rs.getInt("TotalSeguros");
                TotalEmbalajes = rs.getInt("TotalEmbalajes");
                TotalIncrementables = rs.getInt("TotalIncrementables");
                TotalDeducibles = rs.getInt("TotalDeducibles");
                PesoBrutoMercancia = rs.getDouble("PesoBrutoMercancia");
                MedioTransporteSalida = rs.getString("MedioTransporteSalida");
                MedioTransporteArribo = rs.getString("MedioTransporteArribo");
                MedioTransporteEntrada_Salida = rs.getString("MedioTransporteEntrada_Salida");
                DestinoMercancia = rs.getString("DestinoMercancia");
                NombreContribuyente = rs.getString("NombreContribuyente");
                CalleContribuyente = rs.getString("CalleContribuyente");
                NumeroContribuyente = rs.getString("NumeroContribuyente");
                NumExteriorContribuyente = rs.getString("NumExteriorContribuyente");
                CPContribuyente = rs.getString("CPContribuyente");
                MunicipioContribuyente = rs.getString("MunicipioContribuyente");
                EntidadFedContribuyente = rs.getString("EntidadFedContribuyente");
                PaisContribuyente = rs.getString("PaisContribuyente");
                TipoPedimento = rs.getString("TipoPedimento");
                FechaRecepcionPedimento = rs.getDate("FechaRecepcionPedimento");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                //Agregamos lo que metimos al constructor a nuestra lista
                Glosa501 g501 = new Glosa501(id, Patente, Pedimento, SeccionAduanera, TipoOperacion, ClaveDocumento, SeccionAduaneraEntrada, CurpContribuyente, Rfc, CurpAgenteA, TipoCambio, TotalFletes, TotalSeguros, TotalEmbalajes, TotalIncrementables, TotalDeducibles, PesoBrutoMercancia, MedioTransporteSalida, MedioTransporteArribo, MedioTransporteEntrada_Salida, DestinoMercancia, NombreContribuyente, CalleContribuyente, NumeroContribuyente, NumExteriorContribuyente, CPContribuyente, MunicipioContribuyente, EntidadFedContribuyente, PaisContribuyente, TipoPedimento, FechaRecepcionPedimento, FechaPagoReal);
                lista.add(g501);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa501Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa501Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa501 glosa501) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa501 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, TipoOperacion = ?, ClaveDocumento = ?, SeccionAduaneraEntrada = ?, "
                + "CurpContribuyente = ?, Rfc = ?, CurpAgenteA = ?, TipoCambio = ?, TotalFletes = ?, TotalSeguros = ?, TotalEmbalajes = ?, "
                + "TotalIncrementables = ?, TotalDeducibles = ?, PesoBrutoMercancia = ?, MedioTransporteSalida = ?, MedioTransporteArribo = ?, "
                + "MedioTransporteEntrada_Salida = ?, DestinoMercancia = ?, NombreContribuyente = ?, CalleContribuyente = ?, NumeroContribuyente = ?, "
                + "NumExteriorContribuyente = ?, CPContribuyente = ?, MunicipioContribuyente = ?, EntidadFedContribuyente = ?, PaisContribuyente = ?, "
                + "TipoPedimento = ?, FechaRecepcionPedimento = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa501.getPatente());
            ps.setString(2, glosa501.getPedimento());
            ps.setString(3, glosa501.getSeccionAduanera());
            ps.setString(4, glosa501.getTipoOperacion());
            ps.setString(5, glosa501.getClaveDocumento());
            ps.setString(6, glosa501.getSeccionAduaneraEntrada());
            ps.setString(7, glosa501.getCurpContribuyente());
            ps.setString(8, glosa501.getRfc());
            ps.setString(9, glosa501.getCurpAgenteA());
            ps.setDouble(10, glosa501.getTipoCambio());
            ps.setInt(11, glosa501.getTotalFletes());
            ps.setInt(12, glosa501.getTotalSeguros());
            ps.setInt(13, glosa501.getTotalEmbalajes());
            ps.setInt(14, glosa501.getTotalIncrementables());
            ps.setInt(15, glosa501.getTotalDeducibles());
            ps.setDouble(16, glosa501.getPesoBrutoMercancia());
            ps.setString(17, glosa501.getMedioTransporteSalida());
            ps.setString(18, glosa501.getMedioTransporteArribo());
            ps.setString(19, glosa501.getMedioTransporteEntrada_Salida());
            ps.setString(20, glosa501.getDestinoMercancia());
            ps.setString(21, glosa501.getNombreContribuyente());
            ps.setString(22, glosa501.getCalleContribuyente());
            ps.setString(23, glosa501.getNumeroContribuyente());
            ps.setString(24, glosa501.getNumExteriorContribuyente());
            ps.setString(25, glosa501.getCPContribuyente());
            ps.setString(26, glosa501.getMunicipioContribuyente());
            ps.setString(27, glosa501.getEntidadFedContribuyente());
            ps.setString(28, glosa501.getPaisContribuyente());
            ps.setString(29, glosa501.getTipoPedimento());
            ps.setDate(30, glosa501.getFechaRecepcionPedimento());
            ps.setDate(31, glosa501.getFechaPagoReal());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa501Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa501Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
