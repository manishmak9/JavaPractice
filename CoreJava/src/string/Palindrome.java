package string;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome1(String str) {
		
		if(str==null) 
			return false;
		
		StringBuffer strb= new StringBuffer(str.toLowerCase());
		strb.reverse();
		System.out.println(strb);
		return strb.toString().equals(str);
		
	}
	
	public static boolean isPalindrome2(String str) {
		if (str == null)
            return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");		
		String s= sc.next();
		
		System.out.println(Palindrome.isPalindrome2(s)?s+" is a palindrome word.":s+" is not a palindrome word.");
	}

}
