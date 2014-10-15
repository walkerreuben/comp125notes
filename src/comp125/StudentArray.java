package comp125;

public class StudentArray {

	private Student[] students;
	private int numStudents;

	public StudentArray(int size) {
		students = new Student[size];
		numStudents = 0;
	}

	public void AddStudent(Student aStudent) {
		if (numStudents < students.length) {
			students[numStudents] = aStudent;
			numStudents++;
		}
	}

	public int getNumStudents() {
		return numStudents;
	}

	public Student getAt(int i) {
		return students[i];
	}

	public double average() {
		double sum = 0.0;
		for (int i = 0; i < numStudents; i++)
			sum += students[i].getMark();
		return sum / numStudents;
	}

}