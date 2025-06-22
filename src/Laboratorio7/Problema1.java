package Laboratorio7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema1 {
    //Problema 1 Samir Horna
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    int fila = 0;
    int columnas = 0;
    int[][] matriz;

    public Problema1(int fila, int columnas) {
        this.fila = fila;
        this.columnas = columnas;
        this.matriz = new int[fila][columnas];
    }

    void matriz(){
        try {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    int deNuevo = 1;
                    while (deNuevo == 1) {
                        deNuevo = 0;
                        try {
                            System.out.printf("Ingrese el valor para la fila: " + i + " y columna: " + j + " ");
                            matriz[i][j] = Integer.parseInt(bufer.readLine());
                        } catch (IOException | NumberFormatException e) {
                            System.err.println("Error al leer el valor de la matriz: " + e.getMessage());
                            deNuevo = 1;
                        }
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
    void traspuesta(){
        int aux;
        for ( int i=0; i<fila; i++){
            for (int j = 0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("\nMatriz traspuesta:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}