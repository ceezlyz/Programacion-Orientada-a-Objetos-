/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso1;

/**
 *
 * @author Laboratorio
 */
public class clientes {
    private String nombre;
    private String cedula;
    private String telefono;
    private String categoria;
    
    public clientes() {       
    }    
    public String getnombre(){
        return nombre;        
    }   
    public void setnombre (String nombre){
        this.nombre = nombre;       
    }    
    public String getcedula(){
        return cedula;       
    }
    public void setcedula (String cedula){
        this.cedula = cedula;        
    }
    public String gettelefono(){
        return telefono;
    }
    public void settelefono (String telefono){
        this.telefono = telefono;     
    }
    public String getcategoria(){
        return categoria;        
    }
    public void setcategoria (String categoria){
        this.categoria = categoria;
    }
}

