package Three_Test;

class Number{
    private int n1;
    private int n2;
    public Number(int n1,int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int addition()
    {
        return n1+n2;
    }
    public int subtration()
    {
        return n1-n2;
    }
    public int multiplication()
    {
        return n1*n2;
    }
    public double division()
    {
        return (double)n1/n2;
        /*if(n1<0 || n2<0)
        {
            double division = Math.abs(n1)/Math.abs(n2);
            return -division;
        }
        else
            return n1/n2;*/
    }
}
public class NumberTest {
    public static void main(String[ ] args){
        Number number = new Number(-2,5);
        System.out.println(number.addition());
        System.out.println(number.subtration());
        System.out.println(number.multiplication());
        System.out.println(number.division());

    }
}
