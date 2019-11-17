package Calculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=7;
		b=3;
		int result=subtraction(a,b);
		int s=addition(a,b);
		int g=multiplication(a,b);
		System.out.println("addition of entered integers = "+s);
		System.out.println("multiplication of entered integers = "+g);
		System.out.println("substraction of entered integers = "+result);
		
	}

		private static int multiplication(int h, int i) 
		{
		int j=h*i;
		return j;
	}


		private static int addition(int d, int e) 
		{
		int f=d+e;
		return f;
	       }


		public static int subtraction(int m,int n)
		{
		int p=m-n;
		return p;
		
		}
}



