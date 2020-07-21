public class interestnoninteractive
{
    double p, r, t, ans;
    void init()
    {
        p=2000.0;
        r=3.5;
        t=2.0;
    }
    void calc()
    {
        ans=p*r*t/100;
    }
    void display()
    {
        System.out.println(ans);
    }
}