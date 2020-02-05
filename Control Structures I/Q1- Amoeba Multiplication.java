import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int in=s.nextInt();
      int t=in;
      int a=0,b=1,temp=0;
      for(int i=0;i<in-2;i++)
      {
        temp=a+b;
        a=b;
        b=temp;
      }
      System.out.print(temp);
    }
}
