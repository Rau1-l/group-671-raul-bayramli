package classwork_10;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число !");
		int number = scanner.nextInt();

		if (number == 0) {
			System.out.println("Ноль");
		} else {
			System.out.println("Это не ноль!");
			if (number % 2 == 0) {
				System.out.println("Число четное !");
			} else {
				System.out.println("Число нечетное !");
			}

			System.out.println("--------2--------");

			System.out.println("Введите оценку (0-100) !");
			int bal = scanner.nextInt();
			if (bal <= 0) {
				System.out.println("Некорректный !");
			} else if (bal >= 90) {
				System.out.println("Отлично !");
			} else if (bal >= 75) {
				System.out.println("Хорошо !");
			} else if (bal >= 60) {
				System.out.println("Удовлитворительный !");
			} else {
				System.out.println("Неудволитворительное !");
			}

			System.out.println("-------------3-------------");

			System.out.println("Ввидите сторону А");
			double a = scanner.nextDouble();
			System.out.println("Введите сторону B");
			double b = scanner.nextDouble();
			System.out.println("Введите сторону С");
			double c = scanner.nextDouble();
			if (a + b <= c || a + c <= b || b + c <= a) {
				System.out.println("Треугольник не существует !");
			} else {
				System.out.println("Треугольник существует !");
			}

			System.out.println("------------4------------");

			System.out.println("Введите число !");
			int sum1 = scanner.nextInt();
			if (sum1 >= 5000) {
				System.out.println("Скидка 15%");
			} else if (sum1 >= 2000) {
				System.out.println("Скидка 10%");
			} else if (sum1 >= 100) {
				System.out.println("Скидка 5%");
			} else {
				System.out.println("Нет скидки !");
			}

			System.out.println("-------------------5---------------------");

			System.out.println("Выведите высоту (3-20) !");
			int h = scanner.nextInt();

			System.out.println("Вывидите ширину (3-20) !");
			int w = scanner.nextInt();

			System.out.println("----------------7----------------");

			System.out.println("введите число n (1-1000");
			int n = scanner.nextInt();
			if (n >= 1 || n <= 1000) {
				int sum = 0;
				int count = 0;
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0) {
						sum += i;
						count++;
					}
				}

				System.out.println("Сумма четных чисел" + sum);
				System.out.println("Колличество четных чисел" + count);
			} else {
				System.out.println("Число должно было быть от 1 до 1000 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
		}
		System.out.println("----------------8----------------");
		
	}
}
