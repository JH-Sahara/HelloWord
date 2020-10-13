package ShiYan_03;

class PointXY{
    int x;
    int y;
    public PointXY()
    {
        x = 0;
        y = 0;
    }
}
class Circle{
    public static double PI = 3.14;
    PointXY xy = new PointXY();
    int r;
    public Circle(int x,int y,int r0)
    {
        xy.x = x;
        xy.y = y;
        r = r0;
    }
    public int getX()
    {
        return xy.x;
    }
    public int getY()
    {
        return xy.y;
    }
    public double areaxy()
    {
        double area = PI*r*r;
        return area;
    }
}
public class Circle_Test {
    public static void main(String[ ] args){
        Circle ci = new Circle(0,0,5);
        System.out.println("圆的的圆心坐标为("+ci.getX()+","+ci.getY()+")");
        double area = ci.areaxy();
        System.out.println("面积为"+area);
    }
}
