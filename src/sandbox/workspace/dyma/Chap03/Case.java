import java.util.Scanner;

public class Case {

    public static void main(String[] args)
    {
        var userInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        var number = userInput.nextInt();

        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            default:
                System.out.println("Invalide / Out of range");
                break;
        }
    }
}
