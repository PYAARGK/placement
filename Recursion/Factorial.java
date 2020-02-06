import java.util.Scanner;
class Main
{
public static void main(String args[])
    {
        Scanner aa=new Scanner(System.in);
       int n=aa.nextInt();
      System.out.println("The factorial of "+ n+" is " +fact(n));
}
  public static int fact(int m)
  {
  if(m==1)
  {
  return 1;
  }
    else
    {
    return m*fact(m-1);
    }

  }
}
  
