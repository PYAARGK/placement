import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sathish=new Scanner(System.in);
      String a=sathish.next();
      for (int i=0;i<a.length();i++){
        if(a.charAt(i)>='A' && a.charAt(i)<='z'){
        System.out.print((char)(a.charAt(i)+32));
        }
      }
	}
}
