
public class Animal { // 객체 설계 (클래스, 속성, 함수만 필요)
	
	private int numLegs = 4;
	private int age;
	private String name;
	
	public int getAge() {return age;} // this.age 필요
	
	public void setAge(int age) {this.age = age;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;} // this.name 필요
	
	
	public void myRole(int age) {System.out.println("나는 고양이 집사입니다. 나이는 " + age + " 입니다.");}
	
	
	public void myRole(String name) {System.out.println(name + " 은 고양이 학생입니다.");}
	
	
	public void myRole(int age, String name) { // 메소드 오버로딩 (같은 객체에서 다른 매개변수 주기)
		System.out.println(name + "은 고양이 자녀입니다. 나이는 " + age + " 입니다.");
	}
	
	public void sound() {  // 메소드 오버라이딩 (다른 객체에서 덮어쓰기)
		System.out.println("동물의 울음소리 ~~");
	}


}
