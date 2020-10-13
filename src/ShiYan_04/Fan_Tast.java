package ShiYan_04;

class Fan{
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed = SLOW;
    private boolean no = false;
    private double radius = 5;
    String color = "blue";

    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean getNo()
    {
        return no;
    }
    public void setNo(boolean no)
    {
        this.no = no;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public Fan()
    {

    }

    public String toString(Fan fan)
    {
        if(fan.getNo() == true)
            return "风扇的速度为"+fan.getSpeed()+",颜色为"+fan.getColor()+",半径为"+fan.getRadius();
        else
            return "fan is off"+",颜色为"+fan.getColor()+",半径为"+fan.getRadius();

    }

}
public class Fan_Tast {
    public static void main(String[ ] args)
    {
        Fan fan1 = new Fan();
        fan1.setNo(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setNo(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        String str;
        str = fan1.toString(fan1);
        System.out.println(str);
        str = fan2.toString(fan2);
        System.out.println(str);

    }
}
