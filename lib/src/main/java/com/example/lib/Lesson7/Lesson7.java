package com.example.lib.Lesson7;

public class Lesson7 {

//    static IRepository iRepository; // Со
    public static void main(String[] args){
//        iRepository = new RepositoryImpl();
//        iRepository.login("user name", "12345678");

        Shop shop = Shop.CLOSE;
        System.out.println("Shop is closed");
    }
}
enum Shop{
    OPEN,
    CLOSE
}