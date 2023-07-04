
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		fib.Fibon(10);
		
	}
	public void Fibon(int fib) {
		int a=0;
		int b=1;
		for(int i =0; i<fib; i++) {
			int fibonacci=a+b;
			a=b;
			b=fibonacci;
			System.out.println(fibonacci);
		}
	}

}
