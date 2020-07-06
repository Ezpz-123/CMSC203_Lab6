package _solution;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook gradebook1 = new GradeBook(5);
	GradeBook gradebook2 = new GradeBook(5);

	@BeforeEach
	void setUp() throws Exception {
		gradebook1.addScore(9);
		gradebook1.addScore(8);
		gradebook1.addScore(3);
		
		gradebook2.addScore(1);
		gradebook2.addScore(10);
		gradebook2.addScore(5);
	}

	@After
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testaddScore() {
		assertTrue(gradebook1.toString().equals("9.0 8.0 3.0 "));
		assertTrue(gradebook2.toString().equals("1.0 10.0 5.0 "));
		
		assertEquals("Grade book 1 score size = " + gradebook1.getScoreSize(),3,gradebook1.getScoreSize());
		assertEquals("Grade book 2 score size = " + gradebook2.getScoreSize(),3,gradebook2.getScoreSize());
	}
	
	@Test
	void testSum() {
		assertEquals(20,gradebook1.sum(),0.0001);
		assertEquals(16,gradebook2.sum(),0.0001);
		
	}

	@Test
	void testminimum() {
		assertEquals(3,gradebook1.minimum(),0.001);
		assertEquals(1,gradebook2.minimum(),0.001);
	}
	
	@Test
	void testfinalScore() {
		assertEquals(17,gradebook1.finalScore(),0.1);
		assertEquals(15,gradebook2.finalScore(),0.1);
	}
}
