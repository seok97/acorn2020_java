package test.main;

import java.util.Scanner;

import test.mypac.UserInfo;

public class MainClass05 {
	public static void MainPrint() {
		System.out.println("메뉴입력");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
	}
	
	
	public static void main(String[] args) {
		/*
		 *  test.mypac 페키지에 다양한 모양의 메소드를 가지는 
		 *  클래스를 정의하고
		 *  그 클래스를 이용해서 객체도 생성하고 메소드도 호출해 보세요.
		 */
		
		UserInfo mem1 = new UserInfo();
		Scanner s = new Scanner(System.in);
		int CheckMenu;
		
		MainPrint();
		CheckMenu = s.nextInt();
		
		if(CheckMenu == 1){
			System.out.print("아이디입력 : ");
			String id = s.next();
			System.out.println();
			
			System.out.print("패스워드 입력 : ");
			String pw = s.next();
			System.out.println();
			mem1.SignUp(id, pw);
			
		}else if(CheckMenu == 2) {
			
		}else {
			System.out.println("메뉴번호를 다시 입력해주세요");
			MainPrint();
		}
		
		mem1.SignUp(s.next(), s.next());
		mem1.LoginCheck("seok", "1234");
		mem1.LoginCheck("seok", "1235");
		System.out.println(mem1.getUserId());
		System.out.println(mem1.getUserPw());
	}
}
