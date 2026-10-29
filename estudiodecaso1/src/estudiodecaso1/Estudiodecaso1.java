/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Estudiodecaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de control");
        
        String nombre;
        JOptionPane.showInputDialog("Por favor ingrese su nombre");
        
        String cedula;
        JOptionPane.showInputDialog("Ingrese su número de cédula");
        
        String telefono;
        JOptionPane.showInputDialog("Ingrese su número de teléfono");
        
        String categoria;
        JOptionPane.showInputDialog("Ingrese su categoría");
        
        int numeroMes; 
        JOptionPane.showInputDialog("Ingrese el número del mes en que realizo los alquileres(1-12)");
        
      
        int placa;
        JOptionPane.showInputDialog("Ingrese la placa del Vehiculo");
        
        int marca;
        JOptionPane.showInputDialog("Ingrese la marca del Vehiculo");
        
        int precioDia;
        JOptionPane.showInputDialog("Ingrese el precio base por día");
        
        int dias;
        JOptionPane.showInputDialog("Ingrese la cantidad de días de alquiler");
        
        int seguro;
        JOptionPane.showInputDialog("El vehiculo cuenta con seguro completo?(1-NO, 2-SI)");
        
        int gps;
        JOptionPane.showInputDialog("El vehiculo cuenta con dispositivo GPS? (1-NO, 2-SI)");
        
        
    }
    
}
