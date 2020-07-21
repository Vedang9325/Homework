public class circlenoninteractive
{
    double r, pi, ans;
    void init()
    {
        r=10.5;
        pi=3.14;
    }
    void calc()
    {
        ans=pi*r*r;
    }
    void display()
    {
        System.out.println(ans);
    }
}