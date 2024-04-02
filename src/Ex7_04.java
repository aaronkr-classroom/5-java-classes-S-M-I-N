
public class Ex7_04 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		s1.id = 20191500;
		s1.name = "유재석";
		s1.printInfo();
		
		s2.insertRecord(20241500, "마동석");
		s2.printInfo();
		
		Student s3 = new Student(20221006, "김유석");
		s3.printInfo();

	}

}
