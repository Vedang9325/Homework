public class marks
{
double term1;
double term2;
double finals;
double calct1;
double calct2;
double calcfinal;
double finalper;
percalc()
  {
     term1=412;
     term2=423;
     finals=430;
  }
void percalc()
  {
    calct1=30/100*412;
    calct2=30/100*423;
    calcfinal=40/100*430;
    finalper=calct1+calct2+calcfinal/500*100;
    System.out.println(“weighted percentage is”+finalper);
  }
public static void main()
   {
     percalc obj= new percalc();
   }
}
