import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //hola mundo
        //prueba en intellij

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int accesoCase = 0;
        int accesoSalida = 0;

        System.out.println("\nMenu principal\nElige el problema de matrices y arreglos que quieres realizar\n");
        while(true){
            try{
                System.out.println("1. Problema1\n2. Problema2\n3. Generar un vector de la diagonal secundaria ordenado de mayor a menor\n4. Problema4\n5. Salir");
                accesoCase = Integer.parseInt(bufer.readLine());

                switch (accesoCase){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        //problema 3
                        while(true){
                            int gradoMatriz = 0;

                            try{
                                System.out.println("Ingrese el grado de la matriz");
                                gradoMatriz = Integer.parseInt(bufer.readLine());
                            }
                            catch (NumberFormatException e){
                                System.out.println("Error en el formato de entrada, digita numeros\n");
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
                        break;
                    case 4:
                        break;

                    case 5:
                        //salir
                        accesoSalida = 1;
                        break;
                    default:
                        System.out.println("Numero invalido, intenta de nuevo \n");
                        continue;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Formato en el formato de entrada, digita numeros validos\n");
                continue;

            }
            catch (IOException e){
                System.out.println("Error");
                continue;
            }
            if(accesoSalida == 1){
                break;
            }

        }

    }
}
