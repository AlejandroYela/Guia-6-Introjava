/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
                            Primer trabajo práctico evaluativo 10%
                            Segundo trabajo práctico evaluativo 15%
                            Primer Integrador 25%
                            Segundo integrador 50%
            Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/
        
       
        
        double [] vector = new double [3];
       int Cap=0, Cdesap=0;
        
        System.out.println("Ingrese las notas de cada alumno.");
       
       vector = llenarnotas();
       
       mostrarnotas (vector);
       
        for (int i = 0; i < vector.length; i++) {
            if (vector [i]>=7) {
                Cap++;
            }else{
                Cdesap++;
            }
        }
       
        System.out.println("Alumnos desaprobados: " + Cdesap);
        System.out.println("Alumnos aprobados: " + Cap);      
        
        
        
        
    }
    public static double [] llenarnotas (){
        Scanner leer = new Scanner(System.in);    
        double tp1, tp2, i1, i2;
        double [] notas = new double [3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno Nª" + (i+1)+ ":");
            System.out.print("Nota 1er trabajo practico: ");
            tp1=leer.nextDouble();
            System.out.println("");
             System.out.print("Nota 2do trabajo practico: ");
             tp2=leer.nextDouble();
            System.out.println("");
              System.out.print("Nota 1er integrador: ");
              i1=leer.nextDouble();
            System.out.println("");
               System.out.print("Nota 2do integrador: ");
               i2=leer.nextDouble();
            System.out.println("");
            
            notas [i] = 0.1*tp1 + 0.15*tp2+ 0.25 * i1 + 0.5*i2;           
        }
        
        return notas;
    }
    public static void mostrarnotas (double [] vector){  
        String notas ="Notas promedio de los alumnos= ";
        String n="";
        
        for (int i = 0; i < vector.length; i++) {
            n= String.valueOf(vector [i]);
            notas+=  " [" + n + "] " ;
        }
//        for (double i : vector) {
//            notas = notas.concat (" [" ) ; 
//                    notas = notas.concat (vector [i]);
//                    notas = notas.concat ("] ");
    System.out.println(notas);
          }
       
        }


