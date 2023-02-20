package javaClass;


public class MethodOverRiding extends ParentClass{
	@Override
	public void calculate(int a, int b) {
		this.result = a*b;
	}
	public void work() {
		super.calculate(5, 4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding obj = new MethodOverRiding();
		obj.getResult(4, 3);
		obj.work();
		System.out.println(obj.result);
	}

}
