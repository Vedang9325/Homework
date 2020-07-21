class interestobjcrt
{
    double p1,r1,t1, ans;
    void init(double p, double r, double t)
    {
        p1=p;
        r1=r;
        t1=t;
    }
    void calc()
    {
        ans=p1*r1*t1/100;
    }
    void display()
    {
        System.out.println(" The answer is" +ans);
    }
    public static void main()
    {
        interestobjcrt obj= new interestobjcrt();
        obj.init(2000.0,5.0,2.5);
        obj.calc();
        obj.display();
    }
}