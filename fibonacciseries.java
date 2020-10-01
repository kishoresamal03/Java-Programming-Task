package ControlStructure.Loop;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci Series is:");
        for(int i=1;i<=n;i++){
            System.out.println(+n1);
            int t = n1 + n2;
            n1 = n2;
            n2 = t;
            
        }
        
    }
    
}
