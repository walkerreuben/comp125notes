package comp125;

public class Person {

	private String firstname;
	private String lastname;
	private Person mother;
	private Person father;
	
	public Person(String first, String last) {
		firstname = first;
		lastname = last;
	}
	
	public void setMother(Person mum) {
		if (mum != this)
			mother = mum;
	}
	
	public void setFather(Person dad) {
		if (dad != this)
			father = dad;
	}
	
	public void printTree(String indent) {
		
		System.out.println(indent + "---------------------");
		System.out.println(indent + firstname + " " + lastname);
		System.out.println(indent + "---------------------");
		
		
		if (mother != null) {
			System.out.println(indent + firstname + "'s Mother: ");
			mother.printTree(indent + "      ");
		}
		
		if (father != null) {
			System.out.println(indent + firstname + "'s Father: ");
			father.printTree(indent + "      ");
		}
	}
	
}