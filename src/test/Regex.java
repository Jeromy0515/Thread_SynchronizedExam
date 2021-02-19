package test;

public class Regex {

	public static void main(String[] args) {
		String str = "돼지국밥(7000)Love";
		System.out.println(str.replaceAll("[^가-힣]", "")); //한글을 제외한 문자모두 ""으로 바꿈, [^O-O] ->  OO를 제외한 나머지선택
		System.out.println(str.replaceAll("[^0-9]","")); // 숫자를 제외한 나머지 선택
		System.out.println(str.replaceAll("[^a-zA-z]", "")); //영어 소문자,대문자를 제외한 나머지 선택
		
		System.out.println(str.replaceAll("[가-힣]", "")); //한글만 선택
		System.out.println(str.replaceAll("[0-9]", ""));  //숫자만 선택
		System.out.println(str.replaceAll("[a-zA-Z]", "")); //영어 소문자,대문자만 선택
		
		
	}

}
