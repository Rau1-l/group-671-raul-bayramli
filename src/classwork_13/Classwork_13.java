package classwork_13;

import java.util.Scanner;

public class Classwork_13 {
	public static void main(String[] args) {
		System.out.println("-------------------------1------------------------");
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Write 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);

			if (b == 0) {
				System.out.println("You cant decide by zero");
			} else {
				System.out.println("You can !");
			}
		}

		System.out.println("------------------2-------------------");
		System.out.println("Write number with six simvols !");
	
		Object sr;
		int number = sr.Int();
		
		String[] number1 = sr.split("");
		System.out.println(number1[0]);
		
		
	}

}
