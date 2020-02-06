import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner aa=new Scanner(System.in);
    String a=aa.next();
		String c="";

      for(int i=a.length()-1;i>=0;i--)
		{
		   c+=a.charAt(i);

		}
      if(a.equals(c))
      {
      System.out.println("Palindrome");
      }
      else
      {
       System.out.println("Not a Palindrome");
      }
    }
}
