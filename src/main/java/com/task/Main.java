package com.task;



import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        SayHellow sayHellow = new SayHellow();
        if (args.length==0){
            System.out.println("Нет аргуметов");
        }
        else if (args.length==1){
            sayHellow.getHello(args[0], sayHellow.getZone(args[0]));
        }
        else if (args.length==2){
            sayHellow.getHello(args[0],args[1] );
        }
        String os = System.getProperty("os.name").toLowerCase();


    }



}
