
public class ExtendedCube extends Cube {
	
	public ExtendedCube(double s) {
		side = s;
	}
	
	public double getSurfaceArea() {
		return 6 * getSide() * getSide();
	}

	public double getVolume() {
		return getSide() * getSide() * getSide();
	}

	public String toString() {
		return "This cube’s sides is" + getSide() + "\n" + "This cube’s surface area is" + getSurfaceArea() + "\n"
				+ "This cube’s sides are" + getVolume() + "\n";
	}
}
