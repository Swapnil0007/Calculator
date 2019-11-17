package sub;

public class interestSimple {

	public static void main(String[] args) {
		int p,r,t;
		p=5000;
		r=3;
		t=2;
		int result = interest(p,r,t);
		System.out.println(" interest of entered integers = "+result);
	}
	private static int interest(int p, int r,int t) 
	{
		int q=(p*r*t)/100;
		return q;
}
}
