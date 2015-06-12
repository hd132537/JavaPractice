package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember[] family = {new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("남동생"), new FamilyMember("나")};
		FamilyMember.printMemberCnt();
		Piggybank.putMoney(family[0], 10000);
		Piggybank.putMoney(family[1], 5000);
		Piggybank.putMoney(family[2], 3000);
		Piggybank.printBalance();
		Piggybank.putMoney(family[3], 1000);
		Piggybank.printBalance();
	}

}
