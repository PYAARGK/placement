 import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in =new Scanner(System.in);
      int a=in.nextInt();
      float b=in.nextFloat();
      int c=in.nextInt();
      switch(a)
      {
         
          case 12:
           float d=(b*c);
          float j=2*(b/100)*20;
          d=d+j;
          System.out.printf("%.2f",d);
          break;
          case 5 :
           float z=(b*c)+(b/100)*20;
          System.out.printf("%.2f",z);
          break;
          case 6:
           float y=(b*c)+(b/100)*20;
          System.out.printf("%.2f",y);
          break;
          case 11:
           float x=(b*c)+(b/100)*20;
          System.out.printf("%.2f",x);
          break;
          case 4 :
           float h=(b*c)+(b/100)*20;
          System.out.printf("%.2f",h);
          break;
        default:
         System.out.printf("Invalid Input");
      }
    }
}
