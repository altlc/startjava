public class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.age = 5;
		myWolf.name = "Werewolf";
		myWolf.weight = 20.0f;
		myWolf.color = "grey";
		myWolf.gender = "male";

		System.out.println("Wolf name: " + myWolf.name);
		System.out.println("Wolf age: " + myWolf.age);
		System.out.println("Wolf gender: " + myWolf.gender);
		System.out.println("Wolf color: " + myWolf.color);
		System.out.println("Wolf weight: " + myWolf.weight);

		myWolf.go();
		myWolf.sit();
		myWolf.hunt();
		myWolf.howl();
	}
}

public class Wolf {
	public String gender;
	public String name;
	public float weight;
	public byte age;
	public String color;

	public void go() {
		System.out.println("Go");
	}

	public void run() {
		System.out.println("Run");
	}

	public void sit() {
		System.out.println("Sit");
	}

	public void hunt() {
		System.out.println("Hunt");
	}

	public void howl() {
		System.out.println("howl");
	}
}