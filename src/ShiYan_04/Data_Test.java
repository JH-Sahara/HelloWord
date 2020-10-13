package ShiYan_04;

class Data{
    int year;
    int month;
    int day;
    public Data(int year)
    {
        this.year = year;
    }
    public Data(int year,int month)
    {
        this.year = year;
        this.month = month;
    }
    public Data(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String getData()
    {
        return "year:"+year+"\t"+"month:"+month+"\t"+"day:"+day;
    }
}
public class Data_Test {
    public static void main(String[ ] args){
        Data data1 = new Data(2016);
        Data data2 = new Data(2016,10);
        Data data3 = new Data(2016,10,1);
        System.out.println(data1.getData());
        System.out.println(data2.getData());
        System.out.println(data3.getData());
    }
}
