import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sathish = new Scanner(System.in);
      int m = sathish.nextInt();
      int n = sathish.nextInt();
      int a[][] = new int[m][n];
      int sum =0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j] = sathish.nextInt();
          sum = sum+a[i][j];
        }
      }
      System.out.println(sum);

    }
}
