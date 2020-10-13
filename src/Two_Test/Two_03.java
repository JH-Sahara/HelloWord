package Two_Test;
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 输入一批正整数(以零或负数为结束标志)，求其中的奇数之和。
//例：8 7 4 3 70 5 6 101 -1
//输出：116
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Two_03 {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        int x,sum = 0;
        while (true)
        {
            x = sc.nextInt();
            if(x%2 == 1)
                sum += x;
            if(x <= 0)
                break;
        }
        System.out.println(sum);
    }
}
