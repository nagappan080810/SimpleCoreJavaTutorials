/**
* Interface all methods are declared.
*    ---Methods are by default public need not be declared.
**/
public interface TeleCommunicator {
	String receiveCall();
	void dialNumber(String number);
	static void numberPad(String number){
		System.out.println("Pressing the..."+number);
	}
	default void speakerAndMic() {
		System.out.println("speaker giving sounds");
		System.out.println("Microphone to speak");
	}
}