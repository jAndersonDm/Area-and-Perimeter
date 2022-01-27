/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${1/26/2022}
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Rectangle;

public class RectangleTest {
	
	Rectangle rec1 = new Rectangle(30.4, 15);
	Rectangle rec2 = new Rectangle(55, 31);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void RectanglePerimeterTest() {
		double perim = rec1.perimeter();
		assertEquals(90.8, perim, 0.0);
	}
	
	@Test
	public void RectangleAreaTest() {
		double area = rec1.area();
		assertEquals(456, area, 0.0);
	}
	
	@Test
	public void RectanglePerimeterTest2() {
		double perim = rec2.perimeter();
		assertEquals(172, perim, 0.0);
	}
	
	@Test
	public void RectangleAreaTest2() {
		double area = rec2.area();
		assertEquals(1705, area, 0.0);
	}

}
