package ceshi.java;
import java.util.PrimitiveIterator;
import java.util.Scanner;
public class Bulk {
    public static double PI = 3.14;
   // public final double PI = 3.14;
    public static void main(String[ ] args){
        Scanner x = new Scanner(System.in);
        System.out.println("请输入圆柱体的半径：");
        double r = x.nextDouble();
        System.out.println("请输入圆柱体的高：");
        double h = x.nextDouble();
        double area = r * r * PI;
        double bulk = area * h;
        System.out.println("体积为"+bulk);

    }
}
