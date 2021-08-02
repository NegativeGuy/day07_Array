package day07_Array;

public class Quiz01 {
	public static void main(String[] args) {
		// 초기값이 설정된 배열에서 "짝수"와 "홀수"를 각각 출력하시오
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("짝수 : "+arr[i]);
			}
			else {
				System.out.println("홀수 : "+arr[i]);
			}
		}
	}
}
