
package mmbegginerjava;

import java.util.Scanner;


public class SelectionIF {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num ;
        System.out.print("Enter any Number : ");
        num = input.nextInt();
        
        if(num>0)
        {
            System.out.println("Positive number ");
        }
        
        else if(num<0)
        {
            System.out.println("Negative number");
        }
        
        else
        {
            System.out.println("Zero");
        }
        
    }
    
}
