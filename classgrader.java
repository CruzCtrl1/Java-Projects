public class classgrader{
    public static void main(String[] args){

        int score = 90;

        switch (score){
            case (score>=90) : System.out.println("A");
            
            case(score>=80): System.out.println("B");
            
            case(score>=70): System.out.println("C");

            case(score>=60): System.out.println("D");

            case(score<60): System.out.prinln("You failed");
        }
    }
}