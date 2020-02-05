import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int in=s.nextInt();
      int a=0,b=0,c=1,temp=0;
      System.out.print(a+" "+b+" "+c);
      for(int i=0;i<in-3;i++)
      {
        temp=a+b+c;
        System.out.print(" ");
        System.out.print(temp);
        a=b;
        b=c;
        c=temp;
      }
    }
}
