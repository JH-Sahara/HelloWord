package ShiYan_03;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle()
    {
         width = 1;
         height = 1;
    }
    public Rectangle(double x,double y)
    {
        width = x;
        height = y;
    }
    public double getArea()
    {
        double area;
        area = width*height;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter;
        perimeter = 2*width+2*height;
        return perimeter;
    }
    public static void main(String[ ] args){
        Rectangle re1 = new Rectangle(4,40);
        double area1 = re1.getArea();
        double perimeter1 = re1.getPerimeter();
        System.out.println("矩形的长为"+re1.width+",宽为"+re1.height+",面积为"+area1+",周长为"+perimeter1);

        Rectangle re2 = new Rectangle();
        re2.height = 3.5;
        re2.width = 35.9;
        double area2 = re2.getArea();
        double perimeter2 = re2.getPerimeter();
        System.out.println("矩形的长为"+re2.width+",宽为"+re2.height+",面积为"+area2+",周长为"+perimeter2);
    }
}

