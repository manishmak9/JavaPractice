package string;

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
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
	}

	public static void main(String[] args) {
		
		System.out.println(Palindrome.isPalindrome2("madam"));
	}

}
