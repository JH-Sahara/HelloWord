package Two_Test;
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 猜数字游戏：一个类 A 有一个成员变量 v，有一个初值 100。定义一个类，对 A 类的成员变量 v 进行猜。如果大了则提示大了，小了则提示小了。等于则
//           提示猜测成功。
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Random;
import java.util.Scanner;
class A{
    int v = 100;
    public int getRand()
    {
        Random rand = new Random();
        v = rand.nextInt(101);
        return v;
    }
}
class Guess{
    A a = new A();
    public void getA()
    {
        a.v = a.getRand();//变量在方法中才可以被调用
    }
    public String getGuess(int n)
    {
       // System.out.println(a.v);
        if(n == a.v)
            return "猜对啦！";
        else if(n > a.v)
            return "猜大啦！";
        else
            return "猜小啦！";
    }
}
public class Two_02 {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();
        String str;
        while (true)
        {
            int n = sc.nextInt();
            str = guess.getGuess(n);
            System.out.println(str);
            if(str.equals("猜对啦！"))
                break;
        }

    }
}
