public class tempconvert
{
    double temp;
    tempconvert()
    {
        temp=80;
    }
    tempconvert(double t)
    {
        temp=t;
    }
    double convert2celcius()
    {
        double cel=(5.0/9.0)*(temp-32);
        return cel;
    }
    public double getTemp()
    {
        return temp;
    }
    public static void main()
    {
        tempconvert dTemp= new tempconvert();
        System.out.println("Other temperaure in farenheit is"+dTemp.getTemp());
        System.out.println("Other temperature in celcius is" +dTemp.convert2celcius());
    }
}