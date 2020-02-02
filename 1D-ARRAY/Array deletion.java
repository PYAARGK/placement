import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sathish=new Scanner(System.in);
    int n=sathish.nextInt();
    int a[]=new int[n];
       for(int i=0; i<n; i++)
       {
           a[i] = sathish.nextInt();
       }
    int d=sathish.nextInt();
    System.out.println("Array after deletion is");
    for (int i=0;i<n;i++){
      if(a[i]==d){continue;}
      else
      {
        System.out.println(a[i]);
      }
    }
  }
}
