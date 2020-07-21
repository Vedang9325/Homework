class rectanglearea
{
    double l1,b1,ans;
    void init()
    {
        l1=10;
        b1=20;
    }
    void calc()
    {
        ans=l1*b1;
    }
    void display()
    {
        System.out.println("The answer is" +ans);
    }
    public static void main()
    {
        rectanglearea obj= new rectanglearea();
        obj.init();
        obj.calc();
        obj.display();
    }
}