import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sathish=new Scanner(System.in);
      	int z=sathish.nextInt();
        int y=sathish.nextInt();
      int a[][]=new int[z][y];
      for(int i=0;i<z;i++){
        for(int j=0;j<y;j++){
        a[i][j]=sathish.nextInt();
        }}
      int max=a[0][0];
      for(int i=0;i<z;i++){
        for(int j=0;j<y;j++){
         if(max < a[i][j])
            {
                 max = a[i][j];
            }
        }}
      System.out.print(max);


	}
}
