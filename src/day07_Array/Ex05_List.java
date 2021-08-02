package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList food = new ArrayList();
		
		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		
		System.out.println(food);
		System.out.print("찾을 값 입력 : ");
		String n = sc.next();
		System.out.println(n+" 위치 : "+food.indexOf(n)+"번 인덱스");
		// .indexOf() : 해당 값이 있으면 그 인덱스번지를 찾음
		
		System.out.println("변경할 위치 입력");
		int num = sc.nextInt();
		System.out.println("변경할 값 입력");
		n = sc.next();
		System.out.println("변경 전\n"+food);
		food.set(num, n);
		// .set(변경할 위치, 변경할 내용)
		System.out.println("변경 후\n"+food);
	}
}
