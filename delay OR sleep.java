package sample;

import java.util.Date;
import java.util.Scanner;

    /*
    this Algorithm will make delay or sleep to your program without Thread
    that's mean you can do any action while sleep method work
     */

public class Controller {
    public static void main(String[] args) throws InterruptedException {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Time to delay with loop");
        int delay=in.nextInt();
        sleep2(delay);

    }

   static void sleep2(int dela){
        Date date = new Date();
        int x;
        x = date.getSeconds();
        int i=x+dela;
        while (true) {              //optional if you don't want loop become while(smth<1)

            while (x!=i){
                date=new Date();
                x = date.getSeconds();
            }
            System.out.println(x);     //   <---- Action here
            if (i+dela>60){
                i+=dela;
                i-=60;
            }
            else
                i+=dela;
        }
    }

}
