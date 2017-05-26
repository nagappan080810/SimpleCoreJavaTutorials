public class StringBuilderDemo {

	public static void main(String args[]) {
		String str = new String("Hello");
		StringBuilder strBuilder = new StringBuilder("Hello");
		System.out.println("Before Append:Memory Address of Str-"+System.identityHashCode(str));
		System.out.println("Before Append:Memory Address of Str Builder"+System.identityHashCode(strBuilder));
		strBuilder.append("World");
		str = str + "World";
		System.out.println("str value -"+str);
		System.out.println("str builder-"+strBuilder.toString());
		System.out.println("Memory Address of Str-"+System.identityHashCode(str));
		System.out.println("Memory Address of Str Builder"+System.identityHashCode(strBuilder));
	}
}