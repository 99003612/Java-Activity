package java6;

public class Employee implements Comparable<Employee>{

	 

	private String name;

	private String desig;

	private int salary;

	

	

	public Employee(String name, String desig, int salary) {

		super();

		this.name = name;

		this.desig = desig;

		this.salary = salary;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getDesig() {

		return desig;

	}

	public void setDesig(String desig) {

		this.desig = desig;

	}

	public int getSalary() {

		return salary;

	}

	public void setSalary(int salary) {

		this.salary = salary;

	}

	@Override

	public String toString() {

		return "Employee name=" + name + ", desig=" + desig + ", salary=" + salary ;

	}

	/*

	 * @Override public int compareTo(Employee o) { // TODO Auto-generated method

	 * stub //return 0; if(salary == o.getSalary()) { return 0; } else if(salary <

	 * o.getSalary()) { return 1; } else{ return -1; } }

	 */

	@Override

	public int compareTo(Employee o) {

		// TODO Auto-generated method stub

		return name.compareTo(o.getName());

	}

	

	

}