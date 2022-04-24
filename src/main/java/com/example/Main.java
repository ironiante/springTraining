package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calculadora  = (CalculatorService) context.getBean("calculatorService");                             //getBeans -->nos dara un objeto, le indicamos el nombre
                                                      // pasame un objeto de la clase calculatorservice

        String texto =calculadora.holaMundo();
        System.out.println(texto);
    }
}
