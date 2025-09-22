package com.mkdevs.dyma;

import main.java.com.mkdevs.dyma.ImmutableList;
import main.java.com.mkdevs.dyma.StaticGeneric;
import main.java.com.mkdevs.dyma.Adult;
import main.java.com.mkdevs.dyma.Child;
import main.java.com.mkdevs.dyma.Person;
import main.java.com.mkdevs.dyma.Model;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 * Chapter 14 - Introduction to Generics
 */
public class App {

    public static void introduction() {
        System.out.println("=========================================================");
        System.out.println("Chapter 14 - Introduction to Generics!");
        System.out.println("=========================================================");
        System.out.println(" Generics allow us to create classes, interfaces, and \nmethods with a placeholder for the type.");
        System.out.println(" This enables us to write more flexible and reusable code.");
        System.out.println(" For example, we can create a generic class that works \nwith any type of data.");
        System.out.println(" Generics also provide type safety, as they allow us to \ncatch type-related errors at compile time.");
        System.out.println(" Overall, generics are a powerful feature in Java that \nenhance code reusability and maintainability.");
        System.out.println(" Let's explore generics further in the following examples \nand exercises.");
        System.out.println("=========================================================");
        System.out.println("");
    }

    public static void genericMethodExample() {
        System.out.println("Remember, we can also use generics with methods!");
        System.out.println("=========================================================");
        var list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }

    public static void optionalClassExample() {
        System.out.println("The Optional class is a great example of generics in action!");
        System.out.println("=========================================================");
        var optional = java.util.Optional.of("Hello, Generics!");
        optional.ifPresent(System.out::println);
    }

    public static void firstGenericClassExample() {
        System.out.println("The first generic class is a immutable list class.");
        System.out.println("=========================================================");

        var immutableTowns = new ImmutableList<String>(
            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix"
        );
        immutableTowns.stream().forEach(System.out::println);

        System.out.println(StaticGeneric.staticMethodGeneric("Hello Generic Method!"));
    }

    public static void divingDeepIntoOptionals() {
        System.out.println("Diving deep into Optionals");
        System.out.println("=========================================================");
        var optional = java.util.Optional.of("Hello, Generics!");
        optional.ifPresent(System.out::println);

        List<Optional<String>> persons = List.of(Optional.of("John"), Optional.empty());
        var person1 = persons.get(1);

        // Vérifier la présence avec isPresent()
        if (person1.isPresent()) person1.get();

        // Utiliser orElse pour retourner une autre valeur si vide
        var maybePerson1 = person1.orElse(new String("empty person"));

        List<Optional<String>> persons2 = List.of(Optional.of("Doudou"), Optional.empty());

        var notEmptyPersons = persons2.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(notEmptyPersons); // Display [Doudou]
    }

    public static void inheritanceAndGenerics() {
        System.out.println("Inheritance and Generics");
        System.out.println("=========================================================");
        var persons3 = new ImmutableList<Person>(
                new Adult("John", 30),
                new Adult("Jane", 29),
                new Child("John JR", 12)
        );
        persons3.stream().forEach(person -> System.out.println(person.getName() + " is " + person.getAge() + " years old."));
    
    }
    
    public static void annotationsAndIntrospectionInGenerics() {
        System.out.println("Annotations and Introspectionin Generics example!");
        System.out.println("=========================================================");
        
        var personClass = Person.class;
        var modelAnnotation = Optional.ofNullable(personClass.getAnnotation(Model.class));
        modelAnnotation.ifPresentOrElse(annotation -> {
            System.out.println("Model Annotation:");
            System.out.println(" Value: " + annotation.value());
            System.out.println(" Author: " + annotation.author());
            System.out.println(" Date: " + annotation.date());
            System.out.println(" Version: " + annotation.version());
        }, () -> {
            System.out.println("No Model Annotation found.");
        });
        // System.out.println("Class: " + personClass.getSimpleName());
        // System.out.println("Package: " + personClass.getPackageName());
        // System.out.println("Declared Methods: " + Arrays.toString(personClass.getDeclaredMethods()));
        // System.out.println("Declared Fields: " + Arrays.toString(personClass.getDeclaredFields()));
        // System.out.println("Declared Constructors: " + Arrays.toString(personClass.getDeclaredConstructors()));
        System.out.println("");
    }

    public static void main(String[] args) {
        // introduction();
        // genericMethodExample();
        // optionalClassExample();
        // firstGenericClassExample();
        // divingDeepIntoOptionals();
        // inheritanceAndGenerics();
        annotationsAndIntrospectionInGenerics();
        
    }

}
