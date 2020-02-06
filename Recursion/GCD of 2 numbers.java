import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
      int n2=sc.nextInt();
     int gcd=gcd(n1,n2);
     System.out.println("G.C.D of "+n1+" and " +n2+" is "+gcd);
    }
  static int gcd(int n1,int n2)
  {

        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
  }
}
