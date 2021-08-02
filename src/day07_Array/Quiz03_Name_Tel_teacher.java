package day07_Array;
import java.util.*;
public class Quiz03_Name_Tel_teacher {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phNum = new ArrayList();
		String n,p;
		int num=0,result=0;
		boolean bool = true;	//모든 true, false 값을 변수 하나로
		while(bool){
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num){
			case 1:
			System.out.print("이름 입력 : "); 
			n = input.next();
			if(name.indexOf(n) == -1) { 
				//인덱스에서 n을 비교했을 때 동일한 데이터가 없는 경우
				System.out.print("연락처 입력 : ");	
				p = input.next();
				name.add(n); 	// n을 name 인덱스에 추가
				phNum.add(p);	// p를 phNum 인덱스에 추가	
			}
			else{ //인덱스에서 n을 비교했을 때 동일한 데이터가 있는 경우
				System.out.println("이름이 존재 합니다");
				}
			break;
			
			case 2:
			System.out.print("찾을 이름 입력 : "); 
			n = input.next();
			result = name.indexOf(n);
			// name인덱스에서 n(입력값)을 가진 인덱스번호를 찾고, result에 대입
			if(result == -1){ 
				// 만약 없는 데이터를 입력했다면 name에서 비교할 때,
				// (인덱스번지가)-1이 되고 result에 -1이 대입됨 
				System.out.println(n+"님은 목록에 없습니다");
			}else{
				// 만약 있는 데이터를 입력했다면 name에서 비교할 때,
				// 해당 인덱스 번호가 result에 대입됨
				System.out.print(name.get(result)+":");
				System.out.println(phNum.get(result));
			}
			break;
			
			case 3:
			System.out.print("지울 이름 입력 : "); 
			n = input.next();
			result = name.indexOf(n);
			if(result == -1){
				System.out.println(n+"님은 목록에 없습니다");
			}else{
				System.out.print(name.remove(result)+":");
				System.out.println(phNum.remove(result)+"삭제 됨");
			}
				break;
			case 4:
			for(int i=0;i<name.size();i++){
				System.out.print(name.get(i)+" : ");
				System.out.println(phNum.get(i));
			}break;
			case 5: bool=false;
			}
		}
		System.out.println("종료 합니다~!");
	}
}
