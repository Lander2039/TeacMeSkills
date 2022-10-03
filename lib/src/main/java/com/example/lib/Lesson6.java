package com.example.lib;

//pretend inheritance
//public class Lesson6 extends Bird {
//
//    @Override
//    void fly() {
//        super.fly();
//    }
//
//    @Override
//    void walk() {
//        super.walk();
//    }
//}
//class Bird {
//    final void fly(){
//    }
//    void walk(){
//    }
//}
public class Lesson6 implements IAuth{
    static boolean isUserLoggedIN = false;

    public static void main(String[] args){
        Lesson6 lesson6 = new Lesson6();
        if (!isUserLoggedIN) lesson6.login();
    }
    @Override
    public void login() {
        isUserLoggedIN = true;
        System.out.println("user logged in");
    }

    @Override
    public void logout() {
        isUserLoggedIN = false;
        System.out.println("user logged in");
    }
}
interface IAuth{
    void login();
    void logout();
}
