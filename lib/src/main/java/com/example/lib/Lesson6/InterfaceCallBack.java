package com.example.lib.Lesson6;

public class InterfaceCallBack {

    public static void main(String[] args){
        //
        Button button = new Button(new LoginClickListener()); // мы не можем добавить объект интерфейс только через создания экземпляра класса
        button.buttonClicked(); // нажимаем кнопку
    }
}
class LoginClickListener implements IAuthorization1{
    @Override
    public void sendLoginRequest() {
        System.out.println("Login request was send to server...");
    }
}

interface IAuthorization1 { // интерфейс
    void sendLoginRequest();
}
class Button{
    IAuthorization1 iAuthorization1; // конструктор принимает интерфейс, создаем переменую

    public Button(IAuthorization1 action){

        this.iAuthorization1 = action; //
    }
    void buttonClicked(){ //метод
        iAuthorization1.sendLoginRequest();// вызываем интерфейс и отправляем на сервер
    }
}