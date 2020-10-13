package Three_Test;

class Person{
    private String name;
    private int age;
    public Person(String str,int age)
    {
        name = str;
        this.age = age;
    }
    public void display()
    {
        System.out.println("姓名："+name+" "+"年龄："+age);
    }
}
public class Three_03 {
    public static void main(String[ ] args){
        Person per1 = new Person("jianghan",18);
        per1.display();

        Person per2 = new Person("lingdang",17);
        per2.display();
    }
}
