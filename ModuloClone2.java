import java.util.*;

class ModuloClone2{
    public static void main(String[] args){
        int input =10;
        int dividend = 3;
        ArrayList<Integer> n = new ArrayList<Integer>();
        Boolean comparison = input>dividend;

        if(comparison == true){
            dividend += dividend;
        }
        else{
            System.out.println(input-dividend);
        }
    }
}

//Not correct either