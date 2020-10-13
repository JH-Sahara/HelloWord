package Three_Test;

abstract class Animal{
    protected String name;
    public abstract void shout();
}
public class Dog extends Animal {
    public Dog(String name)
    {
        this.name = name;
    }
    public void shout()
    {
        System.out.println("汪汪汪！");
    }
    public static void main(String[ ] args){
        Dog dog = new Dog("xiaobai");
        dog.shout();
    }
}
