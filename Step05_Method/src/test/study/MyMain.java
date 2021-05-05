package test.study;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MyMain {

	public static void main(String[] args) {
		MyObject o1 = new MyObject();
		o1.walk();
		int num = o1.getNumber();
		String str = o1.getGreeting();
		Car car1 = o1.getCar();
		car1.drive();
		
		o1.setName("원숭이");
		
		o1.useCar(new Car());
		Car c1 = new Car();
		o1.useCar(c1);
		o1.useSome("orion", car1);
		
		Radio r = new Radio();
		Speaker s = new Speaker();
		o1.doSome(r, s);
	}

}
