/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ SnackTest
 * 1, 개요 :
 * 2, 작성일 : 2015. 5. 18.
 * </pre>
 * @author	: 홍영택
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Snack[] snack = new Snack[3];
		int sum = 0;
		
		snack[0] = new Snack ("새우깡", "농심", 1100, 2);
		snack[1] = new Snack ("콘칲", "해태", 1200, 1);
		snack[2] = new Snack ("허니버터칲", "해태", 1500, 4);
		
		for(Snack value1 : snack){
			sum += value1.calcPrice();
		}
		
		for(Snack value : snack){
			value.printSnack();
		}
		System.out.println("총 구매 금액 : " + sum + "원");
		
	}

}
