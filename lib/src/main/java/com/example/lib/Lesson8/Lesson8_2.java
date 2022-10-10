package com.example.lib.Lesson8;

public class Lesson8_2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try {
            shop.setAge(12);
        } catch (CantSellToChildException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println(shop.getAge()); // Выводим то что положили в getAge
        }
    }
}

class Shop {
    private int age;

    public int getAge() { // принимаем возраст
        return age;
    }

    public void setAge(int age) throws CantSellToChildException { // принимаем ошибку
        if (age < 18) {
            throw new CantSellToChildException("you are a child, can't sell vodka");
        } else {
            this.age = age;
            System.out.println("alcohol sold");
        }
    }
}

class CantSellToChildException extends Exception { // кастомная ошибка
    private String message; // никто не должен получить доступ

    CantSellToChildException(String message) { // создаем конструктор
        this.message = message;
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
