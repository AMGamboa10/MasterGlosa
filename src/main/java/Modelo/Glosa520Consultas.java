package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa520Consultas extends Conexion {

    public boolean registrar(Glosa520 glosa520) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Glosa520 (Patente, Pedimento, SeccionAduanera, IndentFiscalDestinatario, NombreDestinatarioMercancia, "
                + "CalleDestinatario, NumInteriorDestinatario, NumExteriorDestinatario, CpDestinatario, MunicpioDestinatario, PaisDestinatario, "
                + "FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa520.getPatente());
            ps.setString(2, glosa520.getPedimento());
            ps.setString(3, glosa520.getSeccionAduanera());
            ps.setString(4, glosa520.getIndentFiscalDestinatario());
            ps.setString(5, glosa520.getNombreDestinatarioMercancia());
            ps.setString(6, glosa520.getCalleDestinatario());
            ps.setString(7, glosa520.getNumInteriorDestinatario());
            ps.setString(8, glosa520.getNumExteriorDestinatario());
            ps.setString(9, glosa520.getCpDestinatario());
            ps.setString(10, glosa520.getMunicpioDestinatario());
            ps.setString(11, glosa520.getPaisDestinatario());
            ps.setDate(12, glosa520.getFechaPagoReal());
            ps.execute();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa520Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa520Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorID(Glosa520 glosa520) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa520 WHERE id = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa520.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa520Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa520Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean eliminarPorMes(Glosa520 glosa520) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Delete from  Glosa520 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa520.getAño());
            ps.setInt(2, glosa520.getMes());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa520Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa520Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList buscar(Glosa520 glosa520) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente, Pedimento, SeccionAduanera, IndentFiscalDestinatario, NombreDestinatarioMercancia, CalleDestinatario, NumInteriorDestinatario,
                NumExteriorDestinatario, CpDestinatario, MunicpioDestinatario, PaisDestinatario;
        java.sql.Date FechaPagoReal;

        String sql = "Select * from Glosa520 Where FechaPagoReal >= ? and FechaPagoReal <=?;";

        ArrayList<Glosa520> lista = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa520.getFechaInicio());
            ps.setDate(2, glosa520.getFechaFinal());
            rs = ps.executeQuery();

            while (rs.next()) {
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt("id");
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                IndentFiscalDestinatario = rs.getString("IndentFiscalDestinatario");
                NombreDestinatarioMercancia = rs.getString("NombreDestinatarioMercancia");
                CalleDestinatario = rs.getString("CalleDestinatario");
                NumInteriorDestinatario = rs.getString("NumInteriorDestinatario");
                NumExteriorDestinatario = rs.getString("NumExteriorDestinatario");
                CpDestinatario = rs.getString("CpDestinatario");
                MunicpioDestinatario = rs.getString("MunicpioDestinatario");
                PaisDestinatario = rs.getString("PaisDestinatario");
                FechaPagoReal = rs.getDate("FechaPagoReal");

                //Asignamos nuestros valores en el constructor de glosa
                Glosa520 g520 = new Glosa520(id, Patente, Pedimento, SeccionAduanera, IndentFiscalDestinatario, 
                        NombreDestinatarioMercancia, CalleDestinatario, NumInteriorDestinatario, NumExteriorDestinatario, 
                        CpDestinatario, MunicpioDestinatario, PaisDestinatario, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g520);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa520Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa520Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }

    public boolean actualizar(Glosa520 glosa520) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Glosa520 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, IndentFiscalDestinatario = ?, "
                + "NombreDestinatarioMercancia = ?, CalleDestinatario = ?, NumInteriorDestinatario = ?, NumExteriorDestinatario = ?, "
                + "CpDestinatario = ?, MunicpioDestinatario = ?, PaisDestinatario = ?, FechaPagoReal = ? WHERE ID = ?;";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa520.getPatente());
            ps.setString(2, glosa520.getPedimento());
            ps.setString(3, glosa520.getSeccionAduanera());
            ps.setString(4, glosa520.getIndentFiscalDestinatario());
            ps.setString(5, glosa520.getNombreDestinatarioMercancia());
            ps.setString(6, glosa520.getCalleDestinatario());
            ps.setString(7, glosa520.getNumInteriorDestinatario());
            ps.setString(8, glosa520.getNumExteriorDestinatario());
            ps.setString(9, glosa520.getCpDestinatario());
            ps.setString(10, glosa520.getMunicpioDestinatario());
            ps.setString(11, glosa520.getPaisDestinatario());
            ps.setInt(12, glosa520.getId());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Glosa520Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa520Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
