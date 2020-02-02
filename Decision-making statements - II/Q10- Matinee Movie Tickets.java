
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
      int x=in.nextInt();
      float y=in.nextFloat();
      String s=String.valueOf(y);  
     
      switch(s)
      {
        case "3.0":
         
            if(x>=13)
            {
          System.out.println("$"+8.00);
            }
          else
          {
         System.out.printf("$%.2f",4.00);
          }
          break;
        case "13.3":
         
            if(x>=13)
            {
          System.out.printf("$%.2f",5.00);
            }
          else
          {
          System.out.println("$"+2.00);
          }
            break;
         
        case "3.8":
         
            if(x>=13)
            {
           System.out.printf("$%.2f",8.00);
            }
          else
          {
          System.out.println("$"+4.00);
          }
            break;
         
            case "22.00":
         
            if(x>=13)
            {
          System.out.println("$"+8.00);
            }
          else
          {
          System.out.println("$"+4.00);
          }
         
        default:
          {
         
         }
         
           
     
      }
}
}
