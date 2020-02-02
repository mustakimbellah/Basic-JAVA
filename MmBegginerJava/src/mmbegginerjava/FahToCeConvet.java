
package mmbegginerjava;

import java.util.Scanner;



public class FahToCeConvet {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double farn,cels;
        
        System.out.print("Fahrenheit = ");
        farn = input.nextDouble();
        
        cels= 0.6 * (farn-32);
        
        System.out.println("Celsius = "+cels);
     }
    
};
