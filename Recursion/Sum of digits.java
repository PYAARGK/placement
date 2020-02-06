import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=sod(n);
      System.out.println("The sum of digits in "+ n+" is "+ a);
    }
  static int sod(int n)
  {
    if(n==0)
      return 0;
    else
      return ((n%10)+sod(n/10));
  }
}
