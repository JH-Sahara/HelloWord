package Three_Test;

class Person_0311{
    private long id;
    private String name;
    public Person_0311(long id,String name)
    {
        this.id = id;
        this.name = name;
    }
}
class Studen extends Person_0311{
    private String school;
    public Studen(long id, String name,String school) {
        super(id, name);
        this.school = school;
    }
}
public class PersonTest {
    public static void main(String[ ] args){
        Studen studen = new Studen(20192321L,"jianghan","北方民族大学");
    }
}
