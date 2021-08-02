package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_Name_Tel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList name = new ArrayList();
		ArrayList tel = new ArrayList();
		int select = 0, addTel, schTel;
		String addName, schName;
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("이름 입력 : ");
				addName = sc.next();
				if(name.contains(addName)==false) { //입력한 이름이 인덱스에 없을 경우
					name.add(addName);	// 입력한 값(이름)을 인덱스에 추가
				
					System.out.print("연락처 입력 : ");
					addTel = sc.nextInt();
					tel.add(addTel);	// 입력한 값(번호)을 인덱스에 추가
					System.out.println();
					break;
				}
				
				else {	// 입력한 이름이 인덱스에 있을 경우
					System.out.println("이미 등록된 이름 입니다");
					System.out.println();
					break;
				}
				
			case 2 :
				System.out.print("찾을 이름 입력 : ");
				schName = sc.next();
				if(name.contains(schName)==true) {	// 입력한 값과 인덱스를 비교했을 때 그 값이 있는 경우
					schTel = name.indexOf(schName);	// 입력한 값이 있는 인덱스 번호를 찾아 변수에 대입
					System.out.println("이름 : "+schName);
					System.out.println("연락처 : "+tel.get(schTel)); 
					// 위에서 찾은 인덱스 번호와 같은 [tel의 인덱스] 값 출력
					System.out.println();
					break;
				}
				
				else {	// 입력한 값과 인덱스를 비교해을 때 그 값이 없는 경우
					System.out.println(schName+"님은 목록에 없습니다");
					System.out.println();
					break;
				}
				
			case 3 :
				System.out.print("삭제할 이름 입력 : ");
				schName = sc.next();
				if(name.contains(schName)==true) { // 입력한 값과 인덱스를 비교했을 때 그 값이 있는 경우
					schTel = name.indexOf(schName); // 입력한 값이 있는 인덱스 번호를 찾아 변수에 대입
					name.remove(schName); // name 인덱스(전체)에서 입력한 값 삭제
					tel.remove(tel.get(schTel));
					// 위에서 찾은 인덱스 번호와 같은 [tel의 인덱스] 값 삭제
					System.out.println(schName+"님을 목록에서 삭제 했습니다");
					System.out.println();
					break;
				}
				
				else { //입력한 값과 인덱스를 비교했을 때 그 값이 없는 경우
					System.out.println(schName+"님은 목록에 없습니다");
					System.out.println();
					break;
				}
				
			case 4 : 
				for(int i=0; i<name.size(); i++) {
					System.out.println
					("이름 : "+name.get(i) //i를 증가시켜 name인덱스를 차례대로 출력
					+" / 연락처 : "+tel.get(i)); //i를 증가시켜 tel인덱스를 차례대로 출력
					System.out.println("-------------------------");
				}
				System.out.println();
				break;
			
			case 5 :
				System.out.println("프로그램이 종료 되었습니다");
				System.exit(1);		// while 반복 종료
			}
		}
	}
}
