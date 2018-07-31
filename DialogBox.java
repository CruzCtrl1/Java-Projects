import javax.swing.JOptionPane;
//This statement tells javac where to find JOptionPane class

class DialogBox{
    public static void main(String[] args){
        String name;
        name = JOptionPane.showInputDialog("Enter your name: ");
        //System.out.println("Hello " + name + "!");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
        System.exit(0);
    }
}