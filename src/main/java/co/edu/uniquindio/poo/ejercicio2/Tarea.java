package co.edu.uniquindio.poo.ejercicio2;

import java.time.LocalDate;

public class Tarea <T> implements Comparable<Tarea<T>> {

    private String nombre;
    private String descripcion;
    private int  prioridad;
    private LocalDate fecha;

    public Tarea(String nombre, String descripcion, int prioridad, LocalDate fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Tarea<T> o) {
        return this.fecha.compareTo(o.fecha);
    }


    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tarea [nombre=" + nombre + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", fecha="
                + fecha + "]";
    }
}
