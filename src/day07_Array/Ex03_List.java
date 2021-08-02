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
				- �����Ϳ� ���� ������ �ִ�. index�� ���� ����
				- �ߺ��� �����͸� ������ �� �ִ�.
				- �迭���� �ٸ��� 
					- ���� �ٸ� �ڷ����� ���� �� �ִ�.
					- ������ ũ�⸦ ���´�.
			����)
				[�迭] 	    : int [] a = new int[10] 
				- int�� 10���� ���� �� ����
				
				[ArrayList] : ArrayList a = new ArrayList();
				- ������ �ڷ����� ũ�⵵ ���� 
		*/
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("123"));	//true
		System.out.println(arr.contains("1234"));	//false
		// .contains : ���� ���ϴ� ������ �ִ��� Ȯ�� 
		// ������ true, ������ false
		
		System.out.println(arr.remove("123"));
		// .remove("����") : �ش� ���� ����
		System.out.println(arr);
		
		System.out.println(arr.remove(1));
		// .remove(�ε�������) : �ش� ���� ���� ������ ����
		System.out.println(arr);

		System.out.println(arr.get(0));
		// .get(�ε�������) : �ش� ������ ������ ��
		System.out.println(arr);

		arr.clear();
		// ��ü ����
		System.out.println("���� �� : "+arr);
		
	}
}
