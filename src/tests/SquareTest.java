/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${1/26/2022}
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Square;



public class SquareTest {
	
	Square sQ1 = new Square(4);
	Square sQ2 = new Square(13);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void SquarePerimeterTest() {
		double perim = sQ1.perimeter();
		assertEquals(16, perim, 0.0);
	}
	
	@Test
	public void SquareAreaTest() {
		double area = sQ1.area();
		assertEquals(16, area, 0.0);
	}

	@Test
	public void SquarePerimeterTest2() {
		double perim = sQ2.perimeter();
		assertEquals(52, perim, 0.0);
	}
	
	@Test
	public void SquareAreaTest2() {
		double area = sQ2.area();
		assertEquals(169, area, 0.0);
	}

}
