package javaClass;

//  final class FinalClass { // final class can not be inherited
 class FinalClass {
	public static final int year = 2023;
	public final void func() {
		System.out.println("Static method");
//		year = 2022;  // final instance is set as constant , we can't change its value
	}
}
