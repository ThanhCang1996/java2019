package lab1;

public class MainStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student A = new Student("Dave",6,"boy");
		Student B = new Student("Join",7,"boy");
		Student C = new Student("Juli",6,"girl");
		System.out.println("ten : "+A.name + "tuoi: "+ A.age + "gioi tinh: "+A.gender);
		System.out.println("ten : "+B.name + "tuoi: "+B.age + "gioi tinh: "+B.gender);
		System.out.println("ten : "+C.name + "tuoi: "+C.age + "gioi tinh: "+C.gender);
	}
}
