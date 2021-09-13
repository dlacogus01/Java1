import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<Integer> intNum = new ArrayList<>();
        
        intNum.add(100); intNum.add(300);
        intNum.add(200); intNum.add(400);
        
        System.out.println(intNum);
        // add() method
        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add("Red");

        // set() method
        colors.set(0, "Blue");

        System.out.println(colors);
    }
}