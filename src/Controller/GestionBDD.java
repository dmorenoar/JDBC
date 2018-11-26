/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Heroe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dmorenoar
 */
public class GestionBDD {
    
    Connection conexion;
    
    
    public void insertarHeroe(Heroe h) throws SQLException{
        //Comprobamos que no exista previamente el heroe
        if(existeHeroe(h)){
            System.out.println("El Heroe ya existe");
        }else{
            //Creamos la consulta
            String insert = "insert into Heroe(nombre,ataque,defensa) values(?,?,?);";
            
            PreparedStatement ps = conexion.prepareStatement(insert);
            ps.setString(1, h.getNombre());
            ps.setInt(2, h.getAtaque());
            ps.setInt(3, h.getDefensa());
            
            ps.executeUpdate();
            ps.close();
            
        }
        
        
    }
    
    
    public boolean existeHeroe(Heroe h) throws SQLException{
        boolean existe = false;
        //Creamos al consulta SQL
        String select = "Select * from Heroe where nombre='" + h.getNombre() + "'";
        
        //Creamos el Statement y ResultSet
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        
        if(rs.next()) {
            existe = true;
        }
        
        rs.close();
        st.close();
       
        return existe;
    }
    
    
    
    
    
    
    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/dungeonsofdoom";
        String user = "linkia";
        String pass = "12345";
        conexion = DriverManager.getConnection(url, user, pass);
        
        System.out.println("Conexión establecida");
    }
    
    public void desconectar() throws SQLException{
        if(conexion != null){
            conexion.close();
            System.out.println("Conexión cerrada");
        }
    }

}
