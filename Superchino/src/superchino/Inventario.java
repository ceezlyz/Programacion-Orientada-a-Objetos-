/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Inventario {
    
    private String nombreSuper;
    private String codigoSuper;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private Producto[] producto;
    
    public void iniciar(){
        solicitarDatosGenerales();
        solicitarProductos();
        mostrarProductos();
        mostrarGananciasTotal();        
    }
    public void solicitarDatosGenerales(){
        nombreSuper = JOptionPane.showInputDialog("Digite el nombre del súper");
        codigoSuper = JOptionPane.showInputDialog("Código del súper");
        nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        cedulaEmpleado = JOptionPane.showInputDialog("Ingrese el número de cédula del empleado");
        
          
    }
     public void solicitarProductos() {
        int total = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea agregar?"));
        producto = new Producto[total];

        for (int x = 0; x < producto.length; x++) {
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del producto " + (x + 1));
            String codigo = JOptionPane.showInputDialog("Ingrese el código del producto:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos;"));
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del producto:"));
            int tipo = solicitarTipo();
            producto[x] = new Producto(codigo, nombre, cantidad, precioBase, tipo);
          
        }
        
    }    
 public int solicitarTipo() {
        int tipo = 0;
        while (tipo < 1 || tipo > 4) {
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de producto:\n1. Alimentos\n2. Bebidas\n3. Higiene\n4. Limpieza"));
        }
        return tipo;
    }

    public void mostrarProductos() {
        for (int x = 0; x < producto.length; x++) {
            JOptionPane.showMessageDialog(null,"Super: " + nombreSuper + " (código " + codigoSuper + ")\n" + "Empleado: " + nombreEmpleado + " (cédula " + cedulaEmpleado + ")\n" + "-----------------------------\n" + "Código del producto: " + producto[x].getCodigo() + "\n" + "Nombre del producto: " + producto[x].getNombre() + "\n" + "Tipo: " + producto[x].getNombreTipo() + "\n" + "Cantidad: " + producto[x].getCantidad() + "\n" + "Precio base: " + producto[x].getPrecioBase() + "\n" + "Precio bruto: " + producto[x].calcularPrecioBruto() + "\n" + "Ganancia esperada: " + producto[x].calcularGanancia());
        }
    }

    public double calcularGananciaTotal() {
        double total = 0;
        for (int x = 0; x < producto.length; x++) {
            total += producto[x].calcularGanancia();
        }
        return total;
    }
    public void mostrarGananciasTotal() {
        JOptionPane.showMessageDialog(null, "Ganancia esperada por la venta de productos: "  + calcularGananciaTotal());
    }
}

