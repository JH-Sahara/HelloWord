package ceshi.java;

import java.util.Scanner;
public class Sn_s {
    public static void main(String[ ] ages){
        float a = 1, b = 2;
        float c;
        float sum = b/a;
        System.out.println("需要求出多少项之和：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n-1; i++){
            c = a + b;
            sum += c / b;
            a = b;
            b = c;
        }
        System.out.print("Sn = "+sum);
    }
}
