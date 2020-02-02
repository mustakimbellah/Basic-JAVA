
package mmbegginerjava;

import java.util.Scanner;


public class RectangleDemo {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        double length,width,rectangle;
        
        System.out.print("Enter length = ");
        length = input.nextDouble();
        
        System.out.print("Enter width = ");
        width = input.nextDouble();
        
        rectangle = length*width;
        
        System.out.println("Rectangle = "+rectangle);
    }
    
}
