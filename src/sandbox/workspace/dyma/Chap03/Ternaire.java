import java.util.Scanner;

public class Ternaire {

    public static void main(String[] args)
    {
        var userInput = new Scanner(System.in);

        System.out.println("Enter an age:");
        var age = userInput.nextInt();

        System.out.println(String.format("You are %s", 
            age >= 18 ? "Adult" : "Minor"
        ));
    }

}
