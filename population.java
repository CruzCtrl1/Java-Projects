/*
Write a program with a loop that lets the user enter a series of populations. The user should enter -99 to indicate the end of the series. 
After all the numbers have been entered, the program should display the smallest population entered. 
*/
import java.util.Scanner;

class population{
    public static void main(String[] args){
        int population, populationTotal = 0, smallest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a population");
        population = input.nextInt();
        smallest = population;

        while (population != -99){
            populationTotal = populationTotal + population;
            System.out.println("Enter another population. Otherwise, enter -99 to end");
            population = input.nextInt();
            
            if (population < smallest && population >= 0){
                    smallest = population;
            }
        }
        System.out.println("The smallest population entered was " + smallest);
    }
}