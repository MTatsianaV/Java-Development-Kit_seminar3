package org.example.homework;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
// sum(), multiply(), divide(), subtract(). Параметры этих методов – два
// числа разного типа, над которыми должна быть произведена операция.
public class Calculator {

    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T num1, U num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T num1, U num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T num1, U num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int intNum1 = 5;
        double doubleNum2 = 2.5;

        System.out.println("Sum: " + sum(intNum1, doubleNum2));
        System.out.println("Multiply: " + multiply(intNum1, doubleNum2));
        System.out.println("Divide: " + divide(intNum1, doubleNum2));
        System.out.println("Subtract: " + subtract(intNum1, doubleNum2));
    }
}
