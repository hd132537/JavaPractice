package org.dimigo.oop;

public class Piggybank {
	
	private static int balance=0;
	
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " +  amount + "원 넣음");
		balance = amount + balance;
//		printBalance();
//		System.out.println("");
	}
	
	public static void printBalance(){
		System.out.println("대지저금통 총 금액 : " + balance + "원");
	}
	
	public static void stoleMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " + amount + "원 꺼냄");
		balance -= amount;
//		printBalance();
//		System.out.println("");
	}
}
