/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${1/26/2022}
 */
package model;


public class Rectangle implements Measurements {
	
	private double length;
	private double width;
	
	public Rectangle() {
		this.setLength(0);
		this.setWidth(0);
	}
	public Rectangle(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double perimeter() {
		final int REC_PERIMETER_NUM = 2;
		return REC_PERIMETER_NUM * (this.getLength() + this.getWidth());
	}

	@Override
	public double area() {
		return this.getLength() * this.getWidth();
	}

}
