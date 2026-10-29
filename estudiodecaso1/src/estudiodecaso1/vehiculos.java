/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class vehiculos {
    int placaVehiculo;
    
    private String placa;
    private String marca;
    private double precioDia;
    private int dias;
    private String seguro;
    private String gps;
    
    public vehiculos(){        
    }    
    public String getplaca(){
        return placa;        
    }
    public void setplaca(String placa){
        this.placa = placa;       
    }
    public String getmarca(){
        return marca;        
    }
    public void setmarca (String marca){
        this.marca = marca;        
    }
    public double getprecioDia(){
        return precioDia;        
    }
    public void setprecioDia(double precioDia){
        this.precioDia = precioDia;        
    }
    public int getdias(){
        return dias;        
    }
    public void setdias (int dias){
        this.dias = dias;
    }
    public String getseguro(){
        return seguro;
    }
    public void setseguro(String seguro){
        this.seguro = seguro;       
    }
    public String getgps(){
        return gps;
    }
    public void setgps(String gps){
        this.gps = gps;
    }
    
 
}
