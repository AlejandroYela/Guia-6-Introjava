/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

/**
 *
 * @author 2021
 */
public class Extra12 {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0- 0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 0-1-2 0-1-E Nota: investigar función equals() y como convertir
     * números a String.
     */
    public static void main(String[] args) {
        int a;
        String l;
        l="E";
        for (int i = 0; i < 1000; i++) {
            if (i<10) {
                
                System.out.println(+0+"-"+0+"-"+i);
                
            }else if (i<100) {
                System.out.println(+0+"-"+i/10+"-"+i%10);
            }else if (i<1000) {
                System.out.println(+(i/100)+"-"+((i/10)%10)+"-"+(i%10));
            }
            //System.out.println(i);
        }
    }

}
