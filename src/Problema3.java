public class Problema3 {


    public Problema3(){}

    int[][] enteros = {
        {1,2,3},
        {3,4,5},
        {6,7,8},
    };
    int[] vector = {0,0,0};

    public int[][] getEnteros() {
        return enteros;
    }

    void generarVector(int grado){
        int actual = 2;
        for(int i = 0; i < grado; i++){
            System.out.println("Numero: "+ enteros[actual][i]);
            vector[0] = enteros[actual][i];
            System.out.println("Se ingrese al vector: "+ vector[0]);
            actual--;
        }
    }

    void ordenarVector(){

    }



}


