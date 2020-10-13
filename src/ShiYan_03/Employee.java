package ShiYan_03;

public class Employee {
    public String name;
    public int age;
    public int workage;
    public Employee()
    {
        name = null;
        age = 1;
        workage = 0;
    }
    public Employee(String str)
    {
        name = str;
        age = 1;
        workage = 0;
    }
    public Employee(String str,int x,int y)
    {
        name = str;
        age = x;
        workage = y;
    }
    public static void main(String[ ] args){
        Employee em1 = new Employee();
        System.out.println(em1.name+"\t"+em1.age+"\t"+em1.workage);

        Employee em2 = new Employee("zhangshan");
        System.out.println(em2.name+"\t"+em2.age+"\t"+em2.workage);

        Employee em3 = new Employee("jianghan",18,12);
        System.out.println(em3.name+"\t"+em3.age+"\t"+em3.workage);
    }
}
