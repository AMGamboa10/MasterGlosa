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
    
    public boolean registrar(Glosa551 glosa551){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean eliminarPorID(Glosa551 glosa551){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
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
    
    public boolean eliminarPorMes(Glosa551 glosa551){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
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
    
    public ArrayList buscar(Glosa551 glosa551){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //Declarar todos nuestros campos de glsoa como variables
        
        String sql = "";
        
        ArrayList<Glosa551> lista = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, glosa551.getFechaInicio());
            ps.setDate(2, glosa551.getFechaFinal());
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                //Asignar valor a nuestras variables a partir del resultado de nuestra consulta
                
                //Asignamos nuestros valores en el constructor de glosa
                
                
                //Agregamos lo que metimos al constructor a nuestra lista
                //lista.add();
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(Glosa551Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL " + Glosa551Consultas.class.getName(), JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }
    
    public boolean actualizar(Glosa551 glosa551){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "";
        
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
    
    
}
