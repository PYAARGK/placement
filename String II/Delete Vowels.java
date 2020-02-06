import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
      String a =in.nextLine();
      a=a.replaceAll("[AaEeIiOoUu]", "");
      System.out.println(a);
    }
}
