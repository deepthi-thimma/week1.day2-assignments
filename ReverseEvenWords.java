package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] test_arr = test.split(" ");
		for(int i=0;i<test_arr.length;i++) {
			if(i%2==0) {
				System.out.print(test_arr[i]+" ");	
			}
			else {
				char[] ch=test_arr[i].toCharArray();
				for(int j=test_arr[i].length()-1;j>=0;j--) {
					
					System.out.print(ch[j]);
				}
			}System.out.print(" ");
		}
		
		// TODO Auto-generated method stub

	}
}

