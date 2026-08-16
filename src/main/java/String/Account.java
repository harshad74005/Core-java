package String;

public class Account {

	public static void main(String[] args) {
		String s1 =new String("harshad");
//		s1.replace("v", "h");
		System.out.println(s1);
		
		String s2 =new String("harshad");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length()); // for count length 
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		StringBuilder s3 =new  StringBuilder("Rupesh");
		
	}
}
