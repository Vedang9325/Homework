public class chariden
{
    char ch;
    void init(char ch1)
    {
        ch=ch1;
    }
    void identify()
    {
        if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
        System.out.println(" It is an alphabet");
        else if(ch>=48 && ch<=57)
        System.out.println("It is a number");
        else if(ch== ' ')
        System.out.println("It is a blank space");
        else
        System.out.println("Other character");
    }
    public static void main(char ch1)
    {
        chariden obj= new chariden();
        obj.init(ch1);
        obj.identify();
    }
}