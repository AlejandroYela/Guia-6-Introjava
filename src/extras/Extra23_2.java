/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 2021
 */
public class Extra23_2 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
     * y, a medida que el usuario las va ingresando, construya una “sopa de
     * letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se
     * ubicarán todas en orden horizontal en una fila que será seleccionada de
     * manera aleatoria. Una vez concluida la ubicación de las palabras, rellene
     * los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente
     * imprima por pantalla la sopa de letras creada. Nota: Para resolver el
     * ejercicio deberá investigar cómo se utilizan las siguientes funciones de
     * Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Random r = new Random();
        String p;
        //a=numero de palabras, g=contador, h=contador de lugares, c=columnas, f=filas; e=filas auxiliar
        //s=sopa de letras
        int a = 0, g , h ;
        int c, f, e;
        String[][] s = new String[20][20];            
               
        do {
            System.out.println("Digite una palabra entre 3 y 5 caracteres:");
            p=l.next();
            p=p.toUpperCase();
            g=0;
            h=0;
            if (p.length()>=3 && p.length()<=5) {
                c=r.nextInt(15);
                
                f=r.nextInt(20);
                
                do {
                    for (int j = c; j < c+p.length(); j++) {
                        if (s[f][j]==null) {
                            h++;
                        }else{
                            break;
                        }
                    }
                        if (h==p.length()) {
                            for (int j = c; j < c+p.length(); j++) {
                                s[f][j]=p.substring(g, g+1);
                                g++;
                            }
                        }else{
                            c=r.nextInt(20-p.length());
                           
                            f=r.nextInt(20);
                            
                        }                    
                } while (h!=p.length());
                a++;
            }else{
                System.out.println("La palabra digitada no es valida");
            }
        } while (a<5);
        System.out.println("");
        String n;
        int m;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (s[i][j]==null) {
                    m=(int) (Math.random()*10);
                    n=String.valueOf(m);
                    s[i][j]=n;                    
                } 
                 System.out.print(" "+s[i][j]+" ");
            }  
            System.out.println("");
        }            
        
    }

}
