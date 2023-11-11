import java.util.ArrayList;
public class FifthProject {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> menu = new ArrayList<ArrayList<String>>();
        ArrayList<String> food=new ArrayList<String>();
        food.add("Pizza");
        food.add("Hotdog");
        menu.add(food);
        System.out.println(menu.get(0));
        for(String i:food){
            calculate(i);
        }
        int x=3,y=4;
        System.out.println(add(x,y,5));
        
    }
    public static void calculate(String name){
        System.out.println("The string is: "+name);
    }
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
} 
