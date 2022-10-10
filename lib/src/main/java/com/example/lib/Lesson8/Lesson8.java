package com.example.lib.Lesson8;

public class Lesson8 {

    public static void main(String[] args) {
        try {
            getWrongValue(5);
        } catch (ArithmeticException e) { // Можно просто Exception, если мы не знаем какая ошибка
            System.out.println("caught ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("caught NullPointerException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("caught IndexOutOfBoundsException");
        } finally {
            System.out.println("do if success or exception thrown");
        }
    }

    static void getWrongValue(Integer value) {
        System.out.println(value.toString());
    }
}
