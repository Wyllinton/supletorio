package co.edu.uniquindio.poo.ejercicio3;


public class Main {
    public static void main(String[] args) {
        int numeroDados = 1;
        System.out.println("Generando todas las combinaciones posibles para " + numeroDados + " dados:");
        CombinacionesDados.generarCombinacionesDados(numeroDados, 6);
    }
}
