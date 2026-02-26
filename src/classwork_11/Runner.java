package classwork_11;

public class Runner {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.sayMeow());

		Dog dog = new Dog();
		System.out.println(dog.bark());

		Student student = new Student();
		System.out.println(student.study());

		Car car = new Car();
		System.out.println(car.drive());
		
		Book book = new Book();
		System.out.println(book.read());
		
		Phone phone = new Phone();
		System.out.println(phone.call("Kolbasenko"));
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle. getPerimetr());
		System.out.println(rectangle.getArea());
		
		
		
		
	}
}