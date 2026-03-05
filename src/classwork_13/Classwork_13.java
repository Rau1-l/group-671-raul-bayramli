package classwork_13;

import java.util.Scanner;

public class Classwork_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Write 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a *b);

			if(b==0)
			{
			System.out.println("You cant decide by zero");
		}else
			{
				System.out.println("You can !");
			}
	}

}
