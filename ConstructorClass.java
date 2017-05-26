/****************************************
**CopyConstructor
****Copy Constructor to constructor the object from given object***
****************************************/
public class ConstructorClass{
    String str;
    public ConstructorClass(String str){
	    this.str = str;
	}
	public ConstructorClass(ConstructorClass constructorClass) {
	    this.str = new String(constructorClass.str);
	}
	
	public void print() {
		System.out.println("str member value "+this.str);
	}
}
