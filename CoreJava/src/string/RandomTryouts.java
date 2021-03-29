package string;

public class RandomTryouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "Manish";
		
		char c[] = ss.toCharArray();
		
		String sss= new String ("Kumar");
		sss.getChars(1, 2, c, 3);
		
		System.out.println(sss);
		System.out.println(c);
		
		switch(ss) {
			case "Manish":{System.out.println("1"); }
			case "Kumar": {System.out.println("2"); }
			default: {}
		}
		
		
	}

}
