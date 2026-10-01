/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.net.InterfaceAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String programa = "";
        int cantidad;
        double sumaSalarios = 0;
        double montoSEM;
        double montoIVM;
        double totalCCSS;
        
        do {
            programa = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
            cantidad = Integer.parseInt(programa);
            
        } while (cantidad <= 0);
        
        for (int i = 1; i <= cantidad; i++){
            
            double salario;
            
            do { 
                programa = JOptionPane.showInputDialog("Ingrese el salario del empleado " + i + ":");
                
                salario = Double.parseDouble(programa);
                
            } while (salario <= 0);
            
            sumaSalarios += salario;
            
            montoSEM = sumaSalarios * 0.0925;
            montoIVM = sumaSalarios * 0.0508;
            totalCCSS = montoSEM + montoIVM;
            
            JOptionPane.showMessageDialog(null, "La empresa deberá abonarle a la CCSS " + totalCCSS + " por concepto de SEM y IVM");
            
            
        } 
                
    }
    
}
