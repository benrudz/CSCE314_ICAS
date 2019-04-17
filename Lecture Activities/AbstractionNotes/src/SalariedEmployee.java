public class SalariedEmployee extends Employee {
	private double salary; // annual

	public SalariedEmployee(String name, Date hireDate, double salary) {
		super(name, hireDate);
		this.salary = salary;
	}

// setters and getters
	public double getMonthlyPay() {
		return salary / 12;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean equals(Object obj) {
		return obj.getClass().equals(this.getClass());
	}

	public String toString() {
		String retval = 
				"\nName: " + getName() +
				"\nHire Date: + " + getHireDate().getMonth() + "/" + getHireDate().getDay() + "/" + getHireDate().getYear() +
				"\nSalary: " + getSalary() +
				"\nMonthly Salary: " + getMonthlyPay();
		return retval;
	}

}
