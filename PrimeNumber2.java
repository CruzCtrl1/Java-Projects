import java.util.Scanner;

public class PrimeNumber2{

    public static void main(String[] args){
 
        Scanner user = new Scanner(System.in);

        System.out.println("Enter a number to check:");
        int input = user.nextInt();
        
        int remainder = 0;
        Boolean isPrime = true;

        for (int start = 2; start < (input / 2); start++) {
            int result = input % start;
            if (result == remainder) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(input + " is a prime number!");
        else
            System.out.println(input + " is not a prime number");
    }
}