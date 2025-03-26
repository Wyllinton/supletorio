package co.edu.uniquindio.poo.ejercicio1;

public class Producto<T> implements Comparable<Producto<T>> {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() { 
        return nombre; 
    }

    public int getStock() { 
        return cantidad; 
    }

    public double getPrecio() { 
        return precio; 
    }

    @Override
    public int compareTo(Producto<T> otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
    }

}
