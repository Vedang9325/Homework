public class largest
{
    int a, b, c;
    void init(int a1, int b1, int c1)
    {
        a=a1;
        b=b1;
        c=c1;
    }
    void calc()
    {
        if(a>b && a>c)
        System.out.println(a+ "is the largest number");
        else if(b>a && b>c)
        System.out.println(b+"is the largest number");
        else
        System.out.println(c+"is the largest number");
    }
    public static void main(int a1, int b1, int c1)
    {
        largest obj= new largest();
        obj.init(a1, b1, c1);
        obj.calc();
    }
}