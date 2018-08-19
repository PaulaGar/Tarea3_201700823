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
                    System.out.println("Ingrese el usuario");
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
        System.out.println("2. ingresar numero a buscar");
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
            break;
        
        
       case 4: /*menu promedio*/
            do{
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Mostrar de forma ascendente");
        System.out.println("3. Mostrar de forma descendente");
        System.out.println("4. menú anterior");   
        System.out.print("Escoga una opción");
    promedio= S.nextInt();       
    }while(promedio>4);
            break; 
        case 5: /*salir*/
            break;
                
    }
    
    }
    
}
