package test.study;

import test.human.Blood;
import test.human.Person;

public class MyMaink01 {
	public static void main(String[] args) {
		Person p = new Person(null);
		p.walk();
		Person people = new Person(new Blood("+","AB")); 
		// person클래스의 생성자가 blood객체를 인자로 요구한다.
		people.walk();
	}

}
