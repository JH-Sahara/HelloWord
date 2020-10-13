package ceshi.java;
import java.util.Scanner;
public class Runnian {
    public static void main(String[ ] ages){
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
            System.out.println("Y");
        else System.out.println("N");
    }
}
