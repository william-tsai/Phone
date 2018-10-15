package me.williamtsai.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Galaxy phone is ringing.";
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking galaxy";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
        System.out.println("Galaxy: " + this.getVersionNumber() + ", " + this.getBatteryPercentage() + ", " + this.getCarrier() + ", " + this.getRingTone());
	}

    
}
