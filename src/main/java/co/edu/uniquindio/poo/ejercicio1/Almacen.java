package co.edu.uniquindio.poo.ejercicio1;

import java.util.*;

@SuppressWarnings("rawtypes")
public class Almacen<T extends Producto> implements Iterable<Producto<T>> {
    private List<Producto<T>> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int stock, double precio) {
        productos.add(new Producto<>(nombre, stock, precio));
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new ComparadorPorPrecio<>());
    }

    public void ordenarPorNombre() {
        Collections.sort(productos);
    }

    @Override
    public Iterator<Producto<T>> iterator() {
        return productos.iterator();
    }
}
