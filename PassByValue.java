/****************************************
**Pass By Value Program
****Java works by pass by value strategy
*****1. It copies the data to new address and pass to the invoking method****
*****   so change happening inside the invoked method is not visible in invoking method****
*****2. In case of Integer Object, we pass the object reference but incrementing creates new object****
*****   as integer is immutable it will create a new object so the old object of invoking method will retain old value****
****************************************/
import java.util.Arrays;
public class PassByValue {

public static void main(String args[]) {
	int a = 5;
	Integer intObj = new Integer(10);
	System.out.println("Before Passing to Function:"+a+"Object Value-"+intObj);
	passByValue(a, a);
	System.out.println("After Passing to Function:"+a+"Object Value-"+intObj);
}

public static void passByValue(int a, Integer intObj) {
    a++;
	intObj++;
	System.out.println("Inside Function:"+a+"Object Value-"+intObj);
}
}