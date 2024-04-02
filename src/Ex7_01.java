public class Ex7_01 {

	public static void main(String[] args) {

		Cat my_cat = new Cat();
		my_cat.setAge(14);
		my_cat.setName("Min");
		
		System.out.println("Say hi to my cat, " + my_cat.getName()); 
		System.out.println("My cat is " + my_cat.getAge() + " years old"); 
		// .getAge 해야 안전함.(Animal 클래스에서 public 으로 사용해서 아직은 사용 가능
		// public -> private 로 바꾸면 못 사용.
		
		
		my_cat.setAge(6); // .setAge 해야 안전함. (Animal 클래스에서 public 으로 사용해서 아직은 사용 가능
		// public -> private 로 바꾸면 못 사용.
		System.out.println("My cat is " + my_cat.getAge() + " years old");
				
	}

}
