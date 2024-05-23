

public class Employee {

	private int id;
	private String name;
	private String department;
	private int salary;
	private Job job;
	public Employee(int id, String name, String department, int salary, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.job = job;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", job="
				+ job + "]";
	}
	
	
	
}
