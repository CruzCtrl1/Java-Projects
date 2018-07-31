/*Replace every "P" with a "B"
Want an if loop. Want to check from initial letter (0) to last letter. Increment plus one
if (any letter = true){
    change letter to B
}
Store new string into something

System.out.println(something);

*/
import java.util.*;

class PtoB2{
    
    public static void main(String[] args){

        /*
        HashMap<String, Integer> input = new HashMap<String, Integer>();
        
        input.put("p", 0);
        input.put("o", 1);
        input.put("o", 2);
        input.put("p", 3);
        */

        String input = "pooP";

        int size = input.length();

        for(start = 0; start < input.length(); start++){
            if(input.contains("p")){
                String newinput = input.replaceAll("p", "b");
                //newinput.setCharAt(input.indexOf('p') , 'b');
                //String newinput = input.replace('p', 'b');
            }
            if(input.contains("P")){
                //String newinput2 = new StringBuilder(newinput);
                //newinput2.setCharAt(newinput.indexOf('P'), 'B');
            }
           // System.out.println(newinput2);
        }
    }
}

//Incomplete