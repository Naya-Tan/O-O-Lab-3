package Naya_Tan_Lab3;

public class Die {
	
	private int face; 
	public final int numSides;
	
	public Die() {
		numSides = 6;
	}
	
	public Die(int sides) {
		this.numSides = sides;
	}

	// returns result of roll as an integer
	public void roll(){
		this.face = (int)(Math.random() * numSides) + 1;
	}
	
	// returns the face 
	public int getFace() {
		return this.face;
	}
	
	// returns a string that states the number of sides and current face value 
	public String toString() {
		return ("The number of sides is " + numSides + " and the current face is " + face);
	}
	
}
