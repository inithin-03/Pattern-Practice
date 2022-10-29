package Patterns;
import java.util.*;

public class Main {
	
	static void pattern1(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Number Series
	static void pattern4(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
  
	}
  
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Pattern : 1");
		pattern1(n);
		System.out.println("Pattern : 2");
		pattern2(n);
		System.out.println("Pattern : 3");
		pattern3(n);
		System.out.println("Pattern : 4);
		pattern4(n);	   
		in.close();
	}
}
