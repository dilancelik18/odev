package homeework1;

public class Main {

	public static void main(String[] args) {
		CourseManager manager1 = new CourseManager();
		manager1.id = 1;
		manager1.name = "Ahmet";
		CourseManager manager2 = new CourseManager();
		manager2.id = 2;
		manager2.name = "Mehmet";

		Course course1 = new Course();
		course1.id = 22;
		course1.name = "java kursu";
		Course course2 = new Course();
		course2.id = 33;
		course2.name = "c# kursu";

		Student student1 = new Student();
		student1.addToStudent(course2);
		student1.chooseManager(manager1);

	}

}
