package javaClass;

public class switchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Constant.MONDAY.value);
		for(Constant m : Constant.values()) {
			System.out.println(m.ordinal());
			System.out.println(m);
			
			System.out.println(m.value);
		}
	}

}
