/****************************************
**CopyConstructor
****Copy Constructor to constructor the object from given object***
****************************************/
public class StringImmutable {
	public static void main(String args[]) {
		String str = "hello";
		String str1 = new String(str);
		System.out.println("Address for literal \"hello\" ->"+System.identityHashCode("hello"));
		System.out.println("Address for String reference object-hello ->"+System.identityHashCode(str));
		System.out.println("Address for String reference of string object-hello ->"+System.identityHashCode(str1));
		str = "hello" + "world";
		str1 = str1 + "world";
		System.out.println("Address for literal \"world\" ->"+System.identityHashCode("world"));
		System.out.println("Address for String reference object concatenated with world ->"+System.identityHashCode(str));
		System.out.println("Address for String reference of string object concatenated with world ->"+System.identityHashCode(str1));
		System.out.println("Address for String reference of string object concatenated with world ->"+str1.hashCode());
	}
}