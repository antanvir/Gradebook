package gradebook;

import java.util.ArrayList;
import java.util.HashMap;

public class SemesterCourses {
	private int semesterNo;
	private String courseID;
	private int courseCredit;
//	private SemesterCourses[] courses;
	private ArrayList<String> teachers;
	private HashMap<String, Integer> courses;

	
	public SemesterCourses() {
		semesterNo = -1;
		courseID = "";
		teachers = new ArrayList<String>();
		courses = new HashMap<>();
		
	}
	
	public void setSemesterNo(int num) {
		semesterNo = num;
	}
	
	public int getSemesterNo() {
		return semesterNo;
	}
	
	public void addTeacher(String name) {
		teachers.add(name);
	}
	
	public String getNewlyAddedTeacher() {
		if(teachers.size() >= 1)
			return teachers.get(teachers.size()-1);
		else
			return "No Teacher Added";
	}
	
	public ArrayList<String> getTeachersList() {
		return teachers;
	}
	
	public void addCoursesAndCredits(String id, int credit) {
		courses.put(id, credit);
	}
	
	public int findCreditByCourseId(String id) {
		if(courses.containsKey(id))
			return courses.get(id);
		else
			return Integer.MIN_VALUE;
	}
	
	public HashMap<String, Integer> FindAllCoursesWithCredit() {
		return courses;
	}
	
	public String findGrade (Student std, Rubric data) {
		double marks = std.calculateGrade(data);
		String grade = "";
		if(marks < -1.0) grade = "invalid";
		else if(marks < 40.0) grade = "F";
		else if(marks < 50.0) grade = "D";
		else if(marks < 60.0) grade = "C";
		else if(marks < 70.0) grade = "B";
		else if(marks < 80.0) grade = "A";
		else if(marks > 100.0) grade = "invalid";
		else grade = "A+";
		
		return grade;	
	}
	
	public double calculateGPA (Student std, Rubric data) {
		double marks = std.calculateGrade(data);
		double grade;
		
		if(marks < -1.0 || marks > 100.0) grade = -1.0;
		else if(marks < 40.0) grade = 0.0;
		else if(marks < 50.0) grade = 1.0;
		else if(marks < 60.0) grade = 2.0;
		else if(marks < 70.0) grade = 3.0;
		else if(marks < 80.0) grade = 4.0;
		else grade = 5.0;
		
		return grade;	
	}
	
}
