public class avgnoninteractive
{
    int sub1, sub2, sub3, calc1, ans;
    void init()
    {
        sub1=96;
        sub2=92;
        sub3=99;
    }
    void calc()
    {
        calc1=sub1+sub2+sub3;
        ans=calc1/3;
    }
    void display()
    {
        System.out.println(ans);
    }
}