import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Employee {
	private @Getter @Setter Integer employeeId;
	private @Getter @Setter String name;
	private @Getter @Setter String company;
	private @Getter @Setter String emailId;

	public static void main(String args[]) {
		Employee emp = new Employee();
		System.out.println(emp.getName());
	}
}
