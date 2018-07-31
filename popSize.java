/*
P3. Write a for loop to display the population sizes of an organism for each 
day using the initial population size (beginPop), their average daily increase(dailyInc), and the number of days (numDays) they will multiply (pop = beginPop + dailyInc * days). 
The program will display the size of the population for each day.
*/
import java.util.Scanner;

class popSize{
    public static void main(String[] args){
        int beginPop, dailyInc, numDays, pop;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the initial population size of this organism?");
        beginPop = input.nextInt();

        System.out.println("What is their average daily increase?");
        dailyInc = input.nextInt();

        System.out.println("How many days are we observing?");
        numDays = input.nextInt();

        int i;

        for(i = 1; i<=numDays; i++){
            pop = beginPop + dailyInc * i;
            System.out.println("On day " + i + ", there is a population of " + pop);
        }
    }
}