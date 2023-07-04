
public class fibonaccii {
	public static void main(String[] args) {
		fibonaccii fib = new fibonaccii();
		// interestingly you don't use a print statement here and 
		// if you use a print statement, you get an error, why? 
		// The reason is that System.out.println requires a value to print, but
		// fib.fibonacci(10) does not return a value
		fib.fibonacci(10);
		
	}
	public void fibonacci(int x) {
		int a =0;
		int b=1;
		for(int i = 0; i<x;i++) {
			System.out.print(a + " ");
			int fib=a+b;
			a=b;
			b=fib;
		}
	}
}
