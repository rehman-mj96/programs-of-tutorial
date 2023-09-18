package Myclasses_MJ;

import java.util.Scanner;

public class Recursion{
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int fibonacci(int x){
        if(x==1 || x==2){
            return x-1;
        }
        else{
            int fibN = fibonacci(x-1) + fibonacci(x-2);
        return fibN;
        }
    }
    public static void main(String[] args) {
        int x = 4;
        //System.out.println("The factorial of x is : " + factorial(x));
        //System.out.println("the fibonacci sequence of x is : " + fibonacci(4));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the sequence:");
        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.printf("   " + fibonacci(i));
        }
        System.out.println("");
    }
}