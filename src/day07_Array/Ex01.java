package day07_Array;

public class Ex01 {
	public static void main(String[] args) {
		/*
			�迭
			- ���� �ڷ������� �������� ������ ����� ����ϴ� ��
			- index(÷��) : 0��° ���� ����
			����
				1. �ڷ���[] ������(�迭��)
				
				2. �ڷ��� �迭��(������)[]
		*/
		
		int[] arr = new int[5];	//5���� index���� ����(0~4��)

		arr[0] = 100;
		arr[1] = 200;			
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1) * 100;
			System.out.println(arr[i]);
		}
		for(int i=0; i<=4; i++) {
			System.out.println("arr "+i+" : "+arr[i]);
		}
		System.out.println("arr 0 : "+arr[0]);
		System.out.println("arr 1 : "+arr[1]);
		System.out.println("arr 2 : "+arr[2]);
		System.out.println("arr 3 : "+arr[3]);
		System.out.println("arr 4 : "+arr[4]);
		
		System.out.println(arr.length);
		
		// int arr01 [] = new int[] {10,20,30,40,50};
		int arr01 [] = {10,20,30,40,50};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr01[i]);
		}
	}
	
}
