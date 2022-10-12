package introjava;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Ejercicio14 {
                      
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double n;
        String m;
        System.out.println("ingrese la cantidad de euros");
        n = leer.nextDouble();
        System.out.println("ingrese la moneda a cambiar");
        m = leer.next();
        cambio(n, m);
    }

    public static void cambio(double euro, String moneda) {

        switch (moneda) {
            case "dolares":
                System.out.println("Dólares: " + (euro*0.86));
                break;
            case "yenes":
                System.out.println("Yenes: " + (euro*129.852));
                break;
            case "libras":
                System.out.println("Libras: " + (euro*1.28611));
                break;
            default:
                System.out.println("moneda no encontrada");
        }
    }
}
