import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int in=s.nextInt();
      int c=0;
      System.out.println(in);
      while(in!=1)
      {
        if(in%2==0)
        {
          in=in/2;
          System.out.println(in);
        }
        else
        {
          in=(in*3)+1;
          System.out.println(in);
        }
        c++;
      }
    System.out.print(c);
    }

}
