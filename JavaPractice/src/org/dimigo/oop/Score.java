package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		String score = new StringBuilder().append("<< 점수 출력 >>\n")
				.append("국어 점수 : ")
				.append(kor)
				.append("점\n")
				.append("수학 점수 : ")
				.append(math)
				.append("점\n")
				.append("영어 점수 : ")
				.append(eng)
				.append("점\n")
				.append("평균 : ")
				.append( String.format("%.1f", (math + kor + eng) / 3.0) )
				.append("점\n")
				.toString();
		
		System.out.println(score);
		scanner.close();
	}

}