/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import Controller.GestionBDD;
import Models.Heroe;
import Views.Principal;
import java.sql.SQLException;

/**
 *
 * @author Xavier Castejon
 */
public class UsoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /*      
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setSize(600,800);
        p.setVisible(true);
*/  
        GestionBDD gestor = new GestionBDD();
        
        //Creamos un heroe
        Heroe h1 = new Heroe("Kerrigan", 22, 33);
        
        try {
           //Establecemos la conexión
            gestor.conectar();
            System.out.println("Insertamos un heroe:" + h1.getNombre());
            gestor.insertarHeroe(h1);
            
            
        } catch (SQLException e){
            System.out.println("Error" + e.getMessage());
        }
  
  
    }
    
}
