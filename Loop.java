import java.util.ArrayList;
import java.util.HashMap;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hussam");
        String firstName = names.get(0);

        // Customer for cup
        Cup cup = new Cup();

        cup.setLiquidType("lemon");

        System.out.println(cup.getAmount());
    }
}
