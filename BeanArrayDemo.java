/**
* Bean Array Demo 
*  	- It shows how to create bean array with parametrized constructor 
*********************************************/
import java.util.Date;
public class BeanArrayDemo{
	public static void main(String args[]){
		AppBean[] activeApps = new AppBean[3];
		activeApps[0] = new AppBean("Settings", new Date(), true);
		activeApps[1] = new AppBean("WhatsApp", new Date());
		activeApps[2] = new AppBean("Dialer", new Date());
		for (AppBean activeApp:activeApps) {
			activeApp.print();
		}
		
	}
}