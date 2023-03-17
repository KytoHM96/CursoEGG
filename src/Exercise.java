
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
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int far;
        int cels;
        System.out.println("Ingrese los grados celsius:");
        cels = leer.nextInt();
        far = 32 + (9*(cels/5));
        System.out.println(cels + " °C equivalen a " + far + " fahrenheit.");
    }
    
}
