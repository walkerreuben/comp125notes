package comp125;
public class Student {

		private String name;
		private double mark;

		public Student() {
			name = "";
			mark = 0.0;
		}

		public Student(String name, double mark) {
			setName(name);
			setMark(mark);
		}

		public void setMark(double mark2) {
			mark = mark2;
		}

		public void setName(String name2) {
			name = name2;
		}

		public String getName() {
			return name;
		}

		public double getMark() {
			return mark;
		}


}
