import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int in=s.nextInt();
      int fact=1,tr=0;
      for(int i=1;i<in;i++)
      {
        fact=fact*i;
        if(fact==in)
          tr=1;
      }
      if(tr==1)
        System.out.print("Yes");
        else
          System.out.print("No");
      }
}
