package classwork_20;


	public class Rectangle {
	    double w, h;

	    public Rectangle(double w, double h) {
	        this.w  = w;
	        this.h = h;
	    }

	    public double area() {
	        return w * h;
	    }

	    public double perimeter() {
	        return 2 * (w + h);
	    }

	    public void describe() {
	        System.out.println("ш: " + w + ", Высота: " + h);
	        System.out.println("П: " + area());
	        System.out.println("Пер: " + perimeter());
	    }

	    public static void main(String[] args) {
	        Rectangle x = new Rectangle(5.0, 3.0);
	        x.describe();
	    
	    }
	}
		
	

