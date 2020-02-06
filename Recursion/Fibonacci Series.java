import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      int c=fib(a);
      System.out.println("The term "+ a+ " in the fibonacci series is "+ c);
    }
 static int fib(int n)
  {
  if (n==0 && n==1)
return 1;
   else
     return n-2;
 }
}
