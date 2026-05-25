package sample;
import java.util.Scanner;

public class TakingInputs {

	public static void main(String[] args) {


		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a, b values ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("a value ="+a+"  b  value ="+b);
		
		
		//if else
		if(a>b)
		{
			System.out.println("a is Big");
		}
		else if(b>a)
		{
			System.out.println("b is Big");
		}
		else
		{
			System.out.println("both are equals");
		}
		
		
		
		
	}

}
