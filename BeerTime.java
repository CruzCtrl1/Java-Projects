import java.util.Scanner;
class BeerTime{
    public static void main(String[] args){
        int hoursStudied;
        Scanner timeInput = new Scanner(System.in);
        System.out.println("How many hours did you study today?: ");
        hoursStudied = timeInput.nextInt();
        int sufficientTime = 5;
        if(hoursStudied >= sufficientTime){
            System.out.println("You can go grab a beer");
        }
        else{
            System.out.println("Go study more!");    
        }
    }
}