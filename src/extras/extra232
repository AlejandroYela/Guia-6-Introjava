package Guia6;

import java.lang.reflect.Array;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

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
        int pl = 1, pz = 0, ph=(int) (Math.random() * (20 - 5)), pi=(int) (Math.random() * 20);
        String[][] matriz = new String[20][20];
        String p1 = "r";//, p2, p3, p4, p5;
        
        System.out.println("Ingrese la palabra para introducir en la sopa de letras");
        do {
            switch (pl) {
                case 1:
                    System.out.println("Primera Palabra");
                    p1 = leer.next();
                    break;
                case 2:
                    System.out.println("Segunda Palabra");
                    p1 = leer.next();
                    break;
                case 3:
                    System.out.println("Tercera Palabra");
                    p1 = leer.next();
                    break;
                case 4:
                    System.out.println("Cuarta Palabra");
                    p1 = leer.next();
                    break;
                case 5:
                    System.out.println("Ultima Palabra");
                    p1 = leer.next();
                    break;
            }
            
            if (p1.length() < 6 && p1.length() > 2 ) {
                pl++;
                for (int j = ph; j < ph + p1.length(); j++) {
                    matriz[pi][j] = p1.substring(pz, pz + 1);
                    pz++;
                }
                pz = 0;
                do{
                ph = (int) (Math.random() * (20 - p1.length()));  
                pi = (int) (Math.random() * 20);
                }while(matriz[pi][ph]!=null);
            } else {
                System.out.println("La palabra ingresada es incorrecta");
            }
        } while (pl != 6);
//--------------------------------------------------------------------------------------------
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j]==null){
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
