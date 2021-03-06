/*
E1. Write a program to produce the factorial of the number. The factorial of a number n is equal to the product of all numbers up to the number n. (i.e. the factorial of 4 = (1)*(2)*(3)*(4) = 24. 
The program should input the number n and output the factorial of that number.
*/
import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        int n, i, factorial;
        Scanner input = new Scanner(System.in);

        System.out.println("What number do you want to find the factorial of?");
        n = input.nextInt();
        i = 1;
        factorial = i;
        for(i = 1; i<=n; i++){
            if(i<=n){
                factorial = i * factorial;
            }
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
