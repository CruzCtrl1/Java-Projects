// Program: Determines the most number of units sold and by who
// Input: Number of salespersons and number of units sold by each
// Output: Which salesperson sold the most units and how many they sold
// Written by: Chris Cruz
// Last modified: July 5, 2018

import java.util.Scanner;

public class Max{
    public static void main(String[] args){
        int numberOfSalespersons, unitsSold;
        Scanner input = new Scanner(System.in);

        System.out.println("How many salespersons are there?");
        numberOfSalespersons = input.nextInt();

        if(numberOfSalespersons>0){
            System.out.println("How many units did salesperson #1 sell?");
            unitsSold = input.nextInt();
            int max = unitsSold, bestSalesperson = 1;    
            
            for(int i = 2 ; i <= numberOfSalespersons ; i++){
                System.out.println("How much did salesperson #" + i + " sell?");
                unitsSold = input.nextInt();

                if(max < unitsSold){
                    max = unitsSold;
                    bestSalesperson = i;
                }
            }
        System.out.println("The most units sold were " + max + " by salesperson #" + bestSalesperson);
        }
    }
}