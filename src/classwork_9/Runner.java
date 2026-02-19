package classwork_9;

public class Runner {
	public static void main(String[] args) {

		RobotCleaner r_1 = new RobotCleaner("Raul");

		r_1.start();
		r_1.stop();
		r_1.charge();
         
		Kitten k_1 = new Kitten("cat","white");
		
		
		k_1.play();
		k_1.eat();
		k_1.status();
		
	}
}
