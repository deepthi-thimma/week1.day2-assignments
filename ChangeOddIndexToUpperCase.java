package week1.day2.assignments.mandatory;

import java.lang.reflect.Array;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		String result="";
		char[] test_arr=test.toCharArray();	
		for(int i=0;i<test_arr.length;i++) {
			if(i%2==1) {
			char x = Array.getChar(test_arr, i);
			char uc=Character.toUpperCase(x);
			result+=uc;
		}
			else {
				result+=test_arr[i];
			}
			

	}  
		System.out.println(result);
	}
}
