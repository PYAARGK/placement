import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner aa=new Scanner(System.in);
      int n=aa.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
      a[i]=aa.nextInt();
      }
      System.out.println("The sum of the elements in the array is "+sod(a,n));
    }
  static int sod(int a1[],int n)
  {
     if (n <= 0)
     {
            return 0;
     }
    {
        return (sod(a1, n - 1) + a1[n- 1]);
    }
  }
}
