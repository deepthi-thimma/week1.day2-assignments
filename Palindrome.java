package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		String str1="hyuk";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		if(str1.equals(str2))
			System.out.println(str1 +" " + str2 + " is a Palindrome");
		else
			System.out.println(str1 +" " + str2 + " is not a palindrome");
		// TODO Auto-generated method stub

	}
	

}
