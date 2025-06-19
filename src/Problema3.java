import java.util.Arrays;

public class Problema3 {


    public Problema3(){}

    int[][] enteros = {
        {1,2,4},
        {3,5,5},
        {1,7,8},
    };
    int[] vector = {0,0,0};


    public int[][] getEnteros() {
        return enteros;
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


