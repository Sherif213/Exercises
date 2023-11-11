import java.util.ArrayList;

public class FourthProject {
    public static void main(String[] args){
        ArrayList<String> food=new ArrayList<String>();
        food.add("Pizza");
        food.add("Hotdog");

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
