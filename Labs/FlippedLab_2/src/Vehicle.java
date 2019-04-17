public abstract class Vehicle 
{
	private float speed;
	protected String motor;

    abstract String getMotor();
	abstract void setMotor(String motor);
	public float getSpeed() { return speed; }
	public void setSpeed(float speed) { this.speed = speed; }

	protected void left() { System.out.println("left"); } ;
	protected void right() { System.out.println("right"); } ;
	protected void forward() { System.out.println("forward"); } ;
	protected void reverse() { System.out.println("backward"); } ;
}