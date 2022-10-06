package com.example.lib.Lesson7;

public class AnonymousClass {

    static IRepository iRepository = new IRepository() { // Анонимный класс
        @Override
        public void login(String userName, String password) {
            System.out.println("Hello");
        }
    };

    static Anonym anonym = new Anonym(){ //2 Переопределяем класс Аноним
        @Override
        void hackNetwork() {
            super.hackNetwork(); // Поведение родителя выведет когда есть супер
            System.out.println("child hacked the world"); //
        }
    };

    public static void main(String[] args){
        iRepository.login("user name", "password");
        anonym.hackNetwork(); // Вызываем метор хакер
    }
}
class Anonym { // 1 оздаем класс
    void hackNetwork(){
        System.out.println("I hacked the world");
    }
}
