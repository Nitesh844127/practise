package oopsConcepts;

	class Student{
		String name;
		int age;
		public void info(){
			System.out.println(this.name);
			System.out.println(this.age);
		}

		Student(String name, int age){
			this.name=name;
			this.age=age;
		}

	}

public class ParameterizedConstructor {
		public static void main(String[] args){

			Student s1=new Student("Nitesh",24);
			s1.info();
		}
}
