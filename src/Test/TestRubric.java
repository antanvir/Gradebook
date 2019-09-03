package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gradebook.Rubric;

class TestRubric {
	
	Rubric r = new Rubric();
	
	
	/************** getMidtermWorth() **************/

	@Test
	void test_getMidtermWorth1() {
		r.setMidtermWorth(150);
		double actual = r.getMidtermWorth();
		double expected = 1.50;
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
	
	/************** getFinalWorth() **************/


}
