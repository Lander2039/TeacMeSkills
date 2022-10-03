package com.example.lib;

public class InterfaceConstant implements IAutorization {

    public static void main(String[] args){
        InterfaceConstant interfaceConstant = new InterfaceConstant();
        interfaceConstant.login(false);
    }

    public void login(boolean isUserLoggedIn){
        if (userIsLoggedIn){ // if принимает boolean  ждет true
            System.out.println("user is logged in");
        }
        if (!userIsNotLoggedIn){
            System.out.println("user is not logged in");
        }
    }
}

interface IAutorization {

    boolean userIsNotLoggedIn = false; // это константа, нельзя менять
    boolean userIsLoggedIn = true; // это константа, нельзя менять
    void login(boolean isUserLoggedIn);
}