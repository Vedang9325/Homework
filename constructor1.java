public class constructor1
{
    double principal;
    double time;
    double rate;
    double si;
    constructor1()
    {
       principal=5000;
       time=2.5;
       rate=5;
    }
    void constructor1()
    {
        si= principal*time*rate/100;
        System.out.println(si);
    }
    public static void main()
    {
        constructor1 obj= new constructor1();
    }
}