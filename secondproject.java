import java.util.Scanner;

public class secondproject{
    public static void main(String[] args){
        double a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        a=input.nextDouble();
        System.out.println("Enter second number");
        b=input.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println(c);
        input.close();
    }
}