public class TypeConvert {

    public static void main(String[] args)
    {
        // Implicit Cast
        System.out.println("");
        System.out.println(">>> Implicit Cast <<<");

        byte fromByte = 12;
        int toInt = fromByte;

        System.out.println(String.format("fromByte = %s / toInt = %s", fromByte, toInt));

        float fromFloat = 3.14f;
        double toDouble = fromFloat;

        System.out.println(String.format("fromFloat = %s / toDouble = %s", fromFloat, toDouble));

        char fromChar = 'd';
        int toIntFromChar = fromChar;

        System.out.println(String.format("fromChar = %s / toIntFromChar = %s", fromChar, toIntFromChar));

        // Explicit Cast
        System.out.println("");
        System.out.println(">>> Explicit Cast <<<");

        int fromInt = 102;
        char toCharFromInt = (char) fromInt;

        System.out.println(String.format("fromInt = %s / toCharFromInt = %s", fromInt, toCharFromInt));

        System.out.println("");
        System.out.println(">>> Loose data caused by Cast <<<");

        float fromFloat2 = 12.5f;
        int toIntFromFloat2 = (int) fromFloat2;

        System.out.println(String.format("fromFloat2 = %s / toIntFromFloat2 = %s", fromFloat2, toIntFromFloat2));

    }
}
