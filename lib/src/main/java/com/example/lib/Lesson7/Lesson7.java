package com.example.lib.Lesson7;

public class Lesson7 {

//    static IRepository iRepository; // Со
    public static void main(String[] args){
//        iRepository = new RepositoryImpl();
//        iRepository.login("user name", "12345678");

        Shop shop = Shop.OPEN;
        System.out.println("Shop is closed");
        System.out.println("ssqsq");
        System.out.println("sqsqs111");
    }
}
enum Shop{
    OPEN,
    CLOSE
}