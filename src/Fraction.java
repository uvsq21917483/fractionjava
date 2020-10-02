
public class Fraction {
	private int denom;
	private int nomer;
	
	public Fraction(int x,int y) {
		this.nomer=x;
		this.denom=y;
	}
	
	public int getden() {
		return denom;
	}
	public int getnom() {
		return nomer;
	}
	
public	String toString(Fraction x) {
	return x.nomer + "/" + x.denom;
}
}
