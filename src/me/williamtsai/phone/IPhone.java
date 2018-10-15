package me.williamtsai.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "IPhone is ringing.";
    }
    @Override
    public String unlock() {
        return "Unlocking phone";
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone: " + this.getVersionNumber() + ", " + this.getBatteryPercentage() + ", " + this.getCarrier() + ", " + this.getRingTone());
    }
}
