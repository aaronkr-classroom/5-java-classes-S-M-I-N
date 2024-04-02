
public class Student {
	int id;
	String name;
	

	Student() {
		System.out.println("학생 생성");
	}
	
	Student(int id, String name) {
		insertRecord(id, name);
	}
	
	void insertRecord(int id, String name) {
		this.id  = id;
		this.name = name;
	}
	
	void printInfo() {
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
	}

}
