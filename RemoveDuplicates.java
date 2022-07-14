package week1.day2.assignments.mandatory;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
				int count=0;
				String new_text= "";
				String word="java";
				
		String[] text1=text.split(" ");
		
		for(int i=0;i<text1.length;i++) {
				if(text1[i].equals(word))
					count+=1;
				
			}
		if(count>1) {
			new_text=text.replace(word,"" );
			System.out.println(new_text);
			
			
			
		}
				
			
	    
		
			
		//}
		
		
		// TODO Auto-generated method stub

	}

}
