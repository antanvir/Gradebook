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
	
/************** getLabWorth() **************/
	
	@Test
	void test_getLabWorth1() {
		r.setMidtermWorth(125);
		double actual = r.getMidtermWorth();
		double expected = 1.25;
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



}
