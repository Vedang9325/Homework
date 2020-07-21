public class constructor2
{
    double pi;
    double r;
    double area;
    constructor2()
    {
        pi=3.14;
        r=7.0;
    }
    void constructor2()
    {
        area=pi*r*r;
        System.out.println(area);
    }
    public static void main()
    {
        constructor2 obj= new constructor2();
    }
}