import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
      Scanner input = new Scanner(System.in);
      int m = input.nextInt();
      int n = input.nextInt();
      int a[][] = new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j]= input.nextInt();
        }
      }



      for(int i=0;i<m;i++)
      {
        int max = 0;
        for(int j=0;j<n;j++)
        {
        if(a[i][j]>max)
        {
          max= a[i][j];
        }

        }
        System.out.println(max);
      }
}}
