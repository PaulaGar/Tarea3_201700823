/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc.tarea3;

/**
 *
 * @author paula
 */
import java.util.Scanner;
public class IPCTarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opcion, usuario, repetido, tres, promedio;
    int numre;
    Scanner S= new Scanner(System.in);
  
    do{
    System.out.println("1. Usuario");
    System.out.println("2. Contador de digitos");
    System.out.println("3. Tres numeros de mayor a menor");
    System.out.println("4. Calcular promedio");
    System.out.println("5. Salir");
    System.out.print("Escoga una opción");
    opcion= S.nextInt();
    }while(opcion>5);
    
    switch (opcion){
        case 1: 
            /*menu usuario*/
             do{
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Mostrar de forma ascendente");
        System.out.println("3. Mostrar de forma descendente");
        System.out.println("4. menú anterior");   
        System.out.print("Escoga una opción");
    usuario= S.nextInt();       
    }while(usuario>4);
            switch(usuario){
                case 1:
                   String[] nombre= new String[6];
                    for(int i=0;i<6;i++){
                    System.out.print("Ingrese el usuario: ");
                    nombre[i]= S.nextLine();
                    }  
                    System.out.println("\n Los usuarios son:");
                    for (int i=0 ;i<6;i++){
                    System.out.println(nombre[i]);
                    }
                    break;
                case 2:
                    
                    break;
                case 3: 
                    
                    break;
                case 4:
 
                    break;
    }
            break;
        
        case 2: /*Menu de numero repetido*/
            do{
        System.out.println("1. Ingresar numero");
        System.out.println("2. Ingresar numero a buscar");
        System.out.println("4. Mostrar repeticiones");
        System.out.println("3. Menu anterior");
        System.out.print("Escoga una opción");
    repetido= S.nextInt();       
    }while(repetido>3|| repetido<0);
            
            switch(repetido){
                case 1:
                    System.out.print("Ingrese un numero");
                    numre=S.nextInt();
                
                   break;
                case 2: 
                    System.out.println("aaaa");
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                    
            }
            
            break;
        
        case 3: /*Menu tres numeros*/
            do{
        System.out.println("1. Ingresar numeros");
        System.out.println("2. mostrar ordenados");
        System.out.println("3. menu anterior");   
        System.out.print("Escoga una opción");
    tres= S.nextInt();       
    }while(tres>4);
            switch(tres){
                case 1:
                    int[] trio= new int[3];
                      for(int i=0;i<3;i++){
                    System.out.print("Ingrese un numero: ");
                    trio[i]= S.nextInt();
                    } 
                        System.out.println("\n Los numeros son:");
                    for (int i=0 ;i<3;i++){
                    System.out.println(trio[i]);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            
            
            }
            break;
        
        
       case 4: /*menu promedio*/
          
        double [][] Matriz = new double[6][6];
        for (int i=0;i < Matriz.length;i++){
            for(int j=0; j< Matriz.length; j++){
                if(j==0){
                   System.out.print("Introducir id: ");
                    Matriz[i][0]=S.nextInt();
                } 
                 if (j!= 0 && j != 5) {
                    System.out.print("introducir nota para id pocision" +(i+1)+":");
                    Matriz[i][j]=S.nextInt();
                 }
                 if (j==5){
                     double res = 0;
                     for(int x=1;x<5;x++){
                            res = res + Matriz[i][x];    
                     }
                        double prom = res/4;
                        Matriz [i][5] = prom;
                        System.out.println("promedio :"+Matriz [i][5]);
                             
                }
            }
        }
    for (double[] Matriz1 : Matriz) {
        for (int j = 0; j< Matriz.length; j++) {
            System.out.print(Matriz1[j] + "  ");
        }
        System.out.println();
    }
            break;  
        case 5: /*salir*/
            break;
                
    }
    
    }
    
}
