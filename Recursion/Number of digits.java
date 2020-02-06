import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int d=nod(n);
      System.out.println("The number of digits in "+ n+" is "+ d);
    }
  static int nod(int n)
  {
    if((n/10)==0)
      return 1;
    else
      return 1+nod(n/10);
  }
}
