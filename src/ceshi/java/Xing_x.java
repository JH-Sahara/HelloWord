package ceshi.java;

public class Xing_x {
    public static void main(String[ ] ages){
        int i;
        int j;
        int k;
        for(i = 0; i < 4 ; i++ ){
            for(j = 0; j < 4 - i ; j++){
                System.out.print(" ");
            }
            for(k = 0; k < 2*i+1; k++)
                System.out.print("*");
            System.out.println( );
        }
        for(i = 0; i < 7 - 1 ; i++ ){
            for(j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for(k = 0; k < (-2)*i+2*4+1; k++)
                System.out.print("*");
            System.out.println( );
        }
    }
}
