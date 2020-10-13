package ShiYan_04;

class Compare{
    public void getMax(int x,int y)
    {
        if(x>y)
            System.out.println("max number is "+x);
        else if(y>x)
            System.out.println("max number is "+y);
        else
            System.out.println("两个数相等！");
    }
    public void getMax(int x,int y,int z)
    {
        if(x>y && x>z)
            System.out.println("max number is "+x);
        else if(y>x && y>z)
            System.out.println("max number is "+y);
        else if(z>x && z>y)
            System.out.println("max number is "+z);
        else
            System.out.println("三个数相等！");
    }
}
public class Compare_Test {
    public static void main(String[ ] args){
        Compare co = new Compare();
        co.getMax(3,4);
        co.getMax(10,4);
        co.getMax(10,10);

        co.getMax(3,4,5);
        co.getMax(3,3,3);
    }
}
