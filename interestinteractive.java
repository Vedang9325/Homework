public class interestinteractive
{
    double p1, r1, t1, ans;
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
        System.out.println(ans);
    }
    }