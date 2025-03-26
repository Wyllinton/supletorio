package co.edu.uniquindio.poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CombinacionesDados {
    
    public static void generarCombinacionesDados(int dados, int caras) {
        List<Integer> combinacionActual = new ArrayList<>();
        generarCombinacionesRecursivo(dados, caras, combinacionActual);
    }

    private static void generarCombinacionesRecursivo(int dados, int caras, List<Integer> combinacionActual) {
        // Caso base: No hay más dados
        if (dados == 0) {
            // Imprimir la combinación
            imprimir(combinacionActual);
            return;
        }

        for (int cara = 1; cara <= caras; cara++) {
            List<Integer> nuevaCombinacion = new ArrayList<>(combinacionActual);
            nuevaCombinacion.add(cara);
            generarCombinacionesRecursivo(dados - 1, caras, nuevaCombinacion);
        }
    }

    private static void imprimir(List<Integer> combinacion) {
        for (int valor : combinacion) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

}

