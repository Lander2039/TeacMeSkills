package com.example.lib.Lesson11;

public class Lesson11_1 {

    public static void main(String[] args) {
//        Так до лямбд
//        Operationable operationable = new Operationable() {
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
        // Лямда
        Operationable operationable;
        operationable = (a, b) -> a + b+30;
        int result = operationable.calculate(10, 10);
        System.out.println(result);

// Predicate
        Operationable2<Integer> operationable2;
        operationable2 = (a, b) -> a > b;
        boolean result2 = operationable2.calculate2(10, 20);
        System.out.println(result2);
        // Function
        Operationable3<Integer, String> operationable3;
        operationable3 = (a, b) -> {
            return a + b + " I will be back";
        };
        String result3 = operationable3.calculate3(10, 20);
        System.out.println(result3);
        // Consumer
        Operationable4<Integer> operationable4;
        operationable4 = (a, b) -> System.out.println(a+b);
        operationable4.calculate4(10,20);
    }
}
// Это ссообщает компилятору что наш интерфейс будет использован для лямбды
@FunctionalInterface
interface Operationable {
    int calculate(int a, int b);
}
// Predicate
interface Operationable2<T>{
    boolean calculate2(T t, T t1);

}
// Function
interface  Operationable3<T, R>{
    R calculate3(T t, T t1);
}
//Consumer он ничего не возвращает
interface Operationable4<T> {
    void calculate4(T t, T t1);
}