/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author dmorenoar
 */
public class Item {

    private String nombre;
    private String elemento;
    private String descripcion;
    private Heroe heroe;

    public Item(String nombre, String elemento, String descripcion, Heroe heroe) {
        this.nombre = nombre;
        this.elemento = elemento;
        this.descripcion = descripcion;
        this.heroe = heroe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }
    
    
    
    
    
        
    
}
