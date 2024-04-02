
public class Ex7_02 {
	
	// 정적 (일반) 메소드
	static void staticMethod() {
		System.out.println("정적 메소드 호출");
	}
	// 인스턴스 (클래스) 메소드
	public void instanceMethod() {
		System.out.println("인스턴스 메소드 호출");
	}
	

	public static void main(String[] args) {
		
		int y; // y 밑에 노란 줄 : 함수나 객체, 변수 등 아직 사용하지 않음.
		
		staticMethod(); // 정적 메소드라 사용 가능. (Static)
//		instanceMethod(); // 정적 메소드가 아니라 호출 못함. 
		// -> 객체 생성해 줘야함.
		Ex7_02 ex = new Ex7_02();
		ex.instanceMethod();
	}

}
