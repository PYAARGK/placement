import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int in=s.nextInt();
      int temp=0,c=0,te=0;
      while(in>0)
      {
        temp=in%10;
        c++;
        in=in/10;
       if(c==2)
       {
         te=temp;
       }
      }
       if(c==3)
        {
          if(te%3==0)
            System.out.print("Trendy Number");
        }
      else
           System.out.print("Not a Trendy Number");
}
}
