/*
P4. Write a for loop that uses a lower bound temperature (loTemp), an upper bound temperature (hiTemp) and a temperature increment (tempInc), to displays 
a table of Centigrade and Fahrenheit equivalents using F = 9/5C + 32, from the lower bound temperature to the upper bound temperature using the increment. 
*/
import java.util.Scanner;

class TempInc{
    public static void main(String[] args){
        int loTemp, hiTemp, tempInc, start, Farenheit;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the lower bound temperature in Celcius?");
        loTemp = input.nextInt();

        System.out.println("What is the upper bound termperature in Celcius?");
        hiTemp = input.nextInt();

        System.out.println("What is the temperature increment in Celcius?");
        tempInc = input.nextInt();

        for(start = loTemp; start <= hiTemp ; start += tempInc){
            Farenheit = ((9/5)*start) + 32;
            System.out.println("Your temperature in Celcius is " + start + " and your temperature in Farenheit is " + Farenheit);
        }
    }
}