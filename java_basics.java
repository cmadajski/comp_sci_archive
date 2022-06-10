import java.util.Arrays;
import java.util.ArrayList;

public static void main(String[] args) {
    System.out.println("Use this command to output text to the terminal.");
    // variables use camelCase, classes use PascalCase
	int num1 = 4;
	char char1 = 'a';
	double num2 = 12.65;
	boolean isTrue = true;
	// string literal assignment
	String someString = "this is a string";
	// string using constructor
	String anotherString = new String("this is another string");

	// enhanced for loop syntax; each element is an "item" from the Array/ArrayList "itemList"
	for (String item : itemList) {
		// do things
		}

}

public class GreatClass {
	// instance fields go here, make private for encapsulation (use getters/setters to manipulate data)
	private int someNum;
	private String name;
	private boolean isDumb;

	// constructor syntax
	public GreatClass(String name, int num, boolean isDumb) {
		this.name = name;
		this.someNum = num;
		this.isDumb = isDumb;
	}
	public void toString() {
		return "Name: " + this.name + " (" + this.someNum + ") Dumb = " + this.isDumb;
	}
}