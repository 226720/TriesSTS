import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
public static void main(String[] args) {
	
	List<Employee> empList = new ArrayList<>();

	Employee employee = new Employee();
	employee.setId(1);
	employee.setDepartment("ECE");
	employee.setName("E1");
	employee.setSalary(10000);
	Job job = new Job();
	job.setJobId(001);
	job.setJobName("JO1");
	employee.setJob(job);
	empList.add(employee);
	

	Employee employee1 = new Employee(2,"E2","CS", 15000,new Job(002,"JO2"));
	Employee employee2 = new Employee(3,"E3","CS", 12000,new Job(002,"JO2"));
	Employee employee3 = new Employee(4,"E4","EEE", 12000,new Job(003,"JO3"));
	Employee employee4 = new Employee(5,"E1","ECE", 14000,new Job(002,"JO2"));
	Employee employee5 = new Employee(6,"E3","CS", 12000,new Job(004,"JO4"));
	empList.add(employee1);
	empList.add(employee2);
	empList.add(employee3);
	empList.add(employee4);
	empList.add(employee5);
	
	//to display employee names
	List<String>empNames =  empList.stream().map(e->e.getName()).collect(Collectors.toList());
	System.out.println(empNames);
	
	// to display total salary 
	
	//total salary using reduce
	int total_salary1 = empList.stream().map(e->e.getSalary()).reduce(0,(a,b)->a+b);
	System.out.println(total_salary1);
	
	List<Integer> salaryList = empList.stream().map(r->r.getSalary()).collect(Collectors.toList());
	int salary4 = salaryList.stream().reduce(0,Integer::sum);
	System.out.println(salary4);
	
	int salary5 = empList.stream().map(e->e.getSalary()).reduce(0,Integer::sum);
	System.out.println(salary5);
	
	//total salary using collect
	int salary3 =  salaryList.stream().collect(Collectors.summingInt(Integer::intValue));
	System.out.println(salary3);
	
	
	//total salary using mapToInt, mapToLong
	int total_salary2 = empList.stream().map(q->q.getSalary()).mapToInt(e->e).sum();
	System.out.println(total_salary2);
	
	long sumAsLong = salaryList.stream().mapToLong(Integer::intValue).sum();
	System.out.println(sumAsLong);
	
	//to get list of employees with department ends with "CS"
	List<Employee> empSalary= empList.stream().filter(h->h.getDepartment().endsWith("CS")).collect(Collectors.toList());
	System.out.println(empSalary);
	
	//to get the count of employees with department "ECE"
	long empEce = empList.stream().filter(d->d.getDepartment().equals("ECE")).count();
	System.out.println(empEce);
	
	//to find the highest salary using reduce
	int maxSalary = empList.stream().map(a->a.getSalary()).reduce(Integer::max).orElse(0);
	System.out.println(maxSalary);
	
	
	
	
	
	
	
}
}
