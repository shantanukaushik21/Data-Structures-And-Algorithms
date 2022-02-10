package ImportantConcepts;

public class Student implements Comparable<Student> {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int compareTo(Student student) {
		if(this.rollno!=student.rollno) {
			return this.rollno-student.rollno;
		}
		return this.name.compareTo(student.name);
	}
	
}
