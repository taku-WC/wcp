
public class Chapter08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 50) {
			number1 *= 2;
			System.out.println("While01 = " + number1);
		}

		int number2 = 1;
		while (number2 < 50) {
			number2 *= 2;
			System.out.println("While01 = " + number2);
		}
		
		int chapter01 = 1;
		while (chapter01 < 5) {
			System.out.println("chapter01 = " + chapter01 * chapter01);
			chapter01++;
		}

		int number3 = 1;
		do {
			number3 *= 2;
			System.out.println("DoWhile01 = " + number3);
		} while (number3 < 50);

		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}

		int[] array = { 1, 2, 3, 4, 5 };
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
		int chapter02[] = {1,3,5,7};
		for(int i = 0; i < chapter02.length; i++) {
			System.out.println(chapter02[i]);
		}
        for (int val1 : chapter02) {
            if (val1 % 2 == 0) {
                continue;
            }
            System.out.println(val1);
        }

		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}
		
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				continue;
			}
			System.out.println("Continue01 = " + count);
		}
	}
}
