public class ParamsAndArgs {

    public static void main(String[] args) 
    {
       System.out.println("Chapter 04 - Introduction to functions."); 
       System.out.println("23 - Parameters ans arguments.");
       var result = addition(12, 7);
       System.out.println(result);
       System.out.println(concat("Table", "box"));
       System.out.println(concat("Little", "Thumb", "sows", "white", "pebbles", "to", "be able to", "find", "his", "way"));
    }

    /**
     * Sums two integers given in paramater and returns the resultat 
     * @param a First integer to add
     * @param b Second intger to add
     * @return int as result sum of parameters
     */
    private static int addition(int a, int b) 
    {
        return a + b;
    }

    private static String concat(String a, String b, String ... extra)
    {
        var result = String.format("%s %s", a, b);
        for (String str : extra) {
            result = concat(result, str);
        }
        return result;
    }

}
