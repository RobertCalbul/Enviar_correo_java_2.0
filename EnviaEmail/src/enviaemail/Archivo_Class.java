/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviaemail;

/**
 *
 * @author rock_
 */
public class Archivo_Class {
    public String nombre;
    public String ruta;
    
    public Archivo_Class(){
        this.nombre = "";
        this.ruta ="";
    }
    public Archivo_Class(String nombre, String ruta){
        this.nombre = nombre;
        this.ruta = ruta;
    }
}
