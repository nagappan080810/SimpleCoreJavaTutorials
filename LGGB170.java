/*
**LGGB170 - Hierarchial and Multilevel inheritance
**     - keypad phone LGGB170 is to extends the general LG mobile and implements telecommunications.
**
**/
public class LGGB170 extends LGMobile implements TeleCommunicator{
	static int someNumber = 123;
	
	public boolean isSmartPhone() {
		return false;
	}

	public String receiveCall() {
		someNumber++;
		return String.valueOf(123);
	}
	
	public void dialNumber(String number) {
		TeleCommunicator.numberPad(number);
		System.out.println("Connecting to the number -->"+number);
		speakerAndMic();
	}
}