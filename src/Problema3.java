import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problema3 {


    int enteros[][];
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));



    int[] vector = {0,0,0};


    void rellenarArreglo(int grado){
        enteros = new int[grado][grado];
        for(int i = 0; i < grado; i++){
            for(int j = 0; j < grado; j++){

            }
        }

    }





    void generarVector(int grado){
        int actual = grado - 1;
        for(int i = 0; i < grado; i++){
            System.out.println("Numero: "+ enteros[actual][i]);
            vector[i] = enteros[actual][i];
            System.out.println("Se ingrese al vector: "+ vector[i]);
            actual--;
        }
    }

    void ordenarVector(){

        Arrays.sort(vector);
        int arregloNuevo[] = {0,0,0};
        int index = vector.length - 1;
        for(int i = 0; i < vector.length; i++){
            arregloNuevo[i] = vector[index];
            index--;
        }
        for(int j = 0; j < vector.length; j++){
            System.out.println("Ordenado: "+ arregloNuevo[j]);
        }

    }



}


