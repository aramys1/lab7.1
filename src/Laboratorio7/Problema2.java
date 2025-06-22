package Laboratorio7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Problema2 {
    //Problema 2 Samir Horna
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    int fila = 0;
    int columnas = 0;
    int[][] matriz;
    int[] mayores;

    public Problema2(int fila, int columnas) {
        this.fila = fila;
        this.columnas = columnas;
        this.matriz = new int[fila][columnas];
        this.mayores = new int[fila];
    }

    void matriz() {
        try {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    try {
                        System.out.printf("Ingrese el valor para la fila: " + i + " y columna: " + j+ " ");
                        matriz[i][j] = Integer.parseInt(bufer.readLine());
                    } catch (IOException | NumberFormatException e) {
                        System.err.println("Error al leer el valor de la matriz: " + e.getMessage());
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error general al leer la matriz: " + e.getMessage());
            return;
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    void valoresGrandes() {
        int mayor;

        for (int i = 0; i < fila; i++) {
            mayor = matriz[i][0];

            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            mayores[i] = mayor;
        }
        System.out.println("El valores más grandes por fila:");
        for (int i = 0; i < fila; i++) {
            System.out.println("Fila " + i + ": " + mayores[i]);
        }
    }
}
