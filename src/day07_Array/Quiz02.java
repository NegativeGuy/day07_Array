package day07_Array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 초기값이 설정된 배열에서 "짝수"와 "홀수"를 입력했을 때
		// 해당하는 값을 출력하시오
		// 예) "짝수" 입력하면 배열에 있는 짝수 값만 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.println("짝수, 홀수 입력 : ");
		odd_even = sc.next();
		
		if(odd_even.equals("짝수")) { 
			//String값을 비교할때는 부등호(==, <= 등)가 아닌 .equals("")를 사용
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 == 0) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 == 1) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}
	
	System.out.println("========================");
	// 다른 방법
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2 == 0 && odd_even.equals("짝수")) {
			System.out.println(odd_even+":"+arr[i]);
		}else if(arr[i]%2 == 1 && odd_even.equals("홀수")){
			System.out.println(odd_even+":"+arr[i]);
		}
	}
	}
}
