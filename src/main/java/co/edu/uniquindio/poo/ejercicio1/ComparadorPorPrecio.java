package co.edu.uniquindio.poo.ejercicio1;

import java.util.Comparator;

public class ComparadorPorPrecio<T> implements Comparator<Producto<T>> {
    
    @Override
    public int compare(Producto<T> p1, Producto<T> p2) {
        return Double.compare(p1.getPrecio(), p2.getPrecio());
    }

}
