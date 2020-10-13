package ShiYan_03;

public class StaticMethodTest {
    public static String getString(){
        return "这个是类（静态）方法";
    }
    public String printString(){
        return "这个是实例方法！";
    }
    public static void main(String[ ] args){
        System.out.println(getString());
        //System.out.println(printString());

        StaticMethodTest st = new StaticMethodTest();
        String str = st.printString();
        System.out.println(str);
    }
}
