import java.util.Scanner;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      int p=power(base,exp);
      System.out.println("The value of " + base + " power "+ exp +" is " +p);

    }
  static int power(int base, int exp)
  {
    if(exp!=0)
      return (base*power(base,exp-1));
             else
              return 1;
              }

}
