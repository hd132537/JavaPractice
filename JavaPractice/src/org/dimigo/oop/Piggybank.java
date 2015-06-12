package org.dimigo.oop;

public class Piggybank {
	
	private static int balance=0;
	
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " +  amount + "원 넣음");
		balance = amount + balance;
	}
	
	public static void printBalance(){
		System.out.println("대지저금통 총 금액 : " + balance + "원");
	}
}
