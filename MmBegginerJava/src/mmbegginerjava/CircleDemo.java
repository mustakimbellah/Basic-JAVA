
package mmbegginerjava;

import java.util.Scanner;


public class CircleDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double radius,circle;
        System.out.print("Enter radius = ");
        radius = input.nextDouble();
        
        circle = 3.1416*radius*radius;
        
        System.out.println("Circle = "+circle);
        
    }
    
}
