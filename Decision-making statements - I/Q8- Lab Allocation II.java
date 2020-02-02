import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sathish=new Scanner(System.in);
      int a=sathish.nextInt();
      int b=sathish.nextInt();
      int c=sathish.nextInt();
      char d=sathish.next().charAt(1);
      int e=(int)d;
     switch(d)
      {
case '1':
          if(b<c){
            System.out.println("L2");
            break;}
          else{
            System.out.println("L3");
            break;}
case '2':
          if(a<c){
            System.out.println("L1");
            break;}
          else{
            System.out.println("L3");
            break;}
case '3':
          if(b<a){
            System.out.println("L2");
            break;}
          else{
            System.out.println("L1");
            break;}
      }
    }
}
