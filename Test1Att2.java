/*Write Java statements to accomplish the following.
1. display the message "Enter the number of items:" leaving the cursor on the same line
2. read the number of items
3. multiply the number of items with the mark up to produce the following output: 
"10.5 mark up on the items yields a total of " followed by the value of the product 
of numberOfItems and MARKUP

Finish the program below by entering a line of code for each of the 3 tasks above.*/

import java.util.Scanner; 
public class Test1Att2 {

    public static void main( String args[]) {
        final double MARKUP = 10.5;
        Scanner stdin = new Scanner(System.in);
        int numberOfItems; 
        System.out.print("Enter the number of items: ");
        numberOfItems = stdin.nextInt();
        double product = numberOfItems * MARKUP;

        System.out.println("10.5 mark up on items yields a total of " + product);


    }
}

