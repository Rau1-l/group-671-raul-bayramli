package classwork_20;

public class Cat {
	String ima;
	String cvet;
	int vozvrost;

	public Cat(String ima, String cvet, int vozvrast) {
		this.ima = ima;
		this.cvet = cvet;
		this.vozvrost = vozvrast;
	}

	public void meow() {
		System.out.println("Meow my name is cat " + ima);
	}

	public static void main(String[] args) {
		Cat cat = new Cat("catb", "catr", 3);
		cat.meow(); 
	}
}
