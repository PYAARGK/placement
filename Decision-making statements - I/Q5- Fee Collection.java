import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner gp = new Scanner(System.in);
      String a = gp.next();
      float b = gp.nextInt();
      float c = gp.nextInt();
      float d = gp.nextInt();
      float e=0,f=0;
      if(a.equals("MSDS"))
      {
        System.out.printf("%.2f",b+c);
      }
      else if(a.equals("MSH"))
      {
        System.out.printf("%.2f",b+d);
      }
      else if(a.equals("MGSDS"))
        {
          e = b/50;
          f = b+d;
          System.out.printf("%.2f",f);
        }
        else if(a.equals("MGSH"))
        {
          float g=f+d;
         
System.out.printf("%.2f",g);
        }
      else
      {
        System.out.println("Invalid");
      }
       
      }
}
