package javaClass;

public class MethodOverload {
	MethodOverload(){
		System.out.println("zero arg constructor");
	}
	MethodOverload(int a){
		System.out.println("one integer arg constructor " + a);
	}
	MethodOverload(String a){
		System.out.println("one String arg constructor " + a);
	}
	MethodOverload(int a, int b){
		System.out.println("Two integer arg constructor " + a + " " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodOverload();
		new MethodOverload(5);
		new MethodOverload("Five");
		new MethodOverload(5,6);
	}

}
