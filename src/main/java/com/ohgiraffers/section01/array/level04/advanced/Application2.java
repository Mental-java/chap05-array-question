package com.ohgiraffers.section01.array.level04.advanced;

import java.util.*;


import static java.lang.Integer.parseInt;

public class Application2 {

	public static void main(String[] args) {

		/* 숫자 야구게임 만들기
		 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
		 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
		 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
		 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
		 *
		 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
		 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
		 *
		 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
		 * 횟수는 차감하지 않는다.
		 *
		 * -- 프로그램 예시 (난수 7416 의 경우) --
		 *
		 * 10회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 1234
		 * 아쉽네요 0S 2B 입니다.
		 * 9회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 5678
		 * 아쉽네요 0S 2B 입니다.
		 * 8회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 7416
		 * 정답입니다.
		 * */
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*9);
			System.out.print(arr[i]);
		}
		System.out.println("");

//		String [] arr1 = new String[arr.length];
//		for(int i = 0; i<arr1.length; i++){
//			arr1[i] = Integer.toString(arr[i]);
//		}


		for(int i = 0; i < 10; i++){
			int b = 0;
			int s = 0;
			System.out.printf("%d회 남으셨습니다.\n", 10-i);
			System.out.println("4자리 숫자를 입력하세요");
			int x = sc.nextInt();
			if(arr[0]==x/1000){
				s++;
			}else if(x/1000 == arr[1] || x/1000 == arr[2] || x/1000 == arr[3]){
				b++;
			}
			if(arr[1]==x%1000/100){
				s++;
			}else if(x%1000/100 == arr[0] || x%1000/100 == arr[2] || x%1000/100 == arr[3]){
				b++;
			}
			if(arr[2]==x%1000%100/10){
				s++;
			}else if(x%1000%100/10 == arr[0] || x%1000%100/10 == arr[1] || x%1000%100/10 == arr[3]){
				b++;
			}
			if(arr[3]==x%1000%100%10/1){
				s++;
			}else if(x%1000%100%10/1 == arr[0] || x%1000%100%10/1 == arr[1] || x%1000%100%10/1 == arr[2]){
				b++;
			}
			if(s==4){
				System.out.println("정답입니다.");
				return;
			}else{
				System.out.printf("아쉽네요 %dS %dB 입니다.\n", s, b);
			}

		}
		System.out.printf("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");

	}

}
