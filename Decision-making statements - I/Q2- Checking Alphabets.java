import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sathish=new Scanner(System.in);
      char a=sathish.next().charAt(0);
      int b=(int)a;
      if (a>64 && a<91 || a>96 && a<123)
      {
        if(a==65 ||a==69 ||a==73 ||a==81 ||a==85 ||a==97 ||a==101 ||a==105 ||a==111 ||a==117 )
        {
          System.out.println("Vowel");
        }
        else
        {
        System.out.println("Consonant");
        }
      }
      else
      {
        System.out.println("Not an alphabet");
      }
    }
}
