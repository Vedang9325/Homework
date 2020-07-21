class addingoverloading
{
    void prnadd(int i, int j)
    {
        System.out.println("The answer is" +i+j);
    }
    void prnadd(float i, float j)
    {
        System.out.println("The answer is" +i+j);
    }
    public static void main()
    {
        addingoverloading obj =new addingoverloading();
        obj.prnadd(2,3);
        obj.prnadd(4.0f,3.0f);
    }
}