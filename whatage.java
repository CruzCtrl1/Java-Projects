/*hw:

say if person is able to
1- drive (age 16)
2- vote (age 18)
3 - (both)
4- neither*/

public class whatage{
    public static void main(String[] args){
        int age = 10;
    
    if (age>=18){
        System.out.println("You can vote and drive!");
    
    }else{
        if (age>=16){
            System.out.println("You can only drive!");
        int ageleft = 18-age;
        String YouHave = "You have ";
        String years = " years left to vote!";
        String s = String.valueOf(ageleft);
        System.out.println(YouHave + s + years);
    }else{
        System.out.println("You can't vote or drive champ");
        int ageleft = 18-age;
        String YouHave = "You have ";
        String years = " years left to vote!";
        String years2 = " years left to drive";
        String s = String.valueOf(ageleft);
        int ageleft2 = 16-age;
        String t = String.valueOf(ageleft2);
        System.out.println(YouHave + s + years);
        System.out.println(YouHave + t + years2);
        }
    }
    }
}