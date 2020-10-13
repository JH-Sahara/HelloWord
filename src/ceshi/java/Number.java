package ceshi.java;
import java.util.Scanner;
public class Number {
    public static void main(String[ ] ages){
        int i = 1;
        for( i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 7 == 0)
                System.out.print(i+"\t");
        }
    System.out.println();
        i = 1;
        while (i <= 100){
            if(i % 3 == 0 && i % 7 == 0)
                System.out.print(i+"\t");
        i++;
        }
        System.out.println();
        i = 1;
        do{
            if(i % 3 == 0 && i % 7 == 0)
                System.out.print(i+"\t");
            i++;
        }while (i <= 100);
        System.out.println();
    }
}
