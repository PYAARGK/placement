import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
      int x=in.nextInt();
      float y=in.nextFloat();
      int i=0;
      if(x==1)
      {
      System.out.printf("%.2f",y);
      }
      else if(x<=2)
      {
       i=(x/100)*50;
        System.out.printf("%.2f",y+i);
      }
      else if(x==3)
      {
       System.out.printf("%.2f",y+y);
      }
      else
      {
      System.out.println("Number of items is more");
      }
}
}
