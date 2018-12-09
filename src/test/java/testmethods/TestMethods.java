package testmethods;

import methods.MethodsToTest;

public class TestMethods {

	public static void main(String[] args) {
		MethodsToTest mt = new MethodsToTest();
		mt.add(3, 6);
		mt.subtract(15, 10);
		mt.factorial(5);
		mt.fibonacci(10);
		mt.fibonacci(20);
		mt.isPerfect(10);
		mt.isPerfect(28);

	}

}
