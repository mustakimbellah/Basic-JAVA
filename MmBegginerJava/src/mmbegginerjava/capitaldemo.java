
package mmbegginerjava;

import java.util.Scanner;


public class capitaldemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter any letter : ");
        
        ch=input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            
            System.out.print("Small Letter");
        }
        
        else if(ch>='A' && ch<='Z')
        {
            System.out.print("Capital");
        }
        
    }
    
}
