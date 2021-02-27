
public class TwoWheeler extends Vehicle 
{
	private String kickStartAvailable;

	public String getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(String kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			String kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available: "+getKickStartAvailable());
	}

}
