import java.util.Scanner;
class Main
{
    static int sum(int a[],int n)
    {
      if(n<0)
      {
        return 0;
      }
      else
      {
        if(a[n]%2==0)
        {
          return a[n]+sum(a,n-1);
      }
        else
        {
          return sum(a,n-1);
        }
    }  }
    public static void main(String args[])
    {
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      int a[]=new int[20];
      for(int i=0;i<n;i++)
      {
        a[i]=ob.nextInt();
      }
      System.out.println("Sum of even numbers "+sum(a,n));
    }
}
