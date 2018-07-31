/*
17. Write a program that asks the user to enter a distance in meters as a double. The program than presents the user with the following menu of selections:
1    Convert to kilometers      
2    Convert to inches     
3    Convert to feet      
4    Quit the program 

After inputting the users response to the menu, the  program uses the following methods to display the response:      
showKilometers that uses the formula:           
    kilometers = meters * 0.001      
showInches that uses the formula:                     
    inches = meters * 39.37      
showFeet that uses the formula:                          
    feet = meters * 3.281
*/
import java.util.Scanner;

public class ConvertMeters4{

    Scanner input = new Scanner(System.in);     //sets up the Scanner object

    public static void main(String[] args){
    // This is the main method of the program. Once all the statements
    // have been run, the program terminates.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance in meters");
        double meters = input.nextDouble();

        //double meters = welcomeDialog();
        int selection = userChoice();
        
        do{
            try{
                switch (selection){
                    case 1: 
                        System.out.printf("Your input converted to kilometers is %,.2f", showKilometers(meters));
                        System.out.println("Goodbye");
                        break;
                    
                    case 2:
                        System.out.printf("Your input converted to inches is %,.2f", showInches(meters));
                        System.out.println("Goodbye");
                        break;
                    
                    case 3:
                        System.out.printf("Your input converted to feet is %,.2f", showFeet(meters));
                        System.out.println("Goodbye");
                        break;
                    
                    case 4:
                        System.out.println("You opted to not convert your input. Goodbye.");
                        System.exit(0);
                    }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        } while (true);
    }

    public static int userChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to convert your input to? Type:");
        System.out.print("1 for kilometers, 2 for inches, ");
        System.out.println("3 for feet, or 4 to quit the program");
        int selection = input.nextInt();
        return selection;
    }

    public static double showKilometers(double meters){
        double kilometers = meters * 0.001;
        return kilometers;
    }

    public static double showInches(double meters){
        double inches = meters * 39.37;
        return inches;
    }

    public static double showFeet(double meters){
        double feet = meters * 3.281;
        return feet;
    }
}
