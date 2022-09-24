package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Glosa557Consultas extends Conexion {
    
    public boolean registrar(Glosa557 glosa557){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean eliminarPorID(Glosa557 glosa557){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa557.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean eliminarPorMes(Glosa557 glosa557){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa557.getAño());
            ps.setInt(2, glosa557.getMes());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public ArrayList buscar(Glosa557 glosa557){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        
        String sql = "";
        
        ArrayList<Glosa557> lista = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa557.getFechaInicio());
            ps.setDate(2, glosa557.getFechaFinal());
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                
                //Asignamos nuestros valores en el constructor de glosa
                
                
                //Agregamos lo que metimos al constructor a nuestra lista
                //lista.add();
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }
    
    public boolean actualizar(Glosa557 glosa557){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, glosa557.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa557Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa557Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
}
