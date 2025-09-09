package sandbox.workspace.dyma.Chap05;

import sandbox.workspace.dyma.Chap05.Fruit;
import sandbox.workspace.dyma.Chap05.Color;
import sandbox.workspace.dyma.Chap05.Origin;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Strawberries", Color.RED, Origin.FRA);
        Fruit fruit2 = new Fruit("Apples");
        Fruit banana = new Banana(Origin.BEL)
            .setName("Big Banana");

        System.out.println(fruit.toString());
        System.out.println(fruit2.toString());

        System.out.println(fruit.isFrench());
        System.out.println(fruit2.isFrench());

        System.out.println(fruit.getName());
        fruit.setName("Cherries");
        System.out.println(fruit.getName());
        System.out.println(fruit.toString());

        System.out.println(banana.toString());
        
    }
}
