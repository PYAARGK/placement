import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner sathish=new Scanner(System.in);
      int n=sathish.nextInt();
      int a=11;
      for(int i=0;i<n;i++){
      System.out.print((int)Math.pow(a,2)+" ");
       a +=4;
      }
	}
}
