package string;

public class RemoveCharacter {
	
	public static String removeCharacterUsingReplaceAll(String str,char c) {
		return str.replaceAll(Character.toString(c), "");
	}

	public static void main(String[] args) {
		System.out.println(RemoveCharacter.removeCharacterUsingReplaceAll("String",'r'));

	}

}
