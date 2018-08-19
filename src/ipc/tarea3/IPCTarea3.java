/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc.tarea3;

/**
 *
 * @author paula garcía
 */
import javax.swing.JOptionPane;
public class IPCTarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, usu, rep, may, prom;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("[IPC]Tarea3_201700823\n1. Usuarios\n2. Contador de digitos repetidos\n3. Tres números de mayor a menor\n4. Calcular promedio\n5. Salir"));
        
        switch(opcion){
            
            case 1:
                do{
                usu = Integer.parseInt(JOptionPane.showInputDialog("Usuarios\n1. Ingresar Usuarios \n2. Mostrar usuarios ascendentes\n3. Mostrar usuarios descendentes\n4. Menú principal"));;
                switch(usu){
                
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:                       
                        break;
                }} while (usu !=4);
               break;   
            
            case 2:
                do{
                rep = Integer.parseInt(JOptionPane.showInputDialog("Contador de digitos repetidos\n1. Ingresar número \n2. Ingresar número a buscar\n3. Mostrar número de digitos\n4. Menú principal"));;
                switch(rep){
                
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:                       
                        break;
                }} while (rep !=4);
               break; 
            case 3:
                 do{
                may = Integer.parseInt(JOptionPane.showInputDialog("Tres números de mayor a menor\n1. Ingresar números \n2. Mostrar ordenados\n3. Menú principal"));;
                switch(may){
                
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }} while (may !=3);
               break; 
            case 4:
                    do{
                prom = Integer.parseInt(JOptionPane.showInputDialog("Usuarios\n1. Ingresar Usuarios \n2. Mostrar usuarios ascendentes\n3. Mostrar usuarios descendentes\n4. Menú principal"));;
                switch(prom){
                
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:                       
                        break;
                }} while (prom !=4);
               break; 
            case 5:
               break; 
               
               
        }} while(opcion !=5);
        
    }
    
}
