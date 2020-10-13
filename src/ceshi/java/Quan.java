package ceshi.java;

public class Quan {
    //定义全局变量
    int z1 ;
    boolean x;
    public static void main (String args[ ])
    {
        int z1 = 111 ;
        System.out.println("测试数据z = " + z1) ;
        Quan m = new Quan();
        System.out.println("全局z = " + z1) ;
        System.out.println("全局n = " + m.x) ;



    }

}
