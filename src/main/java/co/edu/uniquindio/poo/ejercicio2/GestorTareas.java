package co.edu.uniquindio.poo.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestorTareas<T> implements Iterable<Tarea<T>> {
    private List<Tarea<T>> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void agregarTarea(String nombre, String descripcion, int prioridad, LocalDate fecha) {
        tareas.add(new Tarea(nombre, descripcion, prioridad, fecha));
        Collections.sort(tareas); //Ordena por fecha
    }

    public void eliminarTarea(String nombre) {
            Iterator<Tarea<T>> iterador = tareas.iterator();
            while (iterador.hasNext()) {
                Tarea<T> tarea = iterador.next();
                if (tarea.getNombre().equals(nombre)) {
                    iterador.remove();
                }
            }
    }

    public Tarea<T> encontrarTarea(String nombre) {
        Iterator<Tarea<T>> iterador = tareas.iterator();
        while (iterador.hasNext()) {
            Tarea<T> tarea = iterador.next();
            if (tarea.getNombre().equals(nombre)) {
                return tarea;
            }
        }
        return null;
    }

    @Override
    public Iterator<Tarea<T>> iterator() {
        return new IteradorTarea<>(tareas);
    }
}
