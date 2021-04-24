package task2;

public class Shape {
	private String color;
	private Boolean filled ;
	
	public Shape(){
		this.color = "green";
		this.filled = true;
	}
	
	public Shape(String c, Boolean f){
		this.color = c;
		this.filled = f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean isFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	public String toString(){
		return  "A Shape with color of "+getColor()+" and "+isFilled();
	}
	
}
