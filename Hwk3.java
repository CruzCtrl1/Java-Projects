// This program calculates butterfly population estimates
// Inputs: males, estimated number of male butterflies
//         females, estimated number of female butterflies
// Outputs: total butterflies, sex ratio, variance
// Written by: Chris Cruz
// Last modified: June 28, 2018

import java.util.Scanner;
public class Hwk3{
    public static void main (String[] args){
        int males = 80, females = 30;
        int totalPenguins, sexRatio, ratioVariance, genderDifference, matingPairs;
        

        totalPenguins = males + females;
        sexRatio = males / females;
        ratioVariance = males % females;
        genderDifference = males - females;
        matingPairs = males * females;

        System.out.println("Total number of males: " + males);
        System.out.println("Total number of females: " + females);
        System.out.println("\nTotal Penguins: " + totalPenguins);
        System.out.println("Sex ratio: " + sexRatio);
        System.out.println("Variance: " + ratioVariance);
        System.out.println("Gender Difference: " + genderDifference);
        System.out.println("Mating Pairs: " + matingPairs);
    }
}