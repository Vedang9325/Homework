public class circleinteractive
{
    double r1, pi1, ans;
    void init(double r, double pi)
    {
        r1=r;
        pi1=pi;
    }
    void calc()
    {
        ans=pi1*r1*r1;
    }
    void display()
    {
        System.out.println(ans);
    }
}