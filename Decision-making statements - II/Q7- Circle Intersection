import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
      int y1=sc.nextInt();
      int r1=sc.nextInt();
      int x2=sc.nextInt();
      int y2=sc.nextInt();
      int r2=sc.nextInt();
      int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        int radSumSq = (r1 + r2) * (r1 + r2);
        if (distSq == radSumSq)
        {
           System.out.print ("Tangential" );
   }
      else if(distSq > radSumSq)
      {
           System.out.print ( "Do not overlap");
      }
      else
      {
          System.out.print ( "Overlap");
      }
}
}
