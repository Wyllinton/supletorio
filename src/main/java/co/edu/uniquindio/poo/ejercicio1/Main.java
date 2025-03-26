package co.edu.uniquindio.poo.ejercicio1;

public class Main {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarProducto("Escoba", 6, 10);
        almacen.agregarProducto("Carro", 2, 10000000);
        almacen.agregarProducto("Camiseta", 12, 40);

        // Imprimir los productos ordenados por nombre
        System.out.println("Productos ordenados por nombre:");
        almacen.ordenarPorNombre();
        for (Producto producto : almacen) {
            System.out.println(producto);
        }

        // Imprimir los productos ordenados por precio
        System.out.println("\nProductos ordenados por precio:");
        almacen.ordenarPorPrecio();
        for (Producto producto : almacen) {
            System.out.println(producto);
        }
    }
}
