import java.util.ArrayList;

public class Iterators {

    public static void main(String[] args)
    {
       // Tables
        int[] myTable01 = {1, 2, 8};
        int[] myTable02 = new int[10];

        myTable02[0] = 2;

        System.out.println(myTable02[0]);
        System.out.println(myTable02[5]);
        try
        {
            System.out.println(myTable02[42]);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        // Listes
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);
        integers.add(24);

        System.out.println(String.format("List size: %s", integers.size()));
        System.out.println(integers.get(0)); 
        System.out.println(integers.get(2)); 
        try 
        {
            System.out.println(integers.get(9));     
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }


    }
}
