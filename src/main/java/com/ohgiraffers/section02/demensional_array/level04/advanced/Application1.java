package com.ohgiraffers.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {

		/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
		 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 *
		 * -- 출력 예시 --
		 * ================== A반 성적표 ====================
		 * 이름        국어     영어      수학     합계      평균
		 * -----------------------------------------------
		 * 홍길동       80      90       77      247     82.3
		 * 이순신       78      97       86      261     87.0
		 * 유관순       71      68       88      227     75.7
		 * -----------------------------------------------
		 * 합계        229     255      251      735     81.7
		 * */
		int arr [][] = {{80, 90, 77},
				{78, 97, 86},
				{71, 68, 88}};
		int hongsum = arr[0][0] + arr[0][1] + arr[0][2];
		double hongavg = (double)hongsum/3;
		int leesum = arr[1][0] + arr[1][1] + arr[1][2];
		double leeavg = (double)leesum/3;
		int usum = arr[2][0] + arr[2][1] + arr[2][2];
		double uavg = (double)usum/3;
		int korsum = arr[0][0] + arr[1][0] + arr[2][0];
		int engsum = arr[0][1] + arr[1][1] + arr[2][1];
		int mathsum = arr[0][2] + arr[1][2] + arr[2][2];
		int sum = korsum + engsum + mathsum;
		double avg = (double)sum/9;

		System.out.println("================== A반 성적표 ====================");
		System.out.println("이름			국어		영어		수학		합계		평균");
		System.out.println("-----------------------------------------------");
		System.out.printf("홍길동		%d		%d		%d		%d		%.1f\n", arr[0][0], arr[0][1], arr[0][2], hongsum, hongavg);
		System.out.printf("이순신		%d		%d		%d		%d		%.1f\n", arr[1][0], arr[1][1], arr[1][2], leesum, leeavg);
		System.out.printf("유관순		%d		%d		%d		%d		%.1f\n", arr[2][0], arr[2][1], arr[2][2], usum, uavg);
		System.out.println("-----------------------------------------------");
		System.out.printf("합계	        %d	    %d	    %d		%d		%.1f", korsum, engsum, mathsum, sum, avg);
	}

}
