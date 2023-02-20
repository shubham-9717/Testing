package javaClass;

public class StaticClass {
	public static int year = 2023;
	public static void func() {
		System.out.println("Static method");
		year = 2022;
	}
	static {
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass obj = new StaticClass();
		System.out.println(year);
		func();
		System.out.println(year);

	}

}
