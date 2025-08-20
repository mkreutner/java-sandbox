public class TypeConvert {

    public static void main(String[] args)
    {
        // Implicit Cast
        System.out.println(">>> Implicit Cast <<<");

        byte fromByte = 12;
        int toInt = fromByte;

        System.out.println(String.format("fromByte = %s / toInt = %s", fromByte, toInt));

        float fromFloat = 3.14f;
        double toDouble = fromFloat;

        System.out.println(String.format("fromFloat = %s / toDouble = %s", fromFloat, toDouble));

        char fromChar = 'd';
        int toIntFromChar = fromChar;

        System.out.println(String.format("fromChar %s / toIntFromChar = %s", fromChar, toIntFromChar));

        // Explicit Cast
        System.out.println(">>> Implicit Cast <<<");

        int fromInt = 102;
        char toCharFromInt = (char) fromInt;

        System.out.println(String.format("fromInt %s / toCharFromInt = %s", fromInt, toCharFromInt));

    }
}
