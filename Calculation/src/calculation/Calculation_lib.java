package calculation;

public class Calculation_lib {
	
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getPlus(){ //�����Z�����A���ʂ�Ԃ��֐�
		return m + n;
	}
	public int getMinus(){ //�����Z
		return m - n;
	}
	public int getProduct(){ //�|���Z
		return m * n;
	}
	public int getDivide(){ //����Z
		return m / n;
	}
	public int getMod(){ //�]��
		return m % n;
	}
}