import lombok.Data;

@Data
class Student {
	private int sno;
	private String sname;

}

public class LombokDemo {

	public static void main(String[] args) {

		Student s = new Student();

		System.out.println(s);

		s.setSno(100);
		s.setSname("Raj");

		System.out.println(s);
	}

}
