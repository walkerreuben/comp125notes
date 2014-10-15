package comp125;

public class Week4LectureOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * An interface describes what we can do to and with an instance of a
		 * class. This is the external, public view of a class (object). The
		 * interface might not reveal anything about how an object of the class
		 * works internally Examples of classes (or objects) that we have seen:
		 * The object System.out, which is of class (type) PrintStream
		 * The class String
		 * 
		 * We can represent an object of a class by means of a simple hypothetical card with three sections:
		 * The top section has the name of the class
		 * The middle section suggests how the internal data is stored
		 * And the bottom section lists some of the available methods.
		 * 
		 * As we know, String is a built in class for handling sequences of characters.
		 * We can think of it as a Java type, just like int, etc. But String is a non-primitive type.
		 * Inside, it stores a sequence of characters (how, we don't care)
		 * The interface provides a number of operations on the character sequence
		 * 
		 * String stores arrays of char type that can easily be referenced and converted. ???
		 * 
		 * Classes are the most important language feature that makes object-oriented programming possible.
		 * 
		 * Strings can be initialized using String lecturer2 = new String("Steve");
		 * 
		 * Using the new method is generally how we create instances. More info later in the lecture.
		 * 
		 * Each class is defined in a separate file with the same name and ending with .java
		 * All Java class definitions are separate files in the same folder (for now).
		 * 
		 * So far all variables and methods we've made so far have been public. They can also be private.
		 * 
		 * When a local variable is declared, it is not necessarily given a default value.
		 * However, instance variables are automatically initialized to default values when an object of the class is created.
		 * Fore example, an instance variable of type int is given the default value of 0.
		 * And an instance variable of type String or any class type is given the default value null. More about null later.
		 */
	}

}
