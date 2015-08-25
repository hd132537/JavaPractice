package org.dimigo.inheritance;

public class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		//default constructor
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay(){
		//overrider
	}
	
	public void useSpecialFunction(){
		if(this instanceof IPhone){
			((IPhone) this).useAirDrop();
		}else{
			Galaxy ph = (Galaxy)this;
			ph.useWirelessCharging();
		}
	}
	
	public String toString(){
		return "모델명 : " +model+ ", 제조사 : " +company+ ", 가격 : " +String.format("%,d", price)+ "원";
	}
	
	
}
