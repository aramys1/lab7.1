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
                        //problema 4
                        int cantidadEstudiantes = 0;

                        try {
                            System.out.println("Ingrese la cantidad de estudiantes: ");
                            cantidadEstudiantes = Integer.parseInt(bufer.readLine());
                        } catch(IOException e){
                            System.out.println("\nError al leer la entrada.");
                            return; // o System.exit(1);
                        } catch(NumberFormatException e){
                            System.out.println("\nError en el formato de entrada.");
                            return;
                        }

                        int[] notas = new int[cantidadEstudiantes];
                        String[] nombres = new String[cantidadEstudiantes];

                        int i = 0;
                        while(i < cantidadEstudiantes){
                            try {
                                System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                                nombres[i] = bufer.readLine();

                                System.out.println("Ingrese la nota de " + nombres[i] + ": ");
                                notas[i] = Integer.parseInt(bufer.readLine());

                                i++; 

                            } catch(IOException e){
                                System.out.println("\nError al leer la entrada.");
                            } catch(NumberFormatException e){
                                System.out.println("\nError en el formato de entrada.");
                            }
                        }
                        int opcion = 0;
                        try {
                            System.out.println("\n¿Ordenar por nombre (1) o por nota (2)?");
                            opcion = Integer.parseInt(bufer.readLine());
                        } catch(IOException e){
                                System.out.println("\nError al leer la entrada.");
                        } catch(NumberFormatException e){
                                System.out.println("\nError en el formato de entrada.");
                        }

                        Problema4 problema4 = new Problema4();

                        if (opcion == 1) {
                            problema4.ordenarPorNombre(nombres, notas);
                        } else if (opcion == 2) {
                            problema4.ordenarPorNota(nombres, notas);
                        } else {
                            System.out.println("Opción no válida.");
                            return;
                        }

                        System.out.println("\nEstudiantes ordenados:");
                        for (i = 0; i < cantidadEstudiantes; i++) {
                            System.out.println(nombres[i] + " - " + notas[i]);
                        }

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
