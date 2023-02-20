package javaClass;

public class ParentClass {
	int result = 0;
	public void calculate(int a, int b) {
		this.result = a+b;
	}

	public void getResult(int a, int b) {
		this.calculate(a, b);
		System.out.println(result);
	}
}
