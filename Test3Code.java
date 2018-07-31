/*
Code the body of the method called "qualityPoints" which takes one integer argument. The method returns the character 4 if the number is between 90 and 100, 3 
if the number is between 80 and 89, 2 if the number is between 70 and 79, and 1 if the number is between 60 and 69. Otherwise return 0;

Use the following header: public static char qualityPoints(int aveGrade)

Do not write the call for this method.
*/

public class Test3Code{
    public static void main(String[] args)
    {
        System.out.println(qualityPoints(30));
    }

    public static char qualityPoints (int aveGrade) 
    { 
        char output;
            if (aveGrade > 90 && aveGrade < 100)
            {
                return output = '4';
            }
            if (aveGrade > 80 && aveGrade < 89 )
            {
                return output = '3';
            }
            if (aveGrade > 70 && aveGrade < 79)
            {
                return output = '2';
            }
            if (aveGrade > 60 && aveGrade < 69)
            {
                return output = '1';
            }
            else
            {
                return output = '0';
            }
    }
}
