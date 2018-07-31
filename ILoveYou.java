import javax.swing.JOptionPane;
//import java.util.Scanner;
class ILoveYou{
    public static void main(String[] args){
        String name;
        //Scanner name = new Scanner();
        name = JOptionPane.showInputDialog("Enter your name:");
        //System.out.println(name);
        String bae = "Wendy";
        //System.out.println(bae);
        Boolean check = name.equals(bae);
        //System.out.println(check);
        if(check == true){
            JOptionPane.showMessageDialog(null, "I love you " + name + "! You are so beautiful.");
        }
        else{
            JOptionPane.showMessageDialog(null, "What's up " + name + "! Go find Wendy for me.");
        }
        System.exit(0);
    }
}

//Finally got it working! Can't set two strings equal to each other with ==, as it checks the addresses (not the same)
//Instead, I have to use the object.equals(object)
//Can also do this with a scanner.