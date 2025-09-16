package com.mkdevs.dyma;

/**
 * Hello world!
 */
public class App {

    public static void mainBasicMathFunc() {
        // Basic math functions
        byte b1 = 10;
        long l1 = 200L;
        float f1 = 230.5f;
        double d1 = 123.4;

        var sum_byte = b1 + 42;
        var sum_long = l1 + 42;
        var sum_float = f1 + 42;
        var sum_double = d1 + 42;

        System.out.println("Sum byte: " + sum_byte);
        System.out.println("Sum long: " + sum_long);
        System.out.println("Sum float: " + sum_float);
        System.out.println("Sum double: " + sum_double);
    }

    public static void mainLangMathFunc() {

        var floattingVar = 20.3;

        System.out.println(Math.sin(Math.toRadians(floattingVar)));

        var integer1 = 20;
        var integer2 = 100;

        System.out.println(Math.min(integer1, integer2));
        System.out.println(Math.max(integer1, integer2));

        System.out.println(Math.round(floattingVar));
        System.out.println(Math.rint(floattingVar));
        System.out.println(Math.floor(floattingVar));
        System.out.println(Math.ceil(floattingVar));

        System.out.println(Math.pow(integer1, 3));
        System.out.println(Math.sqrt(256));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(1000));
        System.out.println(Math.log1p(10));
        System.out.println(Math.exp(3));
        System.out.println(Math.expm1(3));
        System.out.println(Math.copySign(3.5, -1.2));
        System.out.println(Math.getExponent(3.5));
        System.out.println(Math.nextAfter(3.5, 4.0));
        System.out.println(Math.nextUp(3.5));
        System.out.println(Math.ulp(3.5));
    }

    public static void mainBigIntegerFunc() {
        var bigInt1 = new java.math.BigInteger("123456789012345678901234567890");
        var bigInt2 = new java.math.BigInteger("987654321098765432109876543210");

        System.out.println("Big Integer 1: " + bigInt1);
        System.out.println("Big Integer 2: " + bigInt2);

        System.out.println("Sum: " + bigInt1.add(bigInt2));
        System.out.println("Difference: " + bigInt1.subtract(bigInt2));
        System.out.println("Product: " + bigInt1.multiply(bigInt2));
        System.out.println("Quotient: " + bigInt1.divide(bigInt2));
        System.out.println("Remainder: " + bigInt1.remainder(bigInt2));
        System.out.println("GCD: " + bigInt1.gcd(bigInt2));
        System.out.println("Power: " + bigInt1.pow(2));
        System.out.println("Modular Exponentiation: " + bigInt1.modPow(new java.math.BigInteger("2"), new java.math.BigInteger("1000")));
        //System.out.println("Modular Inverse: " + bigInt1.modInverse(new java.math.BigInteger("1000")));
        System.out.println("Is Probable Prime: " + bigInt1.isProbablePrime(100));
        System.out.println("Next Probable Prime: " + bigInt1.nextProbablePrime());
        System.out.println("Bit Length: " + bigInt1.bitLength());
        System.out.println("Lowest Set Bit: " + bigInt1.getLowestSetBit());
        System.out.println("Highest Set Bit: " + bigInt1.bitCount());
        System.out.println("To Byte Array: " + java.util.Arrays.toString(bigInt1.toByteArray()));
    }

    public static void main(String[] args) {
        // mainBasicMathFunc();
        // mainLangMathFunc();
        mainBigIntegerFunc();
    }
}
