/*
**MobileClient - Hierarchial and Multilevel inheritance
**     - keypad phone LGGB170 is to extends the general LG mobile and implements telecommunications.
**
**/
public class MobileClient {
	public static void main(String args[]) {
		LGGB170 keypadMobile = new LGGB170();
		System.out.println("LGGB170 is mobile smartphone - "+keypadMobile.isSmartPhone());
		System.out.println("Adjust speaker volumne -" + keypadMobile.adjustSpeakerVolumne(true));
		System.out.println("Mobile charge level " + keypadMobile.getBatteryChargeLevel());
		System.out.println("Receiving call - "+keypadMobile.receiveCall());
		keypadMobile.dialNumber("9629230494");
	}
}