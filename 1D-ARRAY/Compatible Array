import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int d=0;
    for(int i=0;i<n;i++)
    {
      a[i] = input.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      b[i] = input.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
       
        if(a[i]<b[j])
        {
          d=1;
          break;
        }
       
      }
    }
    if(d==1)
    {
      System.out.println("Incompatible");                
    }
    else
    {
      System.out.println("Compatible");
    }
  }
}
