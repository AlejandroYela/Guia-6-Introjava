/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class ejercicioextra23DEFINITIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
         */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        String palabras;
        int cantidadPalabras = 0;
        String[][] sopaDeLetras = new String[20][20];
        int[] vector = new int[5];
        int columnas, filas, filasAux;
        int contador = 0, contadorLugares = 0;
        do {
            System.out.println("Ingrese una palabra: ");
            palabras = leer.next();
            contador = 0;
            contadorLugares = 0;

            if (palabras.length() >= 3 && palabras.length() <= 5) {

                columnas = random.nextInt(15);
                System.out.println(columnas);
                filas = random.nextInt(20);
                System.out.println(filas);

                do {
                    for (int j = columnas; j < columnas + palabras.length(); j++) {
                        if (sopaDeLetras[filas][j] == null) {

                            contadorLugares++;
                        }else if (sopaDeLetras[filas][j] != null) {
                            break;
                        }

                    }
                    if (contadorLugares == palabras.length()) {
                        for (int j = columnas; j < columnas + palabras.length(); j++) {

                            sopaDeLetras[filas][j] = palabras.substring(contador, contador + 1);
                            contador++;
                        }

                    } else {
                        columnas = random.nextInt(20 - palabras.length());
                        filas = random.nextInt(20);
                    }
                } while (contadorLugares != palabras.length());

                cantidadPalabras++;

            }else{
                System.out.println("La palabra es incorrecta");
            }

        } while (cantidadPalabras < 5);
        String numCadena;
        int num;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (sopaDeLetras[i][j] == null) {
                    num = (int) (Math.random() * 10);
                    numCadena = String.valueOf(num);
                    sopaDeLetras[i][j] = numCadena;
                }
            }

        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
