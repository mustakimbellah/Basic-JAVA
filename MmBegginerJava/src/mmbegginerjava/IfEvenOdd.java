
package mmbegginerjava;

import java.util.Scanner;


public class IfEvenOdd {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter Positive number : ");
        num = input.nextInt();
        
        if(num%2==0)
        {
            System.out.println("Even Number ");  
        }
        
        else if (num%2!=0)
        {
            System.out.println("Odd number ");
        }
        
      
        
    }
    
}
