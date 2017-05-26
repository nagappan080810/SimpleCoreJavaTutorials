/**
* MobileSimulator - do the tele communications sending and receiving the calls.
*
**/
public class MobileSimulator implements TeleCommunicator{
	static int someNumber = 123;
	public String receiveCall() {
		someNumber++;
		return String.valueOf(123);
	}
	
	public void dialNumber(String number) {
		TeleCommunicator.numberPad(number);
		System.out.println("Connecting to the number -->"+number);
		speakerAndMic();
	}
	
	public void speakerAndMic() {
		System.out.println("speaker and mic functionality overwritten");
		//super.speakerAnMic();
	}
	
	public static void main(String args[]) {
		TeleCommunicator mobile = new MobileSimulator();
		System.out.println("Call received --" + mobile.receiveCall());
		mobile.dialNumber("54321");
		
	}
	
}