public class Types {
    
    public static void main(String[] args)
    {
        // integers
        byte octet = 127;
        short littleBitLonger = 2314;
        int integer = 843215;
        long longInteger = 942185843295L;

        System.out.println(">>> Integers <<<");
        System.out.println(String.format("Octet              (byte): %s", octet));
        System.out.println(String.format("Little Bit Longer (short): %s", littleBitLonger));
        System.out.println(String.format("Integer             (int): %s", integer));
        System.out.println(String.format("Lon Integer (longInteger): %s", longInteger));

        // floats
        float smallFloat = 42.4f;
        double bigFloat = 8431.4325;
        System.out.println(">>> Floats <<<");
        System.out.println(String.format("Small float       (float): %s", smallFloat));
        System.out.println(String.format("Big float        (double): %s", bigFloat));

        // chars
        char oneChar = ';';
        System.out.println(">>> Chars <<<");
        System.out.println(String.format("A char             (char): %s", oneChar));

        // booleans
        boolean aBoolean = true;
        System.out.println(">>> Booleans <<<");
        System.out.println(String.format("A boolean       (boolean): %s", aBoolean));
        
        // strings
        String aString = "One upon a time...";
        System.out.println(">>> Strings <<<");
        System.out.println(String.format("A string         (String): %s", aString));

        // inference
        var first = true;
        var second = "Hello, world!";
        var third = 3.14f;
        System.out.println(">>> Inference <<<");
        System.out.println(String.format("first               (var): %s", first));
        System.out.println(String.format("second              (var): %s", second));
        System.out.println(String.format("third               (var): %s", third));


    }
}
