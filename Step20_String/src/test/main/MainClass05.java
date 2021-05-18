package test.main;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		String line = s.nextLine();
		String re = line.trim();
		
		System.out.println(re);
	}

}
