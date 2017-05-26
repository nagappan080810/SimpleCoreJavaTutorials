/****************************************
**CopyConstructor
****Copy Constructor to constructor the object from given object***
****************************************/
public class CopyConstructorExample{

	public static void main(String args[]) {
		ConstructorClass parameterizedConstructorObj = new ConstructorClass("Hello");
		parameterizedConstructorObj.print();
		System.out.println("Parameterized Constructor Object HashCode" + parameterizedConstructorObj.hashCode());
		System.out.println("Parameterized Constructor Object str member HashCode" + System.identityHashCode(parameterizedConstructorObj.str));
		ConstructorClass copyConstructedObj = new ConstructorClass(parameterizedConstructorObj);
		copyConstructedObj.print();
		System.out.println("Copy Constructored Object HashCode" + copyConstructedObj.hashCode());
		System.out.println("Copy Constructored Object str member HashCode" + System.identityHashCode(copyConstructedObj.str));
	}

}