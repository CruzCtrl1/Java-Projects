public class CombinedAssignmentOperators{
    public static void main(String[] args){
        int input = 10;
        System.out.println("This is the input: " + input);
        input += 5;
        System.out.println("This is the result of using +=5: " + input);
        input -= 10;
        System.out.println("This is the result of using -=10: " + input);
        input*=2;
        System.out.println("This is the result of using *=2: " + input);
        input/=2;
        System.out.println("This is the result of using /=2: " + input);
        input%=2;
        System.out.println("This is the result of using %=2: " + input);
        
    }
}