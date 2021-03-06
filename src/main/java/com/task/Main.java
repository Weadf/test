package com.task;

import java.io.IOException;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        SayHellow sayHellow;
        if (args.length == 0) {
            System.out.println("There are no arguments.");
        } else if (args.length == 1) {
            sayHellow = new SayHellow(args[0]);
            sayHellow.printHello();
        } else if (args.length == 2) {
            sayHellow = new SayHellow(args[0], args[1]);
            sayHellow.printHello();
        }

    }
}