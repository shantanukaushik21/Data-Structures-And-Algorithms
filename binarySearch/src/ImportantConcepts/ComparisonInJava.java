package ImportantConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ComparisonInJava {
	public static void main(String[] args) {
		Student s1=new Student("Shantanu",1);
		Student s2=new Student("karan",33);
		Student s3=new Student("ojasva",22);
		Student s4=new Student("Rahul",2);
		Student s5=new Student("Hero",9);
		Student s6=new Student("Achit",100);
//		List<Student> list=new ArrayList<>();
		Student[] students = {s1,s2,s3,s4,s5,s6};
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	}
	
	
}
