import java.util.ArrayList;

public class ForLoop {

    public static void main(String[] args)
    {

        // Clasic form
        for (int counter = 0; counter < 10; counter++) 
        {
            // Do the job
            System.out.println(String.format("Counter: %02d", counter));
        }

        // Browse a collection
        var fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Strawberry");
        fruits.add("Banana");

        for (String f : fruits) 
        {
            System.out.println(String.format("Fruit  : %s", f.toUpperCase()));
        }

    }

}
