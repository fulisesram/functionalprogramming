package com.example;

import com.example.functional.MyFunctionalInterface;

public class Tux implements MyFunctionalInterface {

    @Override
    public String doSomething(String param) {
        return "Hola soy Tux y recibi: " +  param;
    }

}
