import java.util.*;
public class program1 {

	public static void main(String[] args) {
		String s = "";
		Scanner in = new Scanner(System.in);
		s = in.nextLine();

		if(check(s))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
	}

	public static boolean check(String s) {
		for(int i = 0; i < s.length()-1; i++) {
			for(int j = i+1; j < s.length(); j++) {
				int p = s.charAt(i);
				int q = s.charAt(j);
				if(p == q) 
					return false;
			}
		}
		return true;
	}

}