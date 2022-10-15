package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa502Consultas extends Conexion {
    
    public boolean registrar(Glosa502 glosa502){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO Glosa502 (Patente, Pedimento, SeccionAduanera, RfcTransportista, CurpTransportista, NombreTransportista, PaisTransporte, IdentificadorTransporte, FechaPagoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa502.getPatente());
            ps.setString(2, glosa502.getPedimento());
            ps.setString(3, glosa502.getSeccionAduanera());
            ps.setString(4, glosa502.getRfcTransportista());
            ps.setString(5, glosa502.getCurpTransportista());
            ps.setString(6, glosa502.getNombreTransportista());
            ps.setString(7, glosa502.getPaisTransporte());
            ps.setString(8, glosa502.getIdentificadorTransporte());
            ps.setDate(9, glosa502.getFechaPagoReal());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa502Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa502Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean eliminarPorID(Glosa502 glosa502){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Delete from  Glosa502 WHERE id = ?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa502.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa502Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa502Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean eliminarPorMes(Glosa502 glosa502){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Delete from  Glosa502 WHERE year(FechaPagoReal) = ? And month(FechaPagoReal) =?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa502.getAño());
            ps.setInt(2, glosa502.getMes());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa502Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa502Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public ArrayList buscar(Glosa502 glosa502){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        int id;
        String Patente,Pedimento,SeccionAduanera,RfcTransportista,CurpTransportista,NombreTransportista,PaisTransporte,IdentificadorTransporte;
        java.sql.Date FechaPagoReal;
        
        String sql = "Select * from Glosa502 Where FechaPagoReal >= ? and FechaPagoReal <=?;";
        
        ArrayList<Glosa502> lista = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa502.getFechaInicio());
            ps.setDate(2, glosa502.getFechaFinal());
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                id = rs.getInt(1);
                Patente = rs.getString("Patente");
                Pedimento = rs.getString("Pedimento");
                SeccionAduanera = rs.getString("SeccionAduanera");
                RfcTransportista = rs.getString("RfcTransportista");
                CurpTransportista = rs.getString("CurpTransportista");
                NombreTransportista = rs.getString("NombreTransportista");
                PaisTransporte = rs.getString("PaisTransporte");
                IdentificadorTransporte = rs.getString("IdentificadorTransporte");
                FechaPagoReal = rs.getDate("FechaPagoReal");
                
                //Asignamos nuestros valores en el constructor de glosa
                Glosa502 g502 = new Glosa502(id, Patente, Pedimento, SeccionAduanera, RfcTransportista, CurpTransportista, NombreTransportista, PaisTransporte, IdentificadorTransporte, FechaPagoReal);
                
                //Agregamos lo que metimos al constructor a nuestra lista
                lista.add(g502);
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa502Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa502Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }
    
    public boolean actualizar(Glosa502 glosa502){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Update Glosa502 SET Patente = ?, Pedimento = ?, SeccionAduanera = ?, RfcTransportista = ?, CurpTransportista = ?, NombreTransportista = ?, PaisTransporte = ?, IdentificadorTransporte = ?, FechaPagoReal = ? WHERE ID = ?;";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa502.getPatente());
            ps.setString(2, glosa502.getPedimento());
            ps.setString(3, glosa502.getSeccionAduanera());
            ps.setString(4, glosa502.getRfcTransportista());
            ps.setString(5, glosa502.getCurpTransportista());
            ps.setString(6, glosa502.getNombreTransportista());
            ps.setString(7, glosa502.getPaisTransporte());
            ps.setString(8, glosa502.getIdentificadorTransporte());
            ps.setDate(9, glosa502.getFechaPagoReal());
            ps.setInt(10, glosa502.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa502Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa502Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
}
