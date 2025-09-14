import java.util.Scanner;

public class IfElseIfElse {

    public static void main(String[] args)
    {
        // Start program
        System.out.println(">>> If, else if, else instrictions <<<");

        var condition = true;
        if (condition == true) 
        {
            System.out.println("Hello I");
        }

        condition = false;
        if (condition == true)
        {
            System.out.println("Hello II");
        }

        var userInput = new Scanner(System.in);

        System.out.println("How old are you?");
        var age = userInput.nextInt();

        if (age >= 18)
        {
            System.out.println("You are adult.");
        }
        else
        {
            System.out.println("You are minor.");
        }

    }
}
