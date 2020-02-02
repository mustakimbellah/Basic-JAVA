
package mmbegginerjava;

import java.util.Scanner;


public class factorialdemo {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int n,fact=1;
        System.out.print("Enter the number : ");
       n = input.nextInt();
       
        for (int i = n; i >=1; i--) {
           fact = fact*i;
            
            
        }
        System.out.println("factoriral of"+n+" = "+fact);
    }
    
}
