/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner R= new Scanner(System.in);        
        String [][] m=new String[20][20];
        String p="";
        int c=0;
        for (int i = 0; i < 5; i++) {        
        
        boolean b=false;
        do{        
            
        System.out.println("Ingrese una palabra de 3 a 5 letras");    
        p=R.next();
        p=p.toUpperCase();
        if(p.length()>=3&&p.length()<=5){
            
        b=true;
                }
        }while(b!=true);
        c++;
        llenado(m,p);
        }
        for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if(m[i][j]==null){
                        
                     m[i][j]=String.valueOf((int)(Math.random()*10));
                    }
                }
                
    }
        for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print("["+m[i][j]+"]");
                }
                System.out.println("");
    }
    }

    private static void llenado(String[][] m, String p) {
        int n,w;
        String v="";
        do{
            n=(int)(Math.random()*19);
            w=(int)(Math.random()*19);
        }while(w>p.length()&&w<(20-p.length()));
            
        for (int i=0; i < 20; i++){
            if(m[n][i]==null){
                v=null;
            }else{
                v="hay";
            }
        }

            if(v==null){                
            
                for (int j = 0; j < p.length(); j++) {
                    m[n][w+j]=p.substring(j,j+1);
                }
            }else{
                llenado(m,p);
            }
        
            
    }}
    

