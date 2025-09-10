package sandbox.workspace.dyma.Chap05;

import sandbox.workspace.dyma.Chap05.Fruit;
import sandbox.workspace.dyma.Chap05.Vegetable;
import sandbox.workspace.dyma.Chap05.Color;
import sandbox.workspace.dyma.Chap05.Origin;
import sandbox.workspace.dyma.Chap05.Car;
import sandbox.workspace.dyma.Chap05.Crazy;

public class Main {

    private static void FruitsAndVegetables() {
        Fruit fruit = new Fruit("Strawberries", Color.RED, Origin.FRA);
        Fruit fruit2 = new Fruit("Strawberries", Color.RED, Origin.FRA);
        Fruit fruit3 = new Fruit("Strawberries", Color.RED, Origin.FRA);
        Fruit fruit4 = new Fruit("Apples");
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

        System.out.println(fruit2 == fruit3);
        System.out.println(fruit2.equals(fruit3));

        Vegetable veg01 = new Vegetable("Potato", "Brown", "Belgium");
        Vegetable veg02 = new Vegetable("Potato", "Brown", "Belgium");
        Vegetable veg03 = new Vegetable("Zucchini", "Green", "France");
        Vegetable veg04 = new Vegetable("Eggplant", "Dark Purple", "Italy");

        System.out.println(veg01.equals(veg02));
        System.out.println(veg03.color());
        System.out.println(veg04.hashCode());
        System.out.println(veg04.toString());
    }

    public static void DrivingSchool() {
        var car01 = new Car();

        car01.fullOfGaz();
    }

    public static void CrazyInternal() {
        var crazy = new Crazy();

        System.out.println(crazy.getInnerCrazy());

        crazy.displayWithCallback(new Callback() {
            // Anonymous class
            @Override
            public void execute() {
                System.out.println("Dynamic callback from anonymous Class");
            }
        });
    }
    
    public static void main(String[] args) {

        // Fruits And Vegetables
        // FruitsAndVegetables();

        // Playing with vehicules
        // DrivingSchool();

        // Crazy Internal
        CrazyInternal();
    }
}
