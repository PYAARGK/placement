import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[][]=new int[n][n];
      int b[]=new int[n];
      int c[]=new int[n];
      int sum=0,sum1=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          sum=sum+a[i][j];
        }
        b[i]=sum;
        sum=0;
      }

      for(int j=0;j<n;j++)
      {
        for(int i=0;i<n;i++)
        {
          sum=sum+a[i][j];
        }
        c[j]=sum;
        sum=0;
      }
      int h=n-1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i==j)
          {
            sum=sum+a[i][j];
          }
          if(j==h)
          {
            sum1=sum1+a[i][j];

          }
        }
          h--;
      }
                      int count=0,count1=0;
                      for(int i=0;i<n-1;i++)
                      {
                        if(b[i]==b[i+1])
                        {
                            count=b[i];
                        }
                         if(c[i]==c[i+1])
                         {
                            count1=c[i];
                         }
                      }
            if(count==count1&&sum==sum1&&count==sum&&count==sum1&&count1==sum&&count1==sum1)
            {
               System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
}


}
