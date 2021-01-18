package interview_Test;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_String {

	public static void main(String[] args) {
		
		String name = "Welcome to Test Yantra";
		
				Set<Character> set = new HashSet<Character>();
					
					StringBuffer sb = new StringBuffer();
					
					for (int i = 0; i < name.length(); i++) {
						
							Character ch = name.charAt(i);
						
							if (!set.contains(ch)) {
								
									set.add(ch);
									
									sb.append(ch);
			}
		}
		       System.out.println(sb);
	}

}
