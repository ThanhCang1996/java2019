package lab2;

public class mainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog A = new Dog("A",1,"vang");
		Dog B = new Dog("B",2,"trang");
		Dog C = new Dog("C",3,"den");
		String a = "nhiet tinh", b="sua to", c = "tap an";
		System.out.println("vay duoi: "+A.waggingTheTail(a));
		System.out.println("sua: "+A.barking(b));
		System.out.println("an: "+A.eating(c));
	}

}
