import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[][]=new int[20][20];
      int sum=0;int i,j;
     for(i=0;i<n;i++)
     {
      for(j=0;j<n;j++)
      {
       a[i][j]=ob.nextInt();
      }
     }
      for(i=0;i<n;i++)
     {
      for(j=0;j<n;j++)
      {
       if(i!=j&&i>j)
       {
         sum=sum+a[i][j];
       }
      }
     }
      if(sum==0)
      {
        System.out.println("yes");
      }
      else
      {
       System.out.println("no");
      }
     
}
}

