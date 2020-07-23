public class calculator
{
    int a; int b; char ch;
    void init(int a1, int b1, char ch1)
    {
        a=a1;
        b=b1;
        ch=ch1;
    }
    void calc()
    {
        if(ch=='+')
        System.out.println(a+b);
        else if(ch=='-')
        System.out.println(a-b);
        else if(ch=='*')
        System.out.println(a*b);
        else if(ch=='/')
        System.out.println(a/b);
        else
        System.out.println("invalid");
    }
    public static void main(int a1, int b1, char ch)
    {
        calculator obj= new calculator();
        obj.init(a1, b1, ch);
        obj.calc();
    }
}