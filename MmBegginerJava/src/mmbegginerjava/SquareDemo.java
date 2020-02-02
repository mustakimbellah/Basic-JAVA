
package mmbegginerjava;

import java.util.Scanner;


public class SquareDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double lenght,square;
        System.out.print("Enter lenght = ");
        lenght = input.nextDouble();
        
        square = lenght*lenght;
        
        System.out.println("Square = "+square);
    }
}
