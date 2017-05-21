/****************************************
**Pass By Value For Object 
****To retain the invoked method manipulation we can put the parameters and pass it to object**
****************************************/
import java.util.Arrays;
public class PassByValueForObject {

public static void main(String args[]) {
	ParameterClass obj = new ParameterClass();
	obj.a = 5;
	System.out.println("Before Passing to Function:"+obj.a);
	passByValue(obj);
	System.out.println("After Passing to Function:"+obj.a);
}

public static void passByValue(ParameterClass obj) {
	obj = new ParameterClass();
    obj.a++;
	System.out.println("Inside Function:"+obj.a);
}

public static class ParameterClass {
   // Integer a = new Integer(0);
   int a;
}
}