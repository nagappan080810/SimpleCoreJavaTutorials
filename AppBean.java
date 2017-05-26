/**
* Opened Application Bean 
*  	- It shows how to call constructor within constructor 
*********************************************/
import java.util.Date;
public class AppBean {
	private String appName; 
	private Date startedDate;
	private boolean isFirstApp;
	
	public AppBean(String appName, Date startedDate) {
		this.appName = appName;
		this.startedDate = startedDate;
	}
	
	public AppBean(String appName, Date startedDate, boolean isFirstApp) {
		//constructor calling
		this(appName, startedDate);
		this.isFirstApp = isFirstApp;
	}
	
	public void print() {
		System.out.println("App Name -" + this.appName);
		System.out.println("App opened date -" + this.startedDate);
		if (isFirstApp) 
			System.out.println("This is the first app opened");
	}
}