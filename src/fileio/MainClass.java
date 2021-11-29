package fileio;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsw.util.Util;

public class MainClass {

	//메인에 있는 네이버 API소스들을 클래스를 만들어서 다 옮기고
	//메인에서는 검색어만 전달하면 결과가 나오게 만들기
	
	//맛집을 찾아주는 앱이라 생각하고 JSON형식의 데이터로 받는데
	//너무 복잡하네..
	//제목, 링크, 날짜만 가져와서 보기 좋게 출력 해보자
	//링크: https://sa;dfkjsajdf
	//날짜: 20211129
	//어렵지만 어떻게 해야 될지 고민 또는 검색을 통해서 할 수 있는 사람은 해보기
	
	public static void main(String[] args) {
		
	
		String code = Util.readLineFile("C:\\Users\\SAMSUNG\\eclipse-workspace\\file\\naverapi_secretcode.txt");
				
		// 내가 만든 유틸에서 파일 읽기
//		String filePath = "C:\\Users\\SAMSUNG\\eclipse-workspace\\fileio/전공정보.txt";
//		//				Util.readLineFile(filePath);
//		//				ArrayList<String> list = new ArrayList<String>();
//		//				String name = null;
//		//				Scanner sc = new Scanner(System.in);
//		//				while (true) {
//		//					System.out.print("이름 계속 추가(0은 종료): ");
//		//					name = sc.next();
//		//					if (name.equals("0")) {
//		//						break;
//		//					}
//		//					list.add(name);
//		//				}
//
//		//		Util.writeLineFile(list, filePath, true);
//		String name = Util.readLineFile(filePath);
//		//		System.out.println("파일에서 밖으로 가져온 내용을 출력\n"+name);
//		//		Util.seperate(filePath);
//		
//		Util.mySplit(name, "\n", "`", 4);
		
//		String code = Util.readLineFile("C:\\Users\\SAMSUNG\\eclipse-workspace");
		String[]cArr = code.split("\n");
		System.out.println(cArr[0]);
		System.out.println(cArr[1]);
	}
	

}
