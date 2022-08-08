import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Employee> e = new ArrayList<Employee>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Name" + i);
			String empName = sc.next();
			System.out.println("Enter Salary" + i);
			int salary = sc.nextInt();
			System.out.println("Enter Id" + i);
			int empId = sc.nextInt();
			e.add(new Employee(empId, empName, salary));

		}
		for (int i = 0; i < 5; i++) {
			int j = i + 1;

			System.out.println("Name" + j + ": " + e.get(i).getEmpName());
			System.out.println("Salary" + j + ": " + e.get(i).getEmpSalary());
			System.out.println("Id" + j + ": " + e.get(i).getEmpId());
		}
		sc.close();
	}

}
