import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner aa=new Scanner(System.in);
        String a=aa.next();
        int c=0;
      for(int i=0;i<=a.length()-1;i++)
      {
      if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
      {
      c++;
      }
      }
      System.out.print(c);


	}
}
