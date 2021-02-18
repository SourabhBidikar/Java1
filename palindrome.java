package helloWorld;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int n,rem,rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		n=sc.nextInt();
		int temp=n;
		
		while(temp>0)
		{
		
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		
		if(n==rev)
		{
			System.out.println(n+" is a palindrome.");
		}
		else 
		{
			System.out.println(n+" is not a palindrome.");	
		}
		
		

	}

}
