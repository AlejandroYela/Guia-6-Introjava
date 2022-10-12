package introjava;

//import java.util.Scanner;
public class Ejercicio20 {

    public static void main(String[] args) {
        //Scanner l = new Scanner(System.in);
        int[][] cubo = {{3, 3, 1}, {3, 3, 3}, {3, 3, 3}};
        int cont;
        int filas = 0;
        int col = 0;
        int inv = 0;
        int limite;
        /*System.out.println("ingrese los 9 numeros del cubo");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cubo[i][j] = l.nextInt();
            }
        }*/
        cont = 0;
        for (int i = 0; i < 3; i++) {
            cont = cont + cubo[i][i];
        }
        limite = cont;

        for (int i = 0; i < 3; i++) {
            cont = 0;
            for (int j = 0; j < 3; j++) {
                cont = cont + cubo[i][j];
            }
            if (cont == limite) {
                filas++;
            }
        }
        for (int j = 0; j < 3; j++) {
            cont = 0;
            for (int i = 0; i < 3; i++) {
                cont = cont + cubo[i][j];
            }
            if (cont == limite) {
                col++;
            }
        }
        cont = 0;
        for (int i = 0; i < 3; i++) {
            cont = cont + cubo[i][2 - i];
        }
        if (cont == limite) {
            inv++;
        }
        if (filas == 3 && col == 3 && inv == 1) {
            System.out.println("ES MAGICO");
        }else{
            System.out.println("NO ES MAGICO");
        }
    }
}
