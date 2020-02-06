import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      for(int i=1;i<=a;i++)
      {
        if(i%2==0)
        {
          int b=i*i;
          System.out.print(b-2+" ");
        }
        else
        {
          int b=i*i;
          System.out.print(b-1+" ");
        }
}
    }
}
