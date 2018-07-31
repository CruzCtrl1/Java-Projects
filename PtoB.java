/*Replace every "P" with a "B"
Want an if loop. Want to check from initial letter (0) to last letter. Increment plus one
if (any letter = true){
    change letter to B
}
Store new string into something

System.out.println(something);

*/
import java.util.*;

class PtoB{
    
    public static void main(String[] args){
        String input = "pooP";
        
        String newinput = input.replace('p', 'b');
        String newinput2 = newinput.replace('P', 'B');
        System.out.println(newinput2);
                
        
    }
}