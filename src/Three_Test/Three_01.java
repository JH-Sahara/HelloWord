package Three_Test;

// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 编写程序。创建一个圆类，成员域有半径，提供计算圆面积的方法。在main方法中创建圆类的对象，并调用计算圆面积的方法。
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Circle{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        double area = radius*radius*Math.PI;
        return area;
    }
}
public class Three_01 {
    public static void main(String[ ] args){
        Circle ci = new Circle(10);
        double area = ci.getRadius();
        System.out.println(area);
    }
}
