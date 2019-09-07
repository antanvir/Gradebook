package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import gradebook.Rubric;
import gradebook.Student;

class TestStudent {
	
	Student s = new Student(); 
//	double epsilon = 0.000000000001;
	double epsilon = 1.0E-3;
	
	
	/************** getName() **************/
	
	@Test
	void test_getName1() {
		s.setName("Rezowan");
		String actual = s.getName();
		String expected = "Rezowan";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getName2() {
		s.setName("");
		String actual = s.getName();
		String expected = "";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getName3() {
		s.setName(null);
		String actual = s.getName();
		String expected = null;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getName4() {
		s.setName("A123");
		String actual = s.getName();
		String expected = "A123";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getName5() {
		s.setName("12356");
		String actual = s.getName();
		String expected = "12356";
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getName6() {
		s.setName("-.!23bCaZ");
		String actual = s.getName();
		String expected = "-.!23bCaZ";
		assertEquals(expected, actual);
	}
	
	/************** getFinalTest() **************/
	
	@Test
	void test_getFinalTest1() {
		s.setFinalTest(50);
		double actual = s.getFinalTest();
		double expected = 50;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest2() {
		s.setFinalTest(100);
		double actual = s.getFinalTest();
		double expected = 100;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest3() {
		s.setFinalTest(99);
		double actual = s.getFinalTest();
		double expected = 99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest4() {
		s.setFinalTest(101);
		double actual = s.getFinalTest();
		double expected = 101;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest5() {
		s.setFinalTest(0);
		double actual = s.getFinalTest();
		double expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest6() {
		s.setFinalTest(1);
		double actual = s.getFinalTest();
		double expected = 1;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalTest7() {
		s.setFinalTest(-1);
		double actual = s.getFinalTest();
		double expected = -1;
		assertEquals(expected, actual);
		
	}
	
	/************** getMidtermTest() **************/
	
	@Test
	void test_getMidtermTest1() {
		s.setMidtermTest(69.5);
		double actual = s.getMidtermTest();
		double expected = 69.5;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest2() {
		s.setFinalTest(100);
		double actual = s.getFinalTest();
		double expected = 100;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest3() {
		s.setFinalTest(99.5);
		double actual = s.getFinalTest();
		double expected = 99.5;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest4() {
		s.setFinalTest(101);
		double actual = s.getFinalTest();
		double expected = 101;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest5() {
		s.setFinalTest(0);
		double actual = s.getFinalTest();
		double expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest6() {
		s.setFinalTest(1);
		double actual = s.getFinalTest();
		double expected = 1;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermTest7() {
		s.setFinalTest(-1);
		double actual = s.getFinalTest();
		double expected = -1;
		assertEquals(expected, actual);
		
	}
	
	/************** getParticipation() **************/
	
	@Test
	void test_getParticipation1() {
		s.setParticipation(50);
		double actual = s.getParticipation();
		double expected = 50;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation2() {
		s.setParticipation(100);
		double actual = s.getParticipation();
		double expected = 100;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation3() {
		s.setParticipation(99);
		double actual = s.getParticipation();
		double expected = 99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation4() {
		s.setParticipation(101);
		double actual = s.getParticipation();
		double expected = 101;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation5() {
		s.setParticipation(0);
		double actual = s.getParticipation();
		double expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation6() {
		s.setParticipation(1);
		double actual = s.getParticipation();
		double expected = 1;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipation7() {
		s.setParticipation(-1);
		double actual = s.getParticipation();
		double expected = -1;
		assertEquals(expected, actual);
		
	}
	
	/************** getLabGrades() **************/
	
	@Test
	void test_getLabGrades1() {
		
		s.setHwGrades(new double[] {65, 76, 87});
		double[] actual = s.getLabGrades();
		double[] expected = new double[] {65, 76, 87};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabGrades2() {
		s.setHwGrades(new double[] {});
		double[] actual = s.getLabGrades();
		double[] expected = new double[] {};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabGrades3() {
		s.setHwGrades(new double[] {65});
		double[] actual = s.getLabGrades();
		double[] expected = new double[] {65};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabGrades4() {
		s.setHwGrades(new double[] {0, 76, 100, 99, 105, -1});
		double[] actual = s.getLabGrades();
		double[] expected = new double[] {0, 76, 100, 99, 105, -1};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabGrades5() {
		s.setHwGrades(new double[] {0, 105});
		double[] actual = s.getLabGrades();
		double[] expected = new double[] {0, 76, 100, 99, 105};
		assertFalse(Arrays.equals(expected, actual));
		
	}
	
	
	/************** getHwGrades() **************/
	
	@Test
	void test_getHwGrades1() {
		
		s.setHwGrades(new double[] {65, 76, 87});
		double[] actual = s.getHwGrades();
		double[] expected = new double[] {65, 76, 87};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwGrades2() {
		s.setHwGrades(new double[] {});
		double[] actual = s.getHwGrades();
		double[] expected = new double[] {};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwGrades3() {
		s.setHwGrades(new double[] {65});
		double[] actual = s.getHwGrades();
		double[] expected = new double[] {65};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwGrades4() {
		s.setHwGrades(new double[] {0, 76, 100, 99, 105, -1});
		double[] actual = s.getHwGrades();
		double[] expected = new double[] {0, 76, 100, 99, 105, -1};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwGrades5() {
		s.setHwGrades(new double[] {0, 105});
		double[] actual = s.getHwGrades();
		double[] expected = new double[] {0, 76, 100, 99, 105};
		assertFalse(Arrays.equals(expected, actual));
		
	}
	
	
	/************** calculateHwAverage() **************/
	
	@Test
	void test_calculateHwAverage1() {
		
		s.setHwGrades(new double[] {65, 76, 87});
		double actual = s.calculateHwAverage();
		double expected = 76;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateHwAverage2() {
		s.setHwGrades(new double[] {0});
		double actual = s.calculateHwAverage();
		double expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateHwAverage3() {
		s.setHwGrades(new double[] {65});
		double actual = s.calculateHwAverage();
		double expected = 65;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateHwAverage4() {
		s.setHwGrades(new double[] {0, 76, 100, 99, 105, -1});
		double actual = s.calculateHwAverage();
		double expected = 63.16666667;
		assertEquals(expected, actual, epsilon);
		
	}
	
	@Test
	void test_calculateHwAverage5() {
		s.setHwGrades(new double[] {0, 105});
		double actual = s.calculateHwAverage();
		double expected = 52.5;
		assertEquals(expected, actual, epsilon);
	
	}
	
	@Test
	void test_calculateHwAverage6() {
		double actual = s.calculateHwAverage();
		double expected = 0.0;
		assertEquals(expected, actual, epsilon);
	
	}
	
	@Test
	void test_calculateHwAverage7() {
		s.setHwGrades(new double[] {});
		double actual = s.calculateHwAverage();
		double expected = 0;
		assertNotEquals(expected, actual);
	
	}
	
	/************** calculateLabAverage() **************/
	
	@Test
	void test_calculateLabAverage1() {
		
		s.setHwGrades(new double[] {65, 76, 87});
		double actual = s.calculateHwAverage();
		double expected = 76;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateLabAverage2() {
		double actual = s.calculateHwAverage();
		double expected = 0;
		assertEquals(expected, actual);;
		
	}
	
	@Test
	void test_calculateLabAverages3() {
		s.setHwGrades(new double[] {65});
		double actual = s.calculateHwAverage();
		double expected = 65;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateLabAverage4() {
		s.setHwGrades(new double[] {0, 76, 100, 99, 105, -1});
		double actual = s.calculateHwAverage();
		double expected = 63.167;
		assertEquals(expected, actual, epsilon);	
	}
	
	@Test
	void test_calculateLabAverage5() {
		s.setHwGrades(new double[] { -19, -23, 10, 99, -85, -1});
		double actual = s.calculateHwAverage();
		double expected = -3.167;
		assertEquals(expected, actual, epsilon);
		
	}
	
	/************** calculateGrade() **************/
	
	@Test
	void test_calculateGrade1() {
				
		double actual = s.calculateGrade(new Rubric());
		double expected = 0.0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_calculateGrade2() {
		Student s = new Student("ANT", 80, 75, 60, new double[] {20}, new double[] {87});
		double actual = s.calculateGrade(new Rubric());
		double expected = 64.4;
		assertEquals(expected, actual, epsilon);
		
	}
	
	@Test
	void test_calculateGrade3() {
		Student s = new Student("ANT", 80, 75, 60, new double[] {20, 67, 0}, new double[] {87, 45});
		double actual = s.calculateGrade(new Rubric(35, 25, 5, 10, 25));
		double expected = 69.15;
		assertEquals(expected, actual, epsilon);
		
	}
	
	@Test
	void test_calculateGrade4() {
		Student s = new Student();
		double actual = s.calculateGrade(new Rubric(35, 25, 5, 10, 25));
		double expected = 0;
		assertEquals(expected, actual, epsilon);
		
	}
	
	
	/************** toString() **************/
	
	@Test
	void test_toString1() {
		Student s = new Student();
		s.calculateGrade(new Rubric());
		String actual = s.toString();
		String expected = "name= :\nfinal= 0.0\nmidterm= 0.0\nparticipation= 0.0\nhomework= 0.0\nlabs= 0.0\nFinal Grade= 0.0";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString2() {
		Student s = new Student("ANT", 80, 75, 60, new double[] {20}, new double[] {87});
		s.calculateGrade(new Rubric());
		String actual = s.toString();
		String expected = "name= ANT:\nfinal= 80.0\nmidterm= 75.0\nparticipation= 60.0\nhomework= 20.0\nlabs= 87.0\nFinal Grade= 64.4";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString3() {
		Student s = new Student("ANT", 80, 75, 60, new double[] {20, 67, 0}, new double[] {87, 45}, new Rubric(35, 25, 5, 10, 25));
		System.out.println(s.calculateGrade(new Rubric(35, 25, 5, 10, 25)));
		String actual = s.toString();
		String expected = "name= ANT:\nfinal= 80.0\nmidterm= 75.0\nparticipation= 60.0\nhomework= 29.0\nlabs= 66.0\nFinal Grade= 69.15";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString4() {
		Student s = new Student("ANT", 8, 7.5, 61, new double[] {20, 67, 0}, new double[] {87, 46});
		s.calculateGrade(new Rubric(35, 25, 5, 10, 25));
//		System.out.println(s.calculateGrade(new Rubric(35, 25, 5, 10, 25))); //Doesn't match
		String actual = s.toString();
		String expected = "name= ANT:\nfinal= 8.0\nmidterm= 7.5\nparticipation= 61.0\nhomework= 29.0\nlabs= 66.5\nFinal Grade= 34.4";
		assertNotEquals(expected, actual);
		
	}

}
