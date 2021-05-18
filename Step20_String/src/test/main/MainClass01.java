package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		String name1 = "석우현";
		String name2 = "석우현";
		String name3 = new String("석우현");
		String name4 = new String("석우현");
		
		// " 로 만든 문자열의 참조값 비교
		boolean re1 = name1 == name2;
		// " 과 new 로 만든 문자열 비교
		boolean re2 = name1 == name3;
		// new 로 만든 문자열 비교
		boolean re3 = name3 == name4;
		
		// 문자열의 내용을 비교할때는 .equals() 메소드를 사용해야 한다.
		boolean re4 = name1.equals(name2);
		boolean re5 = name1.equals(name3);
		boolean re6 = name3.equals(name4);
		

	}

}
