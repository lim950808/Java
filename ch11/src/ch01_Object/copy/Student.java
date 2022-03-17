package ch01_Object.copy;

public class Student {
	public String id;

	public Student(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id.equals(((Student)obj).id);
	}

}
