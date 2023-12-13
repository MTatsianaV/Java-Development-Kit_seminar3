package org.example.homework;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair.getFirst());  // Выводит "Hello"
        System.out.println(pair.getSecond()); // Выводит 42
        System.out.println(pair.toString());  // Выводит "(Hello, 42)"
    }
}
