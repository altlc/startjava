public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 33;
		if (age > 20) {
			System.out.println("Age > 20");
		}

		char gender = 'F';
		if (gender == 'M') {
			System.out.println("Male");
		}

		if (gender != 'M') {
			System.out.println("Not male");
		}

		float height = 1.70f;
		if (height < 1.80) {
			System.out.println("height < 1.80");
		} else {
			System.out.println("height > 1.80");
		}

		char firstNameLetter = 'G';
		if(firstNameLetter == 'M') {
			System.out.println("First char M");
		} else if (firstNameLetter == 'I') {
			System.out.println("First char I");
		} else {
			System.out.println("Other first char");
		}
	}
}