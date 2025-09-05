import java.util.ArrayList;

public class BreakAndContinue {

    public static void main(String[] args)
    {
        // Datasource
        var fruits = new ArrayList<String>();

        fruits.add("Apples");
        fruits.add("Pears");
        fruits.add("Strawberries");
        fruits.add("Nashis");

        for (String f : fruits) {
            if (f == "Apples") {
                // jump to next iteration
                continue;
            }
            if (f == "Strawberries") {
                // exit loop'
                break;
            }
            System.out.println(String.format(">>> Eat %s, they're good for yout health!", f.toLowerCase()));
        }

    }
}
