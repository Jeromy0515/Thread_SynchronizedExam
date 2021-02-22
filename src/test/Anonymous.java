package test;

@FunctionalInterface
interface Test{
	void print();
}

class MyClass{
	void print() {
		System.out.println("메소드 입니다");
	}
}

public class Anonymous {
	
	public static void main(String[] args) {
		
		
		
		Test test = new Test() {
			@Override
			public void print() {
				System.out.println("첫번째 인터페이스입니다");
			}
		};
		Test test2 = () -> {
			System.out.println("두번째 인터페이스입니다");
		};
		
		
		MyClass mc = new MyClass() {
			@Override
			void print() {
				System.out.println("익명클래스에서 재정의한메소드입니다");
				method();
			}
			
			public void method() {
				System.out.println("1+1="+add(1, 1));
				System.out.println("2-1="+minus(2, 1));
			}
			
			public int add(int x,int y) { //익명클래스에서 새로 정의한 메서드들은 익명클래스 내에서만 쓸수있음 외부에서 사용 불가
				return x+y;
			}
			
			public int minus(int x,int y) { 
				return x-y;
			}
		};
		
		MyClass mc2 = new MyClass();
		
		
//		mc.add(); 사용불가 
//		mc.copy(); 사용불가
//		mc.minus(); 사용불가
		
		mc.print();//익명클래스에서 재정의한메소드입니다
				   //1+1=2
				   //2-1=1
		mc2.print();//메소드 입니다
		test.print();//첫번째 인터페이스입니다
		test2.print();//두번째 인터페이스입니다
			
		new Thread() { // 흔히 사용하는 익명클래스 예시 ex)Thread, Runnable
			@Override
			public void run() {
				try {
					for(int i=0;i<10;i++) {
						System.out.println(i); //0.5초마다 0부터9까지 순서대로 출력
						Thread.sleep(500); //0.5초
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		
	}

}
