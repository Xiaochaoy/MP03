package UF5.exceptions;

import java.util.Scanner;

public class MainExampleExceptions {
    public static void main(String[] args) {

    }


    public static void exampleExceptions() {
        try {
            System.out.println("This is the try block");
            throw new MyException("This is the exception");
        } catch (MyException e) {
            System.out.println("This is the catch block");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is the finally block");
        }
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
