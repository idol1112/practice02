package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번 그룹\"");
		}else {
			System.out.println("\"2번 그룹\"");
		}
		System.out.println("입니다.");
		//입력한 나이가 20이하이면 2번그룹 20초과이면 1번그룹이 된다.
		
		sc.close();
	}

}
