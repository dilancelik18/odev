package homeework1;

public class Student {

	public void addToStudent(Course course) {
		System.out.println("ogrenci " + course.id + " nolu  Kursa eklendi. ");
	}

	public void chooseManager(CourseManager manager) {
		System.out.println(manager.id + " bu e�itmen dersi verecek");
	}
}
