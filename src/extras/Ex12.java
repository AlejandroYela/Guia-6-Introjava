/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

/**
 *
 * @author Usuario
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:   0-0-0    0-0-1    0-0-2    0-0-E    0-0-4    0-1-2    0-1-E
    Nota: investigar función equals() y como convertir números a String.*/

        int n1, n2, n3, nt, c = 1;
        String ntcad, ntcad2 = "";
        do {
            n1 = (int) (Math.random() * 9);
            n2 = (int) (Math.random() * 9);
            n3 = (int) (Math.random() * 9);

            if (!(n1 == 0)) {
                nt = n1 * 100 + n2 * 10 + n3;
                ntcad = String.valueOf(nt);
            } else if (!(n2 == 0)) {
                nt = n2 * 10 + n3;
                ntcad = "0".concat(String.valueOf(nt));

            } else {
                ntcad = "00".concat(String.valueOf(n3));
            }

        ntcad = ntcad.concat(".");

            for (int i = 0; i < 4; i++) {
                if (!"3".equals(ntcad.substring(i, (i + 1)))) {
                    ntcad2 = ntcad2.concat(ntcad.substring(i, (i + 1)));
                } else {
                    ntcad2 = ntcad2.concat("E");
                }
                if (ntcad2.length() < 5) {
                    ntcad2 = ntcad2.concat("-");
                }
                if (ntcad2.length() == 5) {
                    break;
                }
            }

            System.out.println(c + "ª contador: " + n1 + "-" + n2 + "-" + n3);
            System.out.println(c + "ª contador reemplazando 3 por E: " + ntcad2);
            c++;
            ntcad2 = "";
            ntcad = "";
        } while (c < 20);

    }

}
//para transformar cadena a numero es: variable (de tipo numerico)= Integer.parseint (la variable tipo string)
//para transformar numero a cadena es: variable (de tipo string)= Integer.toString (la variable tipo numerico)
// o String.valueOf
