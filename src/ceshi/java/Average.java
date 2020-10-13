package ceshi.java;
import java.util.Scanner;
public class Average {
    public static void main(String[ ]args){
        Scanner x = new Scanner(System.in);
        System.out.print("请输入三个数字：");
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        double sum = (a + b + c)/3;
        System.out.println("The three number average is "+sum);

    }
}
