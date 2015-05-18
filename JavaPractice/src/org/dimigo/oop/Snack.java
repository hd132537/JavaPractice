/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Snack
 * 1, 개요 :
 * 2, 작성일 : 2015. 5. 18.
 * </pre>
 * @author	: 홍영택
 * @version : 1.0
 */
public class Snack {
	private String name;
	private String cimpany;
	private int price;
	private int number;
	
	public Snack(){
	}

	public Snack(String name, String cimpany, int price, int number) {
		//super();
		this.name = name;
		this.cimpany = cimpany;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCimpany() {
		return cimpany;
	}

	public void setCimpany(String cimpany) {
		this.cimpany = cimpany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack(){
		System.out.println("이름 : " + this.getName());
		System.out.println("제조사 : " + this.getCimpany());
		System.out.println("가격 : " + this.getPrice() + "원");
		System.out.println("개수 : " + this.getNumber() + "개");
		System.out.println("");
	}
	
	public int calcPrice(){
		int sum;
		sum = this.getPrice() * this.getNumber();
		
		return sum;
	}
	
	
}
