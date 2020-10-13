package ceshi.java;

class Circle{
    int r = 2;
    double area;

    public double getArea() {
        double area = 3.14*r*r;
        return area;
    }
}
class Student{
    public void getStudent(Circle a){
        double d = a.getArea();
        System.out.println(d);
    }
}
public class Circle_Test {
    public static void main(String[ ] args){
        Circle ci = new Circle();
        System.out.println(ci.area);

        Student st = new Student();
        st.getStudent(ci);
        System.out.println(ci.area);
    }
}
