package main.java;

import java.util.Scanner;

public class Main {
     static int ID=001;
    public static void main(String[] args) {

        Runnable student1= new UnderGraduates("UAMAN" );
        Runnable postGR= new PostGraduates("Khalis");
        Thread thread1= new Thread(postGR);

        Thread t= new Thread(student1);
        t.start();
        thread1.start();

    }
}
