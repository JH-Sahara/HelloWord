package ShiYan_03;

import java.lang.Math;
class Point{
    int x;
    int y;
    int z;
    public Point( )
    {
        x = 0;
        y = 0;
        z = 0;
    }
    public Point(int x0,int y0,int z0)
    {
        x = x0;
        y = y0;
        z = z0;
    }
    public double getDistance()
    {
        double sum = x*x + y*y + z*z;
        double distance = Math.pow(sum,0.5);
        return distance;
    }
}
public class Point_Test {
    public static void main(String[ ] args){
        Point po = new Point(1,1,1);
        double dis = po.getDistance();
        System.out.println("点("+po.x+","+po.y+","+po.z+")到原点的距离为"+dis);
    }
}
