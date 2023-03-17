
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
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número entero:");
        num = leer.nextInt();
        
        System.out.println(num*2);
        System.out.println(num*3);
        System.out.println(Math.sqrt(num));
                
    }
    
}
