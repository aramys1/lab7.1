import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //hola mundo
        //prueba en intellij

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int accesoCase = 0;

        try{
            System.out.println("1. Problema1\n2.Problema2\n3.Problema3\n4.Problema4");
            accesoCase = Integer.parseInt(bufer.readLine());

            switch (accesoCase){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    while(true){
                        int gradoMatriz = 0;

                        try{
                            System.out.println("Ingrese el grado de la matriz");
                            gradoMatriz = Integer.parseInt(bufer.readLine());
                        }
                        catch (NumberFormatException e){
                            System.out.println("Error en el formato de entrada, digita numeros");
                            continue;

                        }
                        catch (IOException e){
                            System.out.println("Error");
                            continue;
                        }
                        Problema3 problema3 = new Problema3(gradoMatriz);

                        problema3.rellenarArreglo();
                        problema3.generarVector();
                        problema3.ordenarVector();
                        break;
                    }
                case 4:
                    break;
                default:
                    break;
            }

        }
        catch (NumberFormatException e){
            System.out.println("formato de numero equivocado");
        }
        catch (IOException e){
            System.out.println("Io error");
        }

    }
}
