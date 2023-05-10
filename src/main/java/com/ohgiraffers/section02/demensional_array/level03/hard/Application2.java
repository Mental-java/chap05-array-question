package com.ohgiraffers.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 홀수를 하나 입력 받아 입력받은 크기 만큼의 정사각형 형태의 2차원 배열을 할당하고
		 * 모래시계 모양으로 *을 출력하세요
		 *
		 * -- 입력 예시 --
		 * 홀수 하나를 입력하세요 : 5
		 *
		 * -- 출력 예시 --
		 * *****
		 *  ***
		 *   *
		 *  ***
		 * *****
		 *
		 * 단, 홀수를 입력하지 않은 경우 "홀수만 입력해야 합니다." 출력
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 하나를 입력하세요 : ");
		int x = sc.nextInt();
		if(x%2==0){
			System.out.println("홀수만 입력해야 합니다.");
			System.out.print("홀수 하나를 입력하세요 : ");
			x = sc.nextInt();
		}
		String arr[][] = new String[x][x];
		int left = -1;
		int right = x;
		for(int i = 0; i < x/2+1; i++){
			for(int j = 0; j < x; j++){
				if(j<=left || j>=right){
					arr[i][j] = " ";
					System.out.print(arr[i][j]);
				}else{
					arr[i][j] = "*";
					System.out.print(arr[i][j]);
				}
			}
			left++;
			right--;
			System.out.println("");
		}
		left -= 2;
		right += 2;
		for(int i = 0; i < x/2; i++){
			for(int j = 0; j < x; j++){
				if(j<=left || j>=right){
					arr[i][j] = " ";
					System.out.print(arr[i][j]);
				}else{
					arr[i][j] = "*";
					System.out.print(arr[i][j]);
				}
			}
			left--;
			right++;
			System.out.println("");
		}
	}

}
