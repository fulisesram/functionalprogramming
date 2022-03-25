package com.example;

import com.example.functional.MyFunctionalInterface;

public class App {

    //OOP  - Clase que implementa una interfaz
    public static void doSomethingTraditional(){
        var instanciaTux = new Tux();
        String imprimir = instanciaTux.doSomething("Parametro Tradicional");
        System.out.println(imprimir);
    }

    //CLASE ANONIMA
    public static void doSomethingAnonymousClass(){
        MyFunctionalInterface duke = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "Hola soy Duke y recibi: " + param ;
            }
        };
        System.out.println(duke.doSomething("clase anonima"));
    }

    //FUNCION ANONIMA  -> FUNCION LAMBDA
    public static void doSomethingFunctionalLambda(){
        MyFunctionalInterface mona = (String param) -> {
            return "Hola soy Mona(Octocat) y recibi: " + param;
        };
        System.out.println(mona.doSomething("parametro funcional"));
    }

    public static void main(String[] args) {
        doSomethingTraditional();
        doSomethingAnonymousClass();
        doSomethingFunctionalLambda();
    }
}
