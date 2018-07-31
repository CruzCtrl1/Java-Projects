/*
P1. Write a for loop that displays the even numbers from 2 to hiValue. For example if hiValue is 8, the loop displays: 2 4 6 8

import java.util.Scanner;

public class EvenNum{
    public static void main(String[] args){
        int hiValue;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the highest positive integer in the loop: ");
        hiValue = input.nextInt();

        for(i = 2; i <= hiValue; i += 2){
            System.out.println(i + " is part of the loop");
        }
    }
}
