package task2;

public class Circle extends Shape{
	private double radius;

	public Circle(){
		this.radius = 1.0;
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	public Circle(double r, String c, Boolean f){
		this.radius = r;
		super.setColor(c);
		super.setFilled(f);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	public String toString(){
		return "A Circle with radius="+ getRadius() +", which is a subclass of "+ super.toString();
	}
}
