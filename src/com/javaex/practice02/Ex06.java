package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int[] num = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		num[0] = sc.nextInt();
		System.out.print("숫자2: ");
		num[1] = sc.nextInt();
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(min>num[i]) {
				min = num[i];
			}
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("큰수: "+max+"\t"+"작은수: "+min+"입니다.");
		
		sc.close();

	}

}
