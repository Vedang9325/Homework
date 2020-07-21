public class overloadnum
{
    void num_calc(int num, char ch)
    {
        if(ch=='s')
        {
            System.out.println(num*num);
        }
        else
        {
            System.out.println(num*num*num);
        }
    }
    void num_calc(int a, int b, char ch)
    {
        if(ch=='p')
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
    public static void main()
    {
        overloadnum obj= new overloadnum();
        obj.num_calc(5,'s');
        obj.num_calc(3,2,'p');
    }
}