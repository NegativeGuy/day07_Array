package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList food = new ArrayList();
		
		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		
		System.out.println(food);
		System.out.print("ã�� �� �Է� : ");
		String n = sc.next();
		System.out.println(n+" ��ġ : "+food.indexOf(n)+"�� �ε���");
		// .indexOf() : �ش� ���� ������ �� �ε��������� ã��
		
		System.out.println("������ ��ġ �Է�");
		int num = sc.nextInt();
		System.out.println("������ �� �Է�");
		n = sc.next();
		System.out.println("���� ��\n"+food);
		food.set(num, n);
		// .set(������ ��ġ, ������ ����)
		System.out.println("���� ��\n"+food);
	}
}
