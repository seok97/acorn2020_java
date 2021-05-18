package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//String type  을 저장할 ArrayList 객체 생성하고 
		//참조값을 List 인터페이스 type 지역변수 msgs 에 담기
		List<String> msgs=new ArrayList<String>();
		msgs.add("김구라");
		msgs.add("해골");
		msgs.add("원숭이");
		msgs.add("주뎅이");
		msgs.add("덩어리");
		
		for(int i = 0; i<msgs.size(); i++) {
			String tmp = msgs.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("-------");
		
		for(String tmp:msgs) {
			System.out.println(tmp);
		}
	}
}





