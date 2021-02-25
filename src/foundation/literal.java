package test;

public class literal {
	public static void main(String[] args) {
		Object obj =  "123";
		String str = "123"; //리터럴은 이처럼 변하지않는 값 데이터 그 자체를 의미한다
		String str2 = str;
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		
		try {
			System.out.println(Integer.parseInt((String)obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
