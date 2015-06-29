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
		int[] a = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			a[i]=s.charAt(i);
		}
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) 
					return false;
			}
		}
		return true;
	}

}