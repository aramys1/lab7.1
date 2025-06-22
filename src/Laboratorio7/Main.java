package Laboratorio7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Laboratorio7.Excepciones.ExcepcionDeNombre;

public class Main {
    //Main Aramys Cedeño
    public static void main(String[] args) {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int accesoCase = 0;
        int accesoSalida = 0;

        System.out.println("\nMenu principal\nElige el problema de matrices y arreglos que quieres realizar");
        while(true){
            try{
                System.out.println("\n1. Problema1\n2. Problema2\n3. Generar un vector de la diagonal secundaria ordenado de mayor a menor\n4. Ordenar estudiantes por nombre o nota\n5. Salir");
                accesoCase = Integer.parseInt(bufer.readLine());

                switch (accesoCase){
                    case 1:
                        //Problema 1 Samir Horna
                        break;
                    case 2:
                        //Problema 2 Samir Horna
                        break;
                    case 3:
                        //Problema 3 Aramys Cedeño
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
                        //Problema 4 Diego Cedeño
                        int cantidadEstudiantes = 0;

                        try {
                            System.out.print("\nIngrese la cantidad de estudiantes: ");
                            cantidadEstudiantes = Integer.parseInt(bufer.readLine());
                            if (cantidadEstudiantes <= 0) {
                                System.out.println("\nLa cantidad de estudiantes debe ser mayor que 0.");
                                continue;
                            }
                            else if (cantidadEstudiantes > 100) {
                                System.out.println("\nLa cantidad de estudiantes no puede ser mayor a 100.");
                                continue;
                            }
                        } catch(IOException e){
                            System.out.println("\nError al leer la entrada.");
                            continue;
                        } catch(NumberFormatException e){
                            System.out.println("\nError en el formato de entrada.");
                            continue;
                        }

                        int[] notas = new int[cantidadEstudiantes];
                        String[] nombres = new String[cantidadEstudiantes];

                        int i = 0;
                        while(i < cantidadEstudiantes){
                            try {
                                System.out.print("\nIngrese el nombre del estudiante " + (i + 1) + ": ");
                                nombres[i] = bufer.readLine();

                                String regex = "[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+";
                                if (!nombres[i].matches(regex)) {
                                    throw new ExcepcionDeNombre();
                                }
                                else{
                                    System.out.print("\nIngrese la nota de " + nombres[i] + ": ");
                                    notas[i] = Integer.parseInt(bufer.readLine());
                                    if (notas[i] < 0 || notas[i] > 100) {
                                        System.out.println("\nLa nota debe estar entre 0 y 100");
                                        continue; 
                                    }

                                    i++; 
                                }
                            } catch(ExcepcionDeNombre e){
                                System.out.println("\nNombre inválido: " + e.getMessage());
                            } catch(IOException e){
                                System.out.println("\nError al leer la entrada.");
                            } catch(NumberFormatException e){
                                System.out.println("\nError en el formato de entrada.");
                            }
                        }
                        int opcion = 0;
                        Problema4 problema4 = new Problema4();
                        int deNuevo = 1;
                        while(deNuevo == 1){
                            try {
                                System.out.print("\nIngrese 1 para ordenar por nombre o 2 para ordenar por nota: ");
                                opcion = Integer.parseInt(bufer.readLine());
                                if (opcion == 1) {
                                    problema4.ordenarPorNombre(nombres, notas);
                                    System.out.println("\nEstudiantes ordenados:\n");
                                    for (i = 0; i < cantidadEstudiantes; i++) {
                                        System.out.println(nombres[i] + " - " + notas[i]);
                                    }
                                    deNuevo = 0;
                                } else if (opcion == 2) {
                                    problema4.ordenarPorNota(nombres, notas);
                                    System.out.println("\nEstudiantes ordenados:\n");
                                    for (i = 0; i < cantidadEstudiantes; i++) {
                                        System.out.println(nombres[i] + " - " + notas[i]);
                                    }
                                    deNuevo = 0;
                                } else {
                                    System.out.println("\nOpción no válida."); 
                                    continue;
                                }
                            } catch(IOException e){
                                    System.out.println("\nError al leer la entrada.");
                            } catch(NumberFormatException e){
                                    System.out.println("\nError en el formato de entrada.");
                            }
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
