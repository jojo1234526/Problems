
// Here is our public class
// this class is the blueprint for our object str 
// str is an object of the class Shared String it is an instance! 
public class SharedString {
	
	// here we have our main method 
	// this is the entry point of our application 
	// the JVM look for this method to start executing our code 
	// static = method belongs to class itself  NOT  an instance of the class
	// void means returns nothing 
	// main means the type of method 
	// main is a keyword for the Java Virtual Machine to enter 
	// so that we can compile our code to bytecode and then Machine Code 
	// String[] args is the parameters the method takes
	// This is an array of String objects and is used to pass command line arugments 
	// to our application 
	public static void main(String[] args) {
		
		SharedString str = new SharedString();
		String strs [] = { "flowers", "flow", "flight"};
		String result = str.longestCommonPrefix(strs);
		System.out.println(result);
		
	}
	
	// here is our non static method, which takes in the parameter String array named strs
	// this will then return a String 
	// this method is public meaning it is globally accessible 
	public String longestCommonPrefix(String[] strs) {
		// if statement which check if there is even an element in strs
		// if there is not an element( i.e. nothing) (i.e. means id est, means that is) 
		// return blank 
		if(strs.length == 0) return "";
		// imagine we have these string { "flowers", "flow", "flight" } 
		// this line sets the length of flowers which is 6 
		int length = strs[0].length();
		// this now starts at i=1 and while i < 6, you add i++ incrementally by one 
		for(int i=1; i < strs.length; i++) {
			// this line sets length to the smallest word
			length = Math.min(length, strs[i].length());
			// while j is less then the value of length, increment j 
			for(int j = 0; j<length; j++) {
				// this line pulls the character of the string flowers from position
				// j(0)... so this would pull the f position character
				char c = strs[0].charAt(j);
				// this line pulls the character of the string flow from the position
				// j (0) which would also be f 
				char d = strs[i].charAt(j);
				
				// this if statement checks to see if the lengths are equal
				// if the lengths are not equal
				if(c!=d) {
					// length is reassigned a new value to that of 4 
					// 4== flowers == flow... these 4 characters are the same
					length= j;
					// then this break statement breaks the look and goes 
					// to the top for loop to go through the next word 
					// flight will then be compared to flowers 
					// the length will be reassined to 2 flowers flight 
					// fl fl is the common prefix 
					break; 
				}
				
			}
			
		}
		// this will return the substring from position 0 to position length 
		// in this case fl will be returned 
		// so what this is saying is this...
		//for the first word, return positions 0-2
		return strs[0].substring(0, length);
		
	}

}
