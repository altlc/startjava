public class Cycle {
	public static void main(String[] args) {
		int i;
		int sum = 0;

		for (i=0;i<=20;i++){
			System.out.println(i);
		}

		i = 6;

		while(i>=-6) {
			System.out.println(i);
			i = i - 2;
		}

		i = 10;

		do {
			if( i % 2 != 0)
			{
				sum = sum + i;
			}
			i = i + 1;
		}while(i<=20);
		System.out.println("Sum: " + sum);

	}
}