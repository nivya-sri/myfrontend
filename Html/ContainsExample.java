import java.io.*;
class ContainsExample
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter name=");
			String name=t.readLine();
			System.out.println(name.contains("do you know"));
			System.out.println(name.contains("about"));
			System.out.println(name.contains("hello"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}