import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner aa=new Scanner(System.in);
        int a=aa.nextInt();
        int b=(a*2)-1;
      for(int i=1;i<=a;i++)
      {
      for(int j=1;j<=b;j++)
      {
      System.out.print(j+" ");

      }
        System.out.println();
        b=b-2;

      }
	}
}
