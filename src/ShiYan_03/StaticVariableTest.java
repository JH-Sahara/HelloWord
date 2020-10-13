package ShiYan_03;
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 简介：静态变量属于类，所以也叫类变量，只要程序一运行就会分配空间，这样我们就可以直接使用它了
//      实例变量属于某个对象的属性，所以必须创建实例对象后方可分配空间，这时我们就可以使用了
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class StaticVariableTest {
    public static int staticVar = 18;
    public int fieldVar = 20;
    public static void main(String[ ] args){
        ++staticVar;
        System.out.println(staticVar);
      //System.out.println(fieldVar);
        StaticVariableTest st = new StaticVariableTest();
        System.out.println(st.fieldVar);
    }
}
