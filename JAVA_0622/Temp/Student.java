package Temp;

import java.util.Scanner;

public class Student extends Person{
	
	void set() {
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		name = sc.next();
		height = sc.nextInt();
		setWeight(sc.nextInt());
	}
	
	
	public static void main(String[] args) {
		Student ps = new Student();
		ps.set();
		
		System.out.println("����");
		System.out.println(ps.age);
		System.out.println("�̸�");
		System.out.println(ps.name);
		System.out.println("Ű");
		System.out.println(ps.height);
		System.out.println("������");
		System.out.println(ps.getWeight());
	}
}
