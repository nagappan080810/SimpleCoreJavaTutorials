/****************************************
**InheritanceWithInitializerBlock
****Understand initialization and constructor chaining through printing statements.***
****************************************/
import java.util.Arrays;
public class InheritanceWithInitializerBlock {

public static void main(String args[]) {
	Child child = new Child();
}

static class Parent {
    Parent() {
		System.out.println("Parent Constructor invoked");
	}
	{
		System.out.println("Parent Instance Initialization");
	}
	static {
		System.out.println("Static Parent Instance Initialization");
	}
}

static class Child extends Parent {
	Child() {
		System.out.println("Child Constructor invoked");
	}
	{
		System.out.println("Child Instance Initialization");
	}
	static {
		System.out.println("Static Child Instance Initialization");
	}
}
}