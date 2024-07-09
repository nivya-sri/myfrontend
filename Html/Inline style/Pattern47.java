import java.io.*;
class Pattern47
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i=1,n,j,l,k=1,m;
			System.out.println("enter n=");
			n=Integer.parseInt(t.readLine());
			while(i<n)
			{
				l=1;
				m=1;
				while(l<m)
				{
					System.out.print(" ");
					l++;
				}
				j=1;
				while(j<=k)
				{
					if(j==1||j==i||j==n)
					{
						System.out.print("*"+" ");
					}
					else
					{
						System.out.print(" ");
					}
					j++;
				}
				k=k+1;
				i++;
				m++;
				System.out.println();
			}
			k=n;
			j=1;
			while(j<=k)
			{
				System.out.print("*");
				j++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);			
		}
	}
}
			