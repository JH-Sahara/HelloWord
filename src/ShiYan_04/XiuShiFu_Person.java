package ShiYan_04;

class XSF_Person{
    public String personPubName = "public_JLCSS";
    protected String personProName = "protected_JLCSS";
    private String personPriName = "private_JLCSS";
    String personDefName = "default_JLCSS";
    public String getPersonPriName()
    {
        return personPriName;
    }

}
public class XiuShiFu_Person {
    public static void main(String[ ] args){
        XSF_Person person = new XSF_Person();
        System.out.println(person.personPubName);
        System.out.println(person.personProName);
       // System.out.println(person.personPriName);
        System.out.println(person.getPersonPriName());
        System.out.println(person.personDefName);

    }
}
