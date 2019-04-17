
public class Car extends Vehicle implements Engine {
	private String ln;
	
	public Car() {
		super();
		
	}
	public String getLicense() {
		return ln;
	}
	public void setLicense(String ln) {
		this.ln = ln;
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
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("4 seconds to accelerate");
	}
}
