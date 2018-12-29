package org.shzhong.basic.lamda;

public class Demo2 {

    private final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }
}
