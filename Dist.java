/*
P2. Write a for loop that displays the distance traveled for each hour (distance = speed * time) given the speed and the numberHours traveled. For example, 
if speed is 40 mph, and numberHours is 3 hours, the loop displays: 1 40 2 80 3 120 
*/
import java.util.Scanner;

class Dist{
    public static void main(String[] args){
        int numberHours, speed, distance, i;
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many hours have you been travelling?");
        numberHours = input.nextInt();

        System.out.println("What is your speed in miles per hour?");
        speed = input.nextInt();

        for(i = 0; i<=numberHours; i++){
            distance = speed * i;
            System.out.println("On hour " + i + ", your distance travelled is " + distance);
        }

    }
}