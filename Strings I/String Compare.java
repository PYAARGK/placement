import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sathish=new Scanner(System.in);
      String a=sathish.nextLine();
      String b=sathish.nextLine();
      int res=a.compareTo( b);
      if(res==0){System.out.print("Strings are same");}
      else{System.out.print("Strings are not same");}
	}
}
