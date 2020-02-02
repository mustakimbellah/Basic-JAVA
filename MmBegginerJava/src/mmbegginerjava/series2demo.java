
package mmbegginerjava;

import java.util.Scanner;


public class series2demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n ,result=1;
        System.out.print("Enter last number : ");
        n= input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            
            System.out.print(i+"X"+i+" ");
            
            result = result *i*i;
            
        }
        System.out.println();
        System.out.println(result);
        
        
    }
    
}
