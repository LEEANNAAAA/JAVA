package ex0422_14;

public class Member {
	String name;
	String id;
	String password;
	int age;


Member(String name, String id) {
	this.name = name; //필드명과 매개변수명이 동일하기 때문에 .this 를 붙여준다
	this.id = id;
	}
}