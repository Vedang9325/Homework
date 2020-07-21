public class time
{
    int hr1, min1, sec1, conhr, conmin, consec;
    void accept(int hr, int min,int sec)
    {
        hr1=hr;
        min1=min;
        sec1=sec;
    }
    void convert()
    {
        conhr=hr1*60*60;
        conmin=min1*60;
        consec=sec1;
    }
    void Result()
    {
        System.out.println("The conversion of hours to seconds is" +conhr);
        System.out.println("The conversion of minutes to seconds is" +conmin);
        System.out.println("The conversion of seconds to seconds is" +consec);
    }
}