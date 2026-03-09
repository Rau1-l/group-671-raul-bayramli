package classwork_12;

public class Rectangle implements Resizable {
	double width = 10;
	double height = 5;

	@Override
	public void resize(double factor) {
		System.out.println(width * factor);
		System.out.println(height * factor);
		System.out.println(width % factor);
		System.out.println(height % factor);
	}
}
