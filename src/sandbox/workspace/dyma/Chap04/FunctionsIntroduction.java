public class FunctionsIntroduction {

    public static void main(String[] args) 
    {
       System.out.println("Chapter 04 - Introduction to functions."); 
       firstFunction();
       System.out.println(secondFunction(144));
       for (String arg : args) { 
            System.out.println(arg);
       }
    }

    public static void firstFunction() 
    {
        System.out.println("In firstFunction");
    }

    public static String secondFunction(int integer)
    {
        return String.format("In secondFunction with parameter, integer: %d", integer);
    }
}
