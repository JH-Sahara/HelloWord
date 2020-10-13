package ceshi.java;
import java.util.Scanner;
import java.lang.Math;
public class lilv {
    public static double d = 0.0195;
    public static void main(String[ ] ages ){
        Scanner a = new Scanner(System.in);
        System.out.println("bengjing:");
        double x = a.nextDouble();
        System.out.println("nianfeng:");
        double n = a.nextDouble();
        double z = x * Math.pow(d + 1, n);
        System.out.println(z);

    }


}
