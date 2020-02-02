
package mmbegginerjava;

import java.util.Scanner;


public class series1demo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, sum=0;
        
        System.out.print("enter the last number : ");
        n= input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"x"+i+" ");
            
            sum= sum+i*i;
           
        }
        System.out.println();
        System.out.println(sum);
        
        
    }
    
}
