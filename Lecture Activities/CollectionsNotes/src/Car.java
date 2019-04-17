
public class Car {
	private String nickname, license;
	private double mpg;
	
	public Car(String nickname, String license, double mpg) {
		super();
		this.nickname = nickname;
		this.license = license;
		this.mpg = mpg;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	@Override
	public String toString() {
		return "Car [nickname=" + nickname + ", license=" + license + ", mpg=" + mpg + "]";
	}
	
}
