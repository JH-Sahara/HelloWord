package ceshi.java;
import java.util.Scanner;
public class Switch {
    public static void main(String[ ] ages){
        System.out.println("请输入成绩等级：");
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        switch(s){
            case 'A':System.out.println("85~100");
                break;
            case 'B':System.out.println("70~84");
                break;
            case 'C':System.out.println("60~69");
                break;
            case 'D':System.out.println("<60");
                break;
        }
    }
}
