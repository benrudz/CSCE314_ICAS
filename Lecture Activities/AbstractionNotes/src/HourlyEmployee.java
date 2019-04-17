public class HourlyEmployee extends Employee {
	private double wageRate;
	private double hours; // for the month

	public HourlyEmployee(String name, Date hireDate, double wageRate, double hours) {
		super(name, hireDate);
		this.wageRate = wageRate;
		this.hours = hours;
	}
	
	// setters and getters
	public double getMonthlyPay() {
		return wageRate * hours;
	}
	
	public double getWageRate() {
		return wageRate;
	}

	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public boolean equals(Object obj) {
		return obj.getClass().equals(this.getClass());
	}

	public String toString() {
		String retval = 
				"Name: " + getName() +
				"\nHire Date: + " + getHireDate().getMonth() + "/" + getHireDate().getDay() + "/" + getHireDate().getYear() +
				"\nWage Rate: " + getWageRate() +
				"\nHours: " + getHours() +
				"\nMonthly Salary: " + getMonthlyPay();
		return retval;
	}

}
