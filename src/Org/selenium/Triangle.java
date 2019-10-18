package Org.selenium;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int p=sc.nextInt();
		int c=0;
		for(int i=2;i<p/2;i++)
		{
			if(p%2==0)
			{
				 c=1;
			}
		}
		if(c==0)
		{
			System.out.println("Its prime number");
		}
		else
		{
			System.out.println("Its not prime number");
		}
		}
}
