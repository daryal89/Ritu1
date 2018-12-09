package methods;

public class MethodsToTest {

	public String str = "Hello NewYork";
	public String str1 = "Selenium";

	public void add(int num1, int num2) {
		int c = num1 + num2;
		System.out.println("Add is: " + c);
	}

	public void subtract(int num1, int num2) {
		int c = num1 - num2;
		System.out.println("Subtraction is: " + c);
	}

	public void factorial(int num1) {
		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);
	}

	public void fibonacci(int a) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i < a; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	public void isPerfect(int a) {
		int temp = 0;

		for (int i = 1; i < a; i++) {
			if (a / i == 0)
				temp = temp + i;
		}

		if (a == temp) {
			System.out.println(a + " is a perfect number");
		} else
			System.out.println(a + " is not a perfect number");
	}

}
