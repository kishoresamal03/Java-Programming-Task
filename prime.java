package ControlStructure;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            int c = 0;
            int i = 1;
            while(i<=a){
                if(a%i==0)
                    c++;
                    i++;
                    
            }
            if(c==2){
                System.out.println(+a + " is a prime number");
            }
            else{
                System.out.println(+a + " is not a prime number");
            }
            
    }
    
}
