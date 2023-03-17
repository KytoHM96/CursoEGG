
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyto96
 */
public class exercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Escriba el primer número:");
        num1 = leer1.nextInt();
        System.out.println("Escriba el segundo número:");
        num2 = leer2.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("El resultado de las suma de ambos números es " + suma + ".");
             
              
    }
    
}
