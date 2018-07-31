/*
Embellish your Homework program 1-C (the Butterflies) by making the following additions:

1) Include a new calculation called "Growth factor" by taking the square root of the product (mating pairs). Use DecimalFormat (discussed last week) to make the 
output of the growth factor be 3 decimal digits.

2) Include a new calculation called "Ratio factor" by dividing the growth factor by the sex ratio, unless the sex ratio is zero. If the sex ratio is zero then set the 
ratio factor to the square root of the ratio variance. Use DecimalFormat (discussed last week) to make this output be 1 decimal digit.

3) Include a new calculation called the "Potential population" by raising 2 to the power of the ratio factor, after truncating the ratio factor to an integer. Use the pow 
method with 2 as the first argument, and casting the second argment to do this. Display the potential population as an integer with no decimal digits.


Also you can use showMessageDialog and showInputDialog for I/O if you have a way to run Java not on hills.

Turn in the program listing and sample program outputs including the following sets of data in your submission: 
Males=50, Females=15 (the potential population should be 512)
Males=1, Females=10
Males=10,Females=1
*/

// Program: Calculates total number of male and female penguins,
//      sex ratios, variance, gender difference, mating pairs,
//      and the potential population
// Input: number of male and female penguins
// Output: number of male and female penguins,
//      sex ratios, variance, gender difference, mating pairs,
//      and the potential population
// Created by: Chris Cruz
// Last modified: July 11, 2018

import java.util.Scanner;
import java.text.DecimalFormat;

public class Butterflies{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of male butterflies: ");
        int males = input.nextInt();
        System.out.println("Enter the number of female butterflies: ");
        int females = input.nextInt();
        System.out.println("");
        int totalPenguins, sexRatio, ratioVariance, genderDifference, matingPairs;
        DecimalFormat oneDigit = new DecimalFormat("#, ##0.0");
        DecimalFormat threeDigits = new DecimalFormat("#, ##0.000");

        totalPenguins = males + females;
        sexRatio = males / females;
        ratioVariance = males % females;
        genderDifference = Math.abs(males - females);
        matingPairs = males * females;
        
        double growthFactor = Math.sqrt(matingPairs);
        String growthFactorFormatted = threeDigits.format(growthFactor);
        growthFactor = Double.parseDouble(growthFactorFormatted);
        
        double ratioFactor;
        if(sexRatio != 0){
            ratioFactor = growthFactor / sexRatio;
            String ratioFactorFormatted = oneDigit.format(ratioFactor);
            ratioFactor = Double.parseDouble(ratioFactorFormatted);
        }else{
            ratioFactor = Math.sqrt(ratioVariance);
            String ratioFactorFormatted = oneDigit.format(ratioFactor);
            ratioFactor = Double.parseDouble(ratioFactorFormatted);
        }

        int potentialPopulation = (int) Math.pow(2, (int)ratioFactor);
        
        System.out.println("Based on the inputs:");
        System.out.println("Total number of males: " + males);
        System.out.println("Total number of females: " + females);
        System.out.println("\nTotal Penguins: " + totalPenguins);
        System.out.println("Sex ratio: " + sexRatio);
        System.out.println("Variance: " + ratioVariance);
        System.out.println("Gender Difference: " + genderDifference);
        System.out.println("Mating Pairs: " + matingPairs);
        System.out.println("The growth factor is " + growthFactor);
        System.out.println("The ratio factor is " + oneDigit.format(ratioFactor));
        System.out.println("The potential population is " + potentialPopulation);
    }
}
