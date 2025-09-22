package com.mkdevs.dyma;

import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {

    public static void welcome() {
        System.out.println("Welcome to the Java RegExp Tutorial!");
        System.out.println("=======================================");
        System.out.println("In this tutorial, we will explore the basics of Regular Expressions (RegExp) in Java.");
        System.out.println("RegExp is a powerful tool for pattern matching and text manipulation.");
    }

    public static void simpleSearch() {

        var searchWorld = "world";
        var text = "Hello, world! Welcome to the world of Java RegExp.";
        var result = text.indexOf(searchWorld);

        if (result != -1) {
            System.out.println("The word '" + searchWorld + "' was found at index: " + result);
        } else {
            System.out.println("The word '" + searchWorld + "' was not found.");
        }
    }

    public static void regexBasics() {
        Pattern pattern = Pattern.compile("^Hello", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        var text = "Hello, world! Welcome to the world of Java RegExp.\nHello again!\nhEllo!";
        var matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group() + " at index " + matcher.start());
        }
    }

    public static void regexAdvanced() {
        Pattern pattern = Pattern.compile("world|Java", Pattern.CASE_INSENSITIVE);
        var text = "Hello, world!\nWelcome to the world of Java RegExp.\nHello again!\nhEllo!";
        var matcher = pattern.matcher(text);
    
        // Check if the pattern matches at the beginning of the text
        System.out.println(matcher.lookingAt());
        // Check if the entire text matches the pattern
        while (matcher.find()) {
            System.out.println(matcher.group() + " starts at index " + matcher.start() + " and ends at index " + matcher.end());
        }

        // Replace a world
        var modifiedText = matcher.replaceAll("XXXXXX");
        System.out.println(modifiedText);

        // Progresive replacement
        StringBuffer sb = new StringBuffer();
        matcher.reset(); // Reset matcher to start from the beginning
        int replacementCounter = 1;
        while (matcher.find()) {
            matcher.appendReplacement(sb, "XXXXXX");
            System.out.println("--- " + replacementCounter++ + " ---");
            System.out.println(sb.toString());
        }
        matcher.appendTail(sb); // add rest of the text into the string buffer
        System.out.println("Progressive replacement final result:");
        System.out.println(sb.toString());
    }

    
    public static void main(String[] args) {
        welcome();
        simpleSearch();
        regexBasics();  
        regexAdvanced();
    }
}
