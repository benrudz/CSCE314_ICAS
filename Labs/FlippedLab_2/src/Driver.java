
public class Driver {
	public static void main(String[] args) {
		//Vehicle myVehicle = new Vehicle();
	//	myVehicle.setSpeed((float)5.0);
		//System.out.println("Vehicle speed: " + myVehicle.getSpeed());
		
		Car myCar = new Car();
		myCar.setLicense("license!");
		
		Plane myPlane = new Plane();
		myPlane.setFlightNumber("flightNumber!");
		
		System.out.println(myCar.getLicense()+"\n" + myPlane.getFlightNumber());
		
		myCar.setMotor("combustion");
		myPlane.setMotor("JEt");
		
		System.out.println(myCar.getMotor()+"\n" + myPlane.getMotor());
		
		
		Warplane warplane = new Plane();
		warplane.fireWeapon();
		
		myCar.accelerate();
		myPlane.accelerate();
	}
}
