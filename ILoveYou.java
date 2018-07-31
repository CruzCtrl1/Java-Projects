//Playing with the JOptionPane

import javax.swing.JOptionPane;
class ILoveYou{
    public static void main(String[] args){
        String name;
        //Scanner name = new Scanner();
        name = JOptionPane.showInputDialog("Enter your name:");
        String bae = "bae";
        Boolean check = name.equals(bae);
        if(check == true){
            JOptionPane.showMessageDialog(null, "I love you " + name + "! You are so beautiful.");
        }
        else{
            JOptionPane.showMessageDialog(null, "What's up " + name + "! Go find bae for me.");
        }
        System.exit(0);
    }
}
