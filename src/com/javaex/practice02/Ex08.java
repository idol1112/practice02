package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자3개를 입력해주세요");
		System.out.print("숫자1: ");
		num[0] = sc.nextInt();
		System.out.print("숫자2: ");
		num[1] = sc.nextInt();
		System.out.print("숫자3: ");
		num[2] = sc.nextInt();
		int min = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.println("가장 작은수는 "+min+" 입니다.");
		
		sc.close();
	}

}
