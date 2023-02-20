/**
 * 
 */
package javaClass;

/**
 * @author developers
 *
 */
public class SingleInheritance extends simpleClass {

	/**
	 * @param args
	 */
	double Divide(int a, int b) {
		int result = 0;
		try {		
		    
		    result = (int)a/b; // exception can occurs at this point
		}
//		catch(ArithmeticException e) {
//			if(b == 0) {
//				System.out.println("Divisor can't be zero, taking default divisor 2");
//			}
//			else {
//				System.out.println(e);
//			}
//			result = a/2;
//		}
		finally {
			System.out.println("Finally exicuted");
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj = new SingleInheritance();
		System.out.println("Sum of 25 an 35 is :" + obj.sum(25 , 35));
		
	}

}
