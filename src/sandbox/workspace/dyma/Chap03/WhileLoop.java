import java.util.ArrayList;

public class WhileLoop {

    public static void main(String[] args)
    {
        // While
        int counter = 0;
        while (counter < 10) 
        {
            // Do the job
            System.out.println(String.format("Counter: %02d", counter));
            counter++;
        }

        // Do-While
        counter = 0;
        do 
        {
            // Do the job
            System.out.println(String.format("Counter: %02d", counter));
            counter++;
        } 
        while (counter < 10);

    }
}
