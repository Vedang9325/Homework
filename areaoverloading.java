class areaoverloading
{
    void area(int a)
    {
        System.out.println("the area of square is" +a*a);
    }
    void area(int b, int c)
    {
        System.out.println("the area of rectangle is" +b*c);
    }
    void area(float d)
    {
        double value= d*d*3.14;
        System.out.println("the area of circle is" +value);
    }
    public static void main()
    {
        areaoverloading obj= new areaoverloading();
        obj.area(5);
        obj.area(3,4);
        obj.area(2f);
    }
}