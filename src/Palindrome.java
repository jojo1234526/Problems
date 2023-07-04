
public class Palindrome {
	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		boolean result = pal.isPalindrome(121);
		System.out.println(result);
		
	}
	public boolean isPalindrome(int x) {
		// negative numbers cannot be palindroms -121 = 121- 
		// 0 is not a palindrome
		if(x < 0) return false;
		//we initalize reverse as an int ... this will be compared to our x at the end
		int reverse =0 ;
		//create a copy of int x 
		int copy = x;
		//while copy > 0 we are going to loop
		while(copy>0) {
			// int digit is the remainder of copy ex: 121/10 = 12.1 
			// 121%10 = 1 (The modulus is the remainder from the division ) 
			int digit = copy % 10;
			// reverse keep up with the tens place when we add another number to it
			// example: 1 * 10  + 2 
			reverse = reverse * 10 + digit;
			// easier way to say copy/10=copy
			copy/=10;
		}
		// here we return the result of this evaluation
		// we check to see if the numbers are the same 
		return reverse == x;
		}
	}

