package me.williamtsai.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy s9 = new Galaxy("S9", 99, "T-Mobile", "generic ringtone");
		IPhone iphoneX = new IPhone("X", 90, "AT&T", "default ringtone");

		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());

		iphoneX.displayInfo();
		System.out.println(iphoneX.ring());
		System.out.println(iphoneX.unlock());
	}

}
