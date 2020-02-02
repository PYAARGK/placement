 import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int column=in.nextInt();
      int tree=in.nextInt();
    int i=tree;
      if(i<=row)
           {
             System.out.println("yes");
           }
      else if((row*column)-row<tree)
      {
        System.out.println("yes");
      }
      else if((tree-1)%row==0)
      {
     System.out.println("yes");
      }
         
      else
      {
            System.out.println("No");
}
}
}
