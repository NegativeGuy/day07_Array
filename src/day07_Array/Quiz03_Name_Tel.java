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
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.print(">>>");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.print("�̸� �Է� : ");
				addName = sc.next();
				if(name.contains(addName)==false) { //�Է��� �̸��� �ε����� ���� ���
					name.add(addName);	// �Է��� ��(�̸�)�� �ε����� �߰�
				
					System.out.print("����ó �Է� : ");
					addTel = sc.nextInt();
					tel.add(addTel);	// �Է��� ��(��ȣ)�� �ε����� �߰�
					System.out.println();
					break;
				}
				
				else {	// �Է��� �̸��� �ε����� ���� ���
					System.out.println("�̹� ��ϵ� �̸� �Դϴ�");
					System.out.println();
					break;
				}
				
			case 2 :
				System.out.print("ã�� �̸� �Է� : ");
				schName = sc.next();
				if(name.contains(schName)==true) {	// �Է��� ���� �ε����� ������ �� �� ���� �ִ� ���
					schTel = name.indexOf(schName);	// �Է��� ���� �ִ� �ε��� ��ȣ�� ã�� ������ ����
					System.out.println("�̸� : "+schName);
					System.out.println("����ó : "+tel.get(schTel)); 
					// ������ ã�� �ε��� ��ȣ�� ���� [tel�� �ε���] �� ���
					System.out.println();
					break;
				}
				
				else {	// �Է��� ���� �ε����� ������ �� �� ���� ���� ���
					System.out.println(schName+"���� ��Ͽ� �����ϴ�");
					System.out.println();
					break;
				}
				
			case 3 :
				System.out.print("������ �̸� �Է� : ");
				schName = sc.next();
				if(name.contains(schName)==true) { // �Է��� ���� �ε����� ������ �� �� ���� �ִ� ���
					schTel = name.indexOf(schName); // �Է��� ���� �ִ� �ε��� ��ȣ�� ã�� ������ ����
					name.remove(schName); // name �ε���(��ü)���� �Է��� �� ����
					tel.remove(tel.get(schTel));
					// ������ ã�� �ε��� ��ȣ�� ���� [tel�� �ε���] �� ����
					System.out.println(schName+"���� ��Ͽ��� ���� �߽��ϴ�");
					System.out.println();
					break;
				}
				
				else { //�Է��� ���� �ε����� ������ �� �� ���� ���� ���
					System.out.println(schName+"���� ��Ͽ� �����ϴ�");
					System.out.println();
					break;
				}
				
			case 4 : 
				for(int i=0; i<name.size(); i++) {
					System.out.println
					("�̸� : "+name.get(i) //i�� �������� name�ε����� ���ʴ�� ���
					+" / ����ó : "+tel.get(i)); //i�� �������� tel�ε����� ���ʴ�� ���
					System.out.println("-------------------------");
				}
				System.out.println();
				break;
			
			case 5 :
				System.out.println("���α׷��� ���� �Ǿ����ϴ�");
				System.exit(1);		// while �ݺ� ����
			}
		}
	}
}
