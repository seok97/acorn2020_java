package test.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass04 {

	public static void main(String[] args) {
		String line = "2020-05-18 12:10";
		//숫자만 찾을 정규표현식
		String reg = "[0-9]+";  // 숫자만을 나태내는것은 다음표현식도 된다. "[\\d]+"
		
		// 정규표현식으로 객체를 언어낸다.
		Pattern pat = Pattern.compile(reg);
		//Pattern객체의 matcher() 메소드를 사용해 Matcher 객체를 얻는다.
		Matcher mat = pat.matcher(line);
		
		while(mat.find()) {
			String result = mat.group();
			System.out.println(result);
		}
		System.out.println("main 메소드 종료");
		
		
	}

}
