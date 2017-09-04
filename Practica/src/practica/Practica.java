/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Damaris
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String nombre, var;
        System.out.println("Escribe un nombre:");
        nombre=leer.nextLine();
         cPractica obj= new cPractica(nombre);
        var =obj.cPractica();
        System.out.println(var);
    }
    
}
