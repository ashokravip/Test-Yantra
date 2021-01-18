package interview_Test;

public class Reverse_The_String {

	public static void main(String[] args) {
		
			String name = "Welcome to Test Yantra";
		
	//Using StringBuffer.
			
				StringBuffer sb = new StringBuffer(name);
				System.out.println("Using StringBuffer---> " + sb.reverse().toString());
		
    //Using StringBuilder.
				
				StringBuilder sbr = new StringBuilder(name);
				System.out.println("Using StringBuilder---> " + sbr.reverse().toString());
		
	
		
	//Using SubString.
		
		if (name.length()==0)
		{
		System.out.println("Using SubString---> " + name.substring(1)+ name.charAt(0));
		}
		
	//Using Collection Object.
					
					char[] ch = name.toCharArray();
					String reversecharArray = ""; 
					for(int i= name.length()-1; i>=0;i--) {
						reversecharArray = reversecharArray+ch[i];
					}
					System.out.print("Using Collection Object---> " + reversecharArray);
					
					System.out.println();
					
	//Using ForLoop Method.
					
					for(int i= name.length()-1; i>=0;i--) {
						String reverse = ""; 
						char c = name.charAt(i);
						 reverse = reverse+c;
						 System.out.print(reverse);
					}
			
		

	}

}
