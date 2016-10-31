package calculation;

public class Calculation_lib {
	
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getPlus(){ //‘«‚µZ‚ğ‚µAŒ‹‰Ê‚ğ•Ô‚·ŠÖ”
		return m + n;
	}
	public int getMinus(){ //ˆø‚«Z
		return m - n;
	}
	public int getProduct(){ //Š|‚¯Z
		return m * n;
	}
	public int getDivide(){ //Š„‚èZ
		return m / n;
	}
	public int getMod(){ //—]‚è
		return m % n;
	}
}