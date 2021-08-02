package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
			List
			- Array List
			- LinkedList
			- Stack
			.
			.
			.
			
				Array List
				- 데이터에 대한 순서가 있다. index로 접근 가능
				- 중복된 데이터를 저장할 수 있다.
				- 배열과는 다르게 
					- 서로 다른 자료형도 넣을 수 있다.
					- 가변의 크기를 갖는다.
			예시)
				[배열] 	    : int [] a = new int[10] 
				- int형 10개만 넣을 수 있음
				
				[ArrayList] : ArrayList a = new ArrayList();
				- 정해진 자료형도 크기도 없음 
		*/
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("123"));	//true
		System.out.println(arr.contains("1234"));	//false
		// .contains : 내가 원하는 내용이 있는지 확인 
		// 있으면 true, 없으면 false
		
		System.out.println(arr.remove("123"));
		// .remove("내용") : 해당 내용 삭제
		System.out.println(arr);
		
		System.out.println(arr.remove(1));
		// .remove(인덱스번지) : 해당 번지 안의 데이터 삭제
		System.out.println(arr);

		System.out.println(arr.get(0));
		// .get(인덱스번지) : 해당 번지의 데이터 값
		System.out.println(arr);

		arr.clear();
		// 전체 삭제
		System.out.println("삭제 후 : "+arr);
		
	}
}
