package com.mkdevs.dyma;

/**
 * Functional Programming with Java
 */
public class App {

    public static void introduction() {
        System.out.println("Functional Programming with Java!");
        System.out.println("Let's play with mathematical functions!");
        System.out.println("==================================");
        System.out.println();
    }

    public static void playWithLists() {
        var towns = java.util.List.of("Paris", "London", "New York", "Tokyo", "Berlin");
        var townsInUpperCase = towns
            .stream()
            .map(v -> v.toUpperCase())
            .collect(java.util.stream.Collectors.toList());
        System.out.println("Original: " + towns);
        System.out.println("Uppercase: " + townsInUpperCase);
    }

    public static void playWithFunctinalInterfacesAndLambdas() {
        MyLoggerCallback.log(
            (message) -> System.out.println(">>> " + message)
        );
    }
    
    @FunctionalInterface
    interface LoggerCallback {
        void log(String message);
    }

    static class MyLoggerCallback {
        static void log(LoggerCallback loggerCallback) {
            System.out.print("[" + MyLoggerCallback.class.getName() + "] - ");
            loggerCallback.log("John Doe is dead...");
        }
    }

    public static void playWithStreamAPI() {
        var towns = java.util.List.of("Paris", "London", "New York", "Tokyo", "Berlin");
        long countWithO = towns.stream()
            .filter(town -> town.contains("o") || town.contains("O"))
            .count();
        System.out.println("Number of towns containing 'o' or 'O': " + countWithO);

        var sortedTowns = towns.stream()
            .sorted()
            .collect(java.util.stream.Collectors.toList());
        System.out.println("Sorted towns: " + sortedTowns);

        var townLengths = towns.stream()
            .map(String::length)
            .collect(java.util.stream.Collectors.toList());
        System.out.println("Town name lengths: " + townLengths);
    }

    public static void playWithStreamAPI_IntermediateMethods() {
        var towns = java.util.List.of("Paris", "London", "New York", "Tokyo", "Berlin", "Oslo", "Warsaw");
        var processedTowns = towns.stream()
            .filter(town -> town.contains("o") || town.contains("O"))
            .sorted()
            .map(String::toUpperCase)
            .collect(java.util.stream.Collectors.toList());
        var processedTowns2 = towns.stream()
            .map(String::toUpperCase)
            .filter(town -> town.contains("O"))
            .sorted()
            .collect(java.util.stream.Collectors.toList());
        var integerList = java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var squaredIntegers = integerList.stream()
            .map(n -> n % 2 == 0 ? n * n : n)
            .collect(java.util.stream.Collectors.toList());
        var integerList2 = java.util.List.of(1, 1, 42, 11, 12, 12, 42, 73, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var squaredIntegers2 = integerList2.stream()
            .distinct()
            .map(n -> n % 2 == 0 ? n * n : n)
            .sorted((e1, e2) -> e2 - e1)
            .collect(java.util.stream.Collectors.toList());

        System.out.println("Processed towns   : " + processedTowns);
        System.out.println("Processed towns 2 : " + processedTowns2);
        System.out.println("Squared integers  : " + squaredIntegers);
        System.out.println("Squared integers 2: " + squaredIntegers2);
    }

    public static void playWithStreamAPI_TerminalMethods() {
        var towns = java.util.List.of("Paris", "London", "New York", "Tokyo", "Berlin");
        var townsInUpperCase = towns.stream()
            .map(String::toUpperCase)
            .filter(town -> town.contains("O"))
            .collect(java.util.stream.Collectors.toList());
        var integerList = java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var reducedList = integerList.stream()
            .reduce((a, b) -> b % 2 == 0 ? a + b : a);
        var reducedListWithOptional = integerList.stream()
            .reduce(0, (a, b) -> b % 2 == 0 ? a + b : a);
        var maxValue = integerList.stream()
            .reduce(Integer::max);
        var minValue = integerList.stream()
            .reduce(Integer::min);

        System.out.println("Towns in upper case                 : " + townsInUpperCase);
        System.out.println("Sum of even integers                : " + reducedList);
        System.out.println("Sum of even integers (with identity): " + reducedListWithOptional);
        System.out.println("Max value                           : " + maxValue);
        System.out.println("Min value                           : " + minValue);
    }

    public static void main(String[] args) {
        introduction();
        // playWithLists();
        // playWithFunctinalInterfacesAndLambdas();
        // playWithStreamAPI();
        // playWithStreamAPI_IntermediateMethods();
        playWithStreamAPI_TerminalMethods();
    }

}
