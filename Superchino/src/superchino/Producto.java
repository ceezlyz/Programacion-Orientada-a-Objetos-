/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Laboratorio
 */
public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precioBase;
    private int tipo;

    public Producto(String codigo, String nombre, int cantidad, double precioBase, int tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;
    }

    public double calcularPrecioBruto() {
        double bruto = 0;
        switch (tipo) {
            case 1:
                bruto = precioBase * 0.20 + precioBase;
                break;
            case 2:
                bruto = precioBase * 0.30 + precioBase;
                break;
            case 3:
                bruto = precioBase * 0.25 + precioBase + 500;
                break;
            case 4:
                bruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                break;
        }
        return bruto;
    }

    public double calcularGanancia() {
        return (calcularPrecioBruto() - precioBase) * cantidad;
    }

    public String getNombreTipo() {
        String nombreTipo = "";
        switch (tipo) {
            case 1:
                nombreTipo = "Alimentos";
                break;
            case 2:
                nombreTipo = "Bebidas";
                break;
            case 3:
                nombreTipo = "Higiene";
                break;
            case 4:
                nombreTipo = "Limpieza";
                break;
        }
        return nombreTipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
