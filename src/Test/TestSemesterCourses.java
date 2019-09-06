package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import gradebook.Rubric;
import gradebook.SemesterCourses;
import gradebook.Student;

class TestSemesterCourses {

	SemesterCourses sc = new SemesterCourses();
	double epsilon = 1E-3;
	
	
	/************** getSemesterNo() **************/
	
	@Test
	void test_setSemesterNo1() {
		sc.setSemesterNo(1);
		int actual = sc.getSemesterNo();
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_setSemesterNo2() {
		int actual = sc.getSemesterNo();
		int expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_setSemesterNo3() {
		sc.setSemesterNo(0);
		int actual = sc.getSemesterNo();
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_setSemesterNo4() {
		sc.setSemesterNo(100);
		int actual = sc.getSemesterNo();
		int expected = 100;
		assertEquals(expected, actual);
	}
	
	/************** getNewlyAddedTeacher() **************/
	
	@Test
	void test_getNewlyAddedTeacher1() {
		String actual = sc.getNewlyAddedTeacher();
		String expected = "No Teacher Added";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getNewlyAddedTeacher2() {
		sc.addTeacher("Nafsan");
		String actual = sc.getNewlyAddedTeacher();
		String expected = "Nafsan";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getNewlyAddedTeacher3() {

		sc.addTeacher("");
		String actual = sc.getNewlyAddedTeacher();
		String expected = "";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getNewlyAddedTeacher4() {
		sc.addTeacher("Rez1");	sc.addTeacher("Pritom");	sc.addTeacher("Fuad");	
		String actual = sc.getNewlyAddedTeacher();
		String expected = "Fuad";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getNewlyAddedTeacher5() {

		sc.addTeacher(null);
		String actual = sc.getNewlyAddedTeacher();
		String expected = null;
		assertEquals(expected, actual);
	}
	
	
	/************** getTeachersList() **************/
	
	@Test
	void test_getTeachersList1() {
		String actual = sc.getNewlyAddedTeacher();
		String expected = "No Teacher Added";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getTeachersList2() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Nafsan");
		
		sc.addTeacher("Nafsan");
		ArrayList<String> actual = sc.getTeachersList();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getTeachersList3() {

		ArrayList<String> expected = new ArrayList<String>();
		expected.add("");
		
		sc.addTeacher("");
		ArrayList<String> actual = sc.getTeachersList();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getTeachersList4() {
		sc.addTeacher("Rez1");	sc.addTeacher("Pritom");	sc.addTeacher("Fuad");	
		ArrayList<String> actual = sc.getTeachersList();
		
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Rez1"); 	expected.add("Pritom");	expected.add("Fuad");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getTeachersList5() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add(null);
		
		sc.addTeacher(null);
		ArrayList<String> actual = sc.getTeachersList();
		
		assertEquals(expected, actual);
	}
	
	
	/************** findCreditByCourseId() **************/
	
	@Test
	void test_findCreditByCourseId1() {
		sc.addCoursesAndCredits("CSE 101", 3);
		int actual = sc.findCreditByCourseId("CSE 101");
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findCreditByCourseId2() {
		sc.addCoursesAndCredits("CSE 101", 3);
		int actual = sc.findCreditByCourseId("GE 502");
		int expected = Integer.MIN_VALUE;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findCreditByCourseId3() {
		sc.addCoursesAndCredits("CSE 101", 3);
		sc.addCoursesAndCredits("SE 203", 4);
		sc.addCoursesAndCredits("GE 106", 2);
		
		int actual = sc.findCreditByCourseId("SE 203");
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findCreditByCourseId4() {
		sc.addCoursesAndCredits("", -1);
		
		int actual = sc.findCreditByCourseId("");
		int expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findCreditByCourseId5() {
		sc.addCoursesAndCredits(null, 1);
		
		int actual = sc.findCreditByCourseId(null);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	/************** FindAllCoursesWithCredit() **************/
	
	@Test
	void test_FindAllCoursesWithCredit1() {
		HashMap<String, Integer> actual = sc.FindAllCoursesWithCredit();
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		assertEquals(expected, actual);
	}
	
	@Test
	void test_FindAllCoursesWithCredit2() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("SE 301", 4);
		
		sc.addCoursesAndCredits("SE 301", 4);
		HashMap<String, Integer> actual = sc.FindAllCoursesWithCredit();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_FindAllCoursesWithCredit3() {

		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("", 0);
		
		sc.addCoursesAndCredits("", 0);
		HashMap<String, Integer> actual = sc.FindAllCoursesWithCredit();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_FindAllCoursesWithCredit4() {
		sc.addCoursesAndCredits("101", 3);	sc.addCoursesAndCredits("CSE 105", 4);	sc.addCoursesAndCredits("", 2);	
		HashMap<String, Integer> actual = sc.FindAllCoursesWithCredit();
		
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("101", 3); 	expected.put("CSE 105", 4);	expected.put("", 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_FindAllCoursesWithCredit5() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put(null, -1);
		
		sc.addCoursesAndCredits(null, -1);
		HashMap<String, Integer> actual = sc.FindAllCoursesWithCredit();
		
		assertEquals(expected, actual);
	}
	
	/************** findGrade() **************/
	
	@Test
	void test_findGrade1() {
		Student s = new Student("", 80, 76, 89, new double[] {92, 86}, new double[] {83.5, 87});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "A+";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade2() {
		Student s = new Student("", 8, 7.6, 40, new double[] {33, 26}, new double[] {53.5, 17});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "F";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade3() {
		Student s = new Student("", 80, 76, 69, new double[] {72, 86}, new double[] {83.5, 67});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "A";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade4() {
		Student s = new Student("", 60, 66, 69, new double[] {72, 59}, new double[] {65.5, 67});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "B";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade5() {
		Student s = new Student("", 59, 60, 49, new double[] {52, 59}, new double[] {55.5, 57});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "C";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade6() {
		Student s = new Student("", 43, 56.5, 41, new double[] {42, 39}, new double[] {48, 47});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "D";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade7() {
		Student s = new Student("", 100, 103, 109, new double[] {99, 98}, new double[] {102.5, 107});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "invalid";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_findGrade8() {
		Student s = new Student("", -1, 46, 49, new double[] {-2, 51}, new double[] {45.5, 40});
		Rubric r = new Rubric();
		String actual = sc.findGrade(s, r);
		String expected = "F";
		assertEquals(expected, actual);
	}
	
	/************** calculateGPA() **************/
	
	@Test
	void test_calculateGPA1() {
		Student s = new Student("", 80, 76, 89, new double[] {92, 86}, new double[] {83.5, 87});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 5.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA2() {
		Student s = new Student("", 8, 7.6, 40, new double[] {33, 26}, new double[] {53.5, 17});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 0.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA3() {
		Student s = new Student("", 80, 76, 69, new double[] {72, 86}, new double[] {83.5, 67});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 4.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA4() {
		Student s = new Student("", 60, 66, 69, new double[] {72, 59}, new double[] {65.5, 67});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 3.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA5() {
		Student s = new Student("", 59, 60, 49, new double[] {52, 59}, new double[] {55.5, 57});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 2.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA6() {
		Student s = new Student("", 43, 56.5, 41, new double[] {42, 39}, new double[] {48, 47});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 1.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA7() {
		Student s = new Student("", 100, 103, 109, new double[] {99, 98}, new double[] {102.5, 107});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = -1.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_calculateGPA8() {
		Student s = new Student("", -1, 46, 49, new double[] {-2, 51}, new double[] {45.5, 40});
		Rubric r = new Rubric();
		double actual = sc.calculateGPA(s, r);
		double expected = 0.0;
		assertEquals(expected, actual);
	}
	
	
}
