import java.util.Scanner;
class RowSorts
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
		  System.out.print("enter no. of rows");
			int r= sc.nextInt();
		  System.out.print("enter no. of cols");
			int c= sc.nextInt();
			int a[][]=new int[r][c];
			for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			{
				System.out.print("enter element" +(i+1)+","+(j+1)+ ":");
				int [i][j]=sc.nextInt();
			}
			for(k=0;k<r;k++)
			 {
			 for(i=0;i<c-1;i++)
			  {
			  for(j=0;j<c;j++)
			     {
				int t=a[k][i];
				a[k][i]=a[k][j];
				a[k][j]=t;
			     }
 			  }
			 }
			 System.out.print("output");
			for(i=0;i<r;i++)
			{
			  for(j=0;j<c;j++)
			   {
				System.out.print(a[i][j]+"\t");
				System.out.println();
      		    }
			}
	    }
}	
				
							