import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problema3 {

    //atributos y arreglos
    int grado = 0;
    int enteros[][];
    int [] vector;
    int[] arregloNuevo;
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

    //constructor
    public Problema3(int grado){
        this.grado = grado;
        this.enteros = new int[grado][grado];
        this.vector = new int[grado];
        this.arregloNuevo = new int[grado];
    }


    void rellenarArreglo(){
        while(true){
            int numero = 0;
            try{
                for(int i = 0; i < grado; i++){
                    for(int j = 0; j < grado; j++){
                        System.out.printf("Digite un numero entero para la posicion %d, %d ", i, j);
                        numero = Integer.parseInt(bufer.readLine());
                        enteros[i][j] = numero;
                    }
                }
            }
            catch (NumberFormatException e){
                System.out.println("Error en el formato de entrada, digita numeros");
                continue;

            }
            catch (IOException e){
                System.out.println("Error");
                continue;
            }

            break;
        }
    }

    void generarVector(){
        int actual = grado - 1;
        for(int i = 0; i < grado; i++){
            vector[i] = enteros[i][actual];
            actual--;
        }
        System.out.println("\nVector con la diagonal secundaria");
        System.out.printf("< ");
        for(int j = 0; j < grado; j++){
            System.out.printf("%d, ", vector[j]);
        }
        System.out.printf(">\n");

    }

    void ordenarVector(){
        Arrays.sort(vector);
        int index = grado - 1;
        for(int i = 0; i < grado; i++){
            arregloNuevo[i] = vector[index];
            index--;
        }
        System.out.println("\nVector con la diagonal secundaria ordenada de mayor a menor");
        System.out.printf("< ");
        for(int j = 0; j < grado; j++){
            System.out.printf("%d, ", arregloNuevo[j]);
        }
        System.out.printf(">\n");
    }
}


