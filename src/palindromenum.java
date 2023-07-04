
public class palindromenum {
	public static void main(String[] args) {
		palindromenum pal = new palindromenum();
		System.out.println(pal.isPalindrome(121));
		
	}
	public boolean isPalindrome(int x) {
		if(x<0) return false;
		int reverse = 0;
		int copy = x;
		while(copy >0) {
			int digit = copy %10;
			reverse = reverse * 10 + digit;
			copy/=10;
		}
		return reverse==x;
	}

}
