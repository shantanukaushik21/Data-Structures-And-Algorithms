package ImportantConcepts;

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
		
		
		
		Employee e1=new Employee(6,"Anish");
		Employee e2=new Employee(4,"ojasva");
		Employee e3=new Employee(2,"savita");
		Employee e4=new Employee(1,"shantanu");
		Employee e5=new Employee(75,"rohit");
		Employee e6=new Employee(2,"Archit");
		Employee e7=new Employee(2,"karan");
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		Collections.sort(list, new sortById());
		System.out.println(list);
		
	}
	
	
}


class Employee {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	
}

class sortById implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.id!=emp2.id) {
			return emp1.id-emp2.id;
		}
		return emp2.name.compareTo(emp1.name);
	}
	
}
