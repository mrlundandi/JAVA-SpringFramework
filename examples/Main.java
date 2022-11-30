package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService notificationService = (UserService) context.getBean("notificationService");
        System.out.println(notificationService);


    }
}

//Crear la clase NotificationService, con un método que imprima un saludo.
//Crear una clase UserService que tenga un atributo de clase NotificationService.
//Utilizar la anotación @Component en cada clase.
//Habilitar el escaneo de clases en el archivo beans.xml
//Desde el método main, probar a obtener el bean UserService y ejecutar el método imprimirSaludo
// que tiene asociado el atributo de tipo NotificationService. De forma similar a la realizada en clase.