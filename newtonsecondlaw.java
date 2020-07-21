public class newtonsecondlaw
{
    int u1, t1, a1, s;
    void init(int u, int t, int a)
    {
        u1=u;
        t1=t;
        a1=a;
    }
    void displacement()
    {
        s=u1*t1+1/2*a1*t1*t1;
    }
    void result()
    {
        System.out.println("The displacement is"+s);
    }
    public static void main()
    {
        newtonsecondlaw obj= new newtonsecondlaw();
        obj.init(20,20,10);
        obj.displacement();
        obj.result();
    }
}