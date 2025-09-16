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

    public static void main(String[] args) {
        introduction();
        playWithLists();
        playWithFunctinalInterfacesAndLambdas();
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
}
