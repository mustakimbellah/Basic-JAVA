
package mmbegginerjava;

import java.util.Scanner;


public class Ifleapyear {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter any Year : ");
        num = input.nextInt();
        
        if(num%400==0)
        {
            System.out.println("Leap Year");
        }
        
        else if(num%4== 0 && num%100!= 0)
        {
            System.out.println("Leap Year");
        }
        
        else
        {
            System.out.println("Not leap year");
        }
        
    }
    
}
