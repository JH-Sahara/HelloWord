package ShiYan_04;

class Person{
    private String name;
    private int age;
    public Person(String str,int age)
    {
        name = str;
        this.age = age;
    }
    public String display()
    {
        return "姓名："+name+"\t"+"年龄："+age;
    }
}
public class Person_Test {
    public static void main(String[ ] args)
    {
        Person per = new Person("张三",18);
        System.out.println(per.display());
    }
}
