/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author JimeZ
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int cont1 = 0, cont2 = 0;
        do {
            cadena = leer.nextLine();
            if (cadena.length() < 6 && cadena.substring(0, 1).equals("X")
                    && cadena.substring(cadena.length() - 1).equals("O")) {
                cont1++;
            } else if (!cadena.equals("&&&&&")) {
                cont2++;
            }
                                       
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas es " + cont1 + " "
                + "y de incorrectas es " + cont2);
    }

    }
