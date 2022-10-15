package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas extends Conexion{
    
    public ArrayList buscarEncabezadosGlosa(String glosa) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "Select COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS where TABLE_SCHEMA = 'datastage' and TABLE_NAME = ? order by ORDINAL_POSITION;";
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, glosa);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                lista.add(rs.getString("COLUMN_NAME"));
            }
            
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }
        
    }
    
}
