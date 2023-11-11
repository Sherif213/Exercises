import java.util.Scanner;
import javax.swing.JOptionPane;
public class Firstproject {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Your age is: "+age);
        Scanner input=new Scanner(System.in);
        System.out.println("Hello");
        double friends=10;
        friends=(double)friends/3;
        System.out.println(friends);
        input.close();
    }
}