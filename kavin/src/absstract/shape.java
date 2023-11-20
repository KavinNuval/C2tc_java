package absstract;
public class shape extends sq {
	private float side;
	
	public void sq() {
		side=2.0f;
	}
	public void sq(float side) {
		this.side=side;
	}
	void calArea() {
		super.area=side*side;
		
	}
	public String toString() {
		return "Square [side=" + side + "]";
	}
}

