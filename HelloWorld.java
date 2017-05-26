/****************************************
**Hello World Program
****It prints a string "Hello World"
*****It also prints the command line arguments length and its values****
****************************************/
import java.util.Arrays;
public class HelloWorld{

public static void main(String args[]) {
	//System.out.println("Hello World");
	System.out.println(args.length);
	//simple for loop
	for (int i=0;i<args.length;i++) {
	     System.out.println(args[i]);
    }
	//java-8 lambda expression
	Arrays.stream(args).parallel().forEach(arg->System.out.println("printed argument by lambda looping"+arg));	
}
}