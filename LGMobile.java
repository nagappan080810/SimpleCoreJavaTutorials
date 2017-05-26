/*
**LGMobile - Implemented Mobile Interface 
**     - Single inheritance - get battery charge level and adjust speaker volumne.
**
**/
public abstract class LGMobile implements MobileInterface {
	int speakerVolumne = 50;
	public int getBatteryChargeLevel() {
		return 30;
	}
	
	abstract public boolean isSmartPhone();
	
	public int adjustSpeakerVolumne(boolean isIncrement) {
		if (isIncrement) {
			speakerVolumne++;
		}
		else {
			speakerVolumne--;
		}
		return speakerVolumne;
	}
	
	
	
}