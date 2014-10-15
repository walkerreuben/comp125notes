package comp125;

public class Week6LectureOne {

	/**
	 * @author Reuben Walker
	 */
	public static void main(String[] args) {
		/*
		 * Conclusion of Topic "Arrays of Objects and Searching"
		 * This first hour is the conclusion of material testable for the mid-term test.
		 * Anything after this won't be in the test.
		 * 
		 * The mid-semester test will be held at 1 pm on Wed 17 September in Mason Theatre. Same spot and time as the usual lecture.
		 * Resources are available on iLearn listed under Week 6.
		 * 
		 * This unit has 230 students enrolled.
		 * 
		 * Our main example last week was an array of students.
		 * The file Student.java can be found on iLearn, as well as what I wrote last week.
		 * 
		 * The design was corrected slightly on Friday. I should watch the lecture for that.
		 * 
		 * We can design a class for a student array, including some appropriate methods and use that class in developing the final
		 * application.
		 * With this slightly more object oriented approach we obtain a class for student array which could potentially be adapted to
		 * multiple uses.
		 */

		StudentArray myUnit = new StudentArray(20);
		Student theStudent = new Student("Adams", 69.0);
		myUnit.AddStudent(theStudent);
		theStudent = new Student("Hodges", 74.0);
		myUnit.AddStudent(theStudent);
		theStudent = new Student("Peterson", 68.0);
		myUnit.AddStudent(theStudent);
		for (int i = 0; i < myUnit.getNumStudents(); i++)
			System.out.println(myUnit.getAt(i).getName() + " obtained " + myUnit.getAt(i).getMark());

	}

}
