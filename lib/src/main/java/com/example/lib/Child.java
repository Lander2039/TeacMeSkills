package com.example.lib;

public class Child extends Parent {
    public int age = 12;

    void speak(){
        super.speak();
        System.out.println("I speak Loudly");
        //super.speak();
    }
    public static void main(String[] args){
        Parent child = new Child();
        Parent parent = new Parent();
        child.eye_color = "green";
        System.out.println("eye color of the child is:" +child.eye_color);
        System.out.println("eye color of the parent is:" +parent.eye_color);
        child.speak();
        //parent.speak();
    }
    void phoneNumber(int number){

    }
    void phoneNumber(int number, String mobile_operator){

    }

}
class Parent {
    protected String eye_color = "Blue";
    void speak(){
        System.out.println("I speak quietly");
    }
}
class Uncle {
    public static void main(String[] args){
        Parent parent = new Parent();
        Parent child = new Child();
        System.out.println(parent.eye_color);

    }
}