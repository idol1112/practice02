package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age >= 19 && age < 65) {
			System.out.println("1번 그룹 입니다");
		}else {
			System.out.println("2번 그룹 입니다");
		}
		//입력한 나이가 19세이상 65세 미만이면 1번그룹 그 이외에는 2번그룹 출력.
		
		sc.close();

	}

}
