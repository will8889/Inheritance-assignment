package assignment1;

public class Square extends Rectangle {
	private double side;
	
	public Square() {
		super();
		side = 1.0;
	}
	
	public Square(double side) {
		super(side, side);
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
		this.side = side;
	}
	

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getWidth() {
		return super.getWidth();
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public double getLength() {
		return super.getLength();
	}

	public void setLength(double side) {
		super.setLength(side);
	}
}
