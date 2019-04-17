


public class Plane  extends Vehicle implements Warplane, Engine{
	private String fn;
	String company;
	String country;
	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFlightNumber() {
		return fn;
	}
	public void setFlightNumber(String fn) {
		this.fn = fn;
	}
	@Override
	String getMotor() {
		// TODO Auto-generated method stub
		return motor;
	}
	@Override
	void setMotor(String motor) {
		this.motor = motor;
		
	}
	@Override
	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country = country;
		
	}
	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		System.out.println("Fire in the hole");
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("10 seconds to accelerate");

	}
}


