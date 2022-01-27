/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${1/26/2022}
 */
package model;
import java.lang.Math;

public class Square implements Measurements {

	private double side;
	
	public Square() {
		this.setSide(0);
	}
	public Square(double sides) {
		this.setSide(sides);
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	
	@Override
	public double perimeter() {
		final int SQ_PERIMETER_NUM = 4;
		return SQ_PERIMETER_NUM * this.getSide();
	}

	@Override
	public double area() {
		final int SQ_AREA_NUM = 2;
		return Math.pow(this.getSide(), SQ_AREA_NUM);
	}
	
}
