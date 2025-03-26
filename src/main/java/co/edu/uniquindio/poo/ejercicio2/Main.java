package co.edu.uniquindio.poo.ejercicio2;

import java.time.LocalDate;

public class Main {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        GestorTareas<Tarea> gestor = new GestorTareas<Tarea>();

        gestor.agregarTarea("Reunion", "Reunión del equipo de trabajo de desarrolladores", 1, LocalDate.of(2024, 03, 21));
        gestor.agregarTarea("Taller Evaluativo", "Taller de Estructuras de datos", 2, LocalDate.of(2024, 03, 20));
        gestor.agregarTarea("Examen", "Parcial de Listas Enlazadas", 3, LocalDate.of(2024, 03, 19));

        // Listar tareas por fecha
        System.out.println("Tareas en orden de fechas inverso: ");
        for (Tarea tarea : gestor) {
            System.out.println(tarea);
        }

        // Encontrar una tarea
        Tarea encontrarTarea = gestor.encontrarTarea("Examen");
        System.out.println("\nTarea encontrada: " + encontrarTarea);

        // Eliminar una tarea
        gestor.eliminarTarea("Reunion");

        System.out.println("\nTareas pendientes:");
        for (Tarea tarea : gestor) {
            System.out.println(tarea);
        }
    }
}
