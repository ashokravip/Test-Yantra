package interview_Test;

public class Swapping_String {

	public static void main(String[] args) {
		
			String name = "Welcome to Test Yantra";
			
			String res = "";
			
			String[] words= name.split(" ");
		
			String res1= "";
			
			for (int i = 1; i < words.length-1; i++) {
				
				res1=res1+" "+words[i];
				
			}
			
			res = words[words.length-1]+" "+res1+" "+words[0];
			
			System.out.println(res);	
			
	}

}
