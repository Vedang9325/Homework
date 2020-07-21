public class avginteractive
{
    int sub1, sub2, sub3, calc1, ans;
    void init(int sub11, int sub22, int sub33)
    {
        sub1=sub11;
        sub2=sub22;
        sub3=sub33;
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