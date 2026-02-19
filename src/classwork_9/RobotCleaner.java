package classwork_9;

public class RobotCleaner {
	String name;
	int battery;
	boolean isworking;

	public RobotCleaner(String name) {
		this.name = name;
	}

	public void start() {
		if (battery > 10) {
			this.isworking = true;
			System.out.println("Working");
		}
	}

	public void stop() {
		this.isworking = false;
		System.out.println("Isnt working");

	}

	public void charge() {
		this.battery = 100;
		System.out.println("Charging");
	}

}
