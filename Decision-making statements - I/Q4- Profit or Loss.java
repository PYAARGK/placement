import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sathish=new Scanner(System.in);
      float a=sathish.nextFloat();
       float b=sathish.nextFloat();
      float c=b*12.00f;
      float d;
      if (a==c)
      {
        System.out.println("No profit nor loss");
      }
      else if(a>c){
        d=a-c;
        System.out.printf("Loss : Rs.%.2f",d);
      }
     else if (a<c)
        {
          d=c-a;
        System.out.printf("Profit : Rs.%2f",d);
        }}
}
