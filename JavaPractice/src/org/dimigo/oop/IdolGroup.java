package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		String[] idolGroup = new String[]{"빅뱅", "2NE1", "걸스데이"};
		String[][] members = new String[][]{
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i=0; i<idolGroup.length; i++){
			System.out.println("<< " +idolGroup[i]+ "멤버 >>");
			for(String value : members[i]){
				System.out.println(value);
			}
			System.out.println("");
		}	
	}
}
