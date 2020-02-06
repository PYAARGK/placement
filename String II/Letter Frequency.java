import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     int k=0;
        String str, str1;
        char c, ch;
        Scanner scan = new Scanner(System.in);
          str=scan.nextLine();
          int i=str.length();
        for(c='a'; c<='z'; c++)
        {
            k=0;
            for(int j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println(c+""+k);
            }
        }
   }
}
