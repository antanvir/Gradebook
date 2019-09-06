package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gradebook.Rubric;

class TestRubric {
	
	Rubric r = new Rubric();
	
	
	/************** getMidtermWorth() **************/

	@Test
	void test_getMidtermWorth1() {
		r.setMidtermWorth(101);
		double actual = r.getMidtermWorth();
		double expected = 1.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth2() {
		r.setMidtermWorth(100);
		double actual = r.getMidtermWorth();
		double expected = 1.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth3() {
		r.setMidtermWorth(55);
		double actual = r.getMidtermWorth();
		double expected = 0.55;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth4() {
		r.setMidtermWorth(0);
		double actual = r.getMidtermWorth();
		double expected = 0.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth5() {
		r.setMidtermWorth(-1);
		double actual = r.getMidtermWorth();
		double expected = -0.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth6() {
		r.setMidtermWorth(99);
		double actual = r.getMidtermWorth();
		double expected = 0.99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getMidtermWorth7() {
		r.setMidtermWorth(1);
		double actual = r.getMidtermWorth();
		double expected = 0.01;
		assertEquals(expected, actual);
		
	}
	
	/************** getFinalWorth() **************/
	
	@Test
	void test_getFinalWorth1() {
		r.setMidtermWorth(101);
		double actual = r.getMidtermWorth();
		double expected = 1.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth2() {
		r.setMidtermWorth(100);
		double actual = r.getMidtermWorth();
		double expected = 1.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth3() {
		r.setMidtermWorth(49);
		double actual = r.getMidtermWorth();
		double expected = 0.49;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth4() {
		r.setMidtermWorth(0);
		double actual = r.getMidtermWorth();
		double expected = 0.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth5() {
		r.setMidtermWorth(-1);
		double actual = r.getMidtermWorth();
		double expected = -0.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth6() {
		r.setMidtermWorth(99);
		double actual = r.getMidtermWorth();
		double expected = 0.99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getFinalWorth7() {
		r.setMidtermWorth(1);
		double actual = r.getMidtermWorth();
		double expected = 0.01;
		assertEquals(expected, actual);
		
	}
	
	/************** getHwWorth() **************/
	
	@Test
	void test_getHwWorth1() {
		r.setMidtermWorth(110);
		double actual = r.getMidtermWorth();
		double expected = 1.1;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth2() {
		r.setMidtermWorth(100);
		double actual = r.getMidtermWorth();
		double expected = 1.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth3() {
		r.setMidtermWorth(50);
		double actual = r.getMidtermWorth();
		double expected = 0.5;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth4() {
		r.setMidtermWorth(0);
		double actual = r.getMidtermWorth();
		double expected = 0.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth5() {
		r.setMidtermWorth(-1);
		double actual = r.getMidtermWorth();
		double expected = -0.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth6() {
		r.setMidtermWorth(99);
		double actual = r.getMidtermWorth();
		double expected = 0.99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getHwWorth7() {
		r.setMidtermWorth(0.75);
		double actual = r.getMidtermWorth();
		double expected = 0.0075;
		assertEquals(expected, actual);
		
	}
	
	/************** getParticipationWorth() **************/
	
	@Test
	void test_getParticipationWorth1() {
		r.setMidtermWorth(111);
		double actual = r.getMidtermWorth();
		double expected = 1.11;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth2() {
		r.setMidtermWorth(100);
		double actual = r.getMidtermWorth();
		double expected = 1.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth3() {
		r.setMidtermWorth(62);
		double actual = r.getMidtermWorth();
		double expected = 0.62;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth4() {
		r.setMidtermWorth(0);
		double actual = r.getMidtermWorth();
		double expected = 0.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth5() {
		r.setMidtermWorth(-2);
		double actual = r.getMidtermWorth();
		double expected = -0.02;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth6() {
		r.setMidtermWorth(99);
		double actual = r.getMidtermWorth();
		double expected = 0.99;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getParticipationWorth7() {
		r.setMidtermWorth(1);
		double actual = r.getMidtermWorth();
		double expected = 0.01;
		assertEquals(expected, actual);
		
	}
	
	/************** getLabWorth() **************/
	
	@Test
	void test_getLabWorth1() {
		r.setMidtermWorth(101);
		double actual = r.getMidtermWorth();
		double expected = 1.01;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth2() {
		r.setMidtermWorth(100);
		double actual = r.getMidtermWorth();
		double expected = 1.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth3() {
		r.setMidtermWorth(55);
		double actual = r.getMidtermWorth();
		double expected = 0.55;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth4() {
		r.setMidtermWorth(0);
		double actual = r.getMidtermWorth();
		double expected = 0.00;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth5() {
		r.setMidtermWorth(-0.5);
		double actual = r.getMidtermWorth();
		double expected = -0.005;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth6() {
		r.setMidtermWorth(99.5);
		double actual = r.getMidtermWorth();
		double expected = 0.995;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_getLabWorth7() {
		r.setMidtermWorth(0.5);
		double actual = r.getMidtermWorth();
		double expected = 0.005;
		assertEquals(expected, actual);
		
	}
	
	/************** toString() **************/
	
	@Test
	void test_toString1() {
		
		String expected = "Grading Rubric:\nFinal is worth= 20.0%\nMidterm is worth= 20.0%\nParticipation is worth= 20.0%" 
				+ "\nHomework is worth= 20.0%\nLabs are worth= 20.0%";
				
		String actual = r.toString();
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString2() {
		r.setFinalWorth(25);
		r.setHwWorth(10);
		r.setLabWorth(25);
		String actual = r.toString();

		String expected = "Grading Rubric:\nFinal is worth= 25.0%\nMidterm is worth= 20.0%\nParticipation is worth= 20.0%" 
				+ "\nHomework is worth= 10.0%\nLabs are worth= 25.0%";
				
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString3() {
		r.setFinalWorth(35);
		r.setHwWorth(10);
		r.setLabWorth(25);
		r.setParticipationWorth(5);
		r.setMidtermWorth(25);
		String actual = r.toString();

		String expected = "Grading Rubric:\nFinal is worth= 35.0%\nMidterm is worth= 25.0%\nParticipation is worth= 5.0%" 
				+ "\nHomework is worth= 10.0%\nLabs are worth= 25.0%";
				
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_toString4() {
		r.setFinalWorth(35);
		
		String actual = r.toString();

		String expected = "Grading Rubric:\nFinal is worth= 35.0%\nMidterm is worth= 20.0%\nParticipation is worth= 20.0%" 
				+ "\nHomework is worth= 20.0%\nLabs are worth= 20.0%";
				
		assertEquals(expected, actual);
		
	}
	
//	@Test
//	void test_toString5() {
//		Rubric r = new Rubric(30, 20, 20, 20, 20);
//		
//		String actual = r.toString();
//
//		String expected = "Grading Rubric:\nFinal is worth= 20.0%\nMidterm is worth= 20.0%\nParticipation is worth= 10.0%" 
//				+ "\nHomework is worth= 5.0%\nLabs are worth= 20.0%";
//				
//		assertEquals(expected, actual);
//		
//	}
//
//	@Test
//	void test_toString6() {
//		Rubric r = new Rubric(20, 20, 10, 5, 20);
//		
//		String actual = r.toString();
//		
//		String expected = "Grading Rubric:\nFinal is worth= 20.0%\nMidterm is worth= 20.0%\nParticipation is worth= 10.0%" 
//				+ "\nHomework is worth= 5.0%\nLabs are worth= 20.0%";
//		
//		assertEquals(expected, actual);
//		
//	}
	
	@Test
	void test_toString7() {
		Rubric r = new Rubric(20, 20, 20, 20, 20);
		
		String actual = r.toString();

		String expected = "Grading Rubric:\nFinal is worth= 20.0%\nMidterm is worth= 20.0%\nParticipation is worth= 20.0%" 
				+ "\nHomework is worth= 20.0%\nLabs are worth= 20.0%";
				
		assertEquals(expected, actual);
		
	}
	



}
