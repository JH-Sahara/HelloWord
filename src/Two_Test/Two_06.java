package Two_Test;
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 6.求 1！+2!+3!+...+20!的和。
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Two_06 {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int sum = 1, s = 0;
        for(i=n; i>0; i--)
        {
            for(j=n,sum=1; j>0; j--)
            {
                sum *= j;
            }
            s +=sum;
            n--;
        }
        System.out.println(s);
    }
}
