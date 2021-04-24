package task2;

public class Square extends Rectangle{
	
	public Square() {
		 super(); // Call superclass Rectangle(double, double)
	}
	
	public Square(double side) {
		 super(side, side); // Call superclass Rectangle(double, double)
	}
	
	public Square(double side, String c, Boolean f) {
		 super(side, side,c,f); // Call superclass Rectangle(double, double)
	}
	
	public double getSide(){
		return super.getWidth();
	}
	
	public void setSide(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setLength(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getArea(){
		return getSide()*getSide();
	}
	
	public double getPerimeter(){
		return 4*getSide();
	}
	
	public String toString(){
		return "A Square with side="+ getSide()+", which is a subclass of "+super.toString();
	}
}
