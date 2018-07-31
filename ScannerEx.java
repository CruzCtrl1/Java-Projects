import java.util.Scanner;
class ScannerEx{
    public static void main(String[] args){
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Your name is: " + name);
    }
}